package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import user.UserMessage;
import user.UserResponse;
import user.UserServiceGrpc;

import java.io.IOException;

//@GRpcService
@Service
public class UserService extends UserServiceGrpc.UserServiceImplBase{
    @Override
    public void sayHello(UserMessage req, StreamObserver<UserResponse> responseObserver) {
        String greeting = "Hello, " + req.getName() + "!";
        UserResponse response = UserResponse.newBuilder().setMessage(greeting).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Bean
    public Server moduleBServer() throws IOException {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(8084);
        return serverBuilder.addService(this).build().start();
//        System.out.println("Server Started on port 8083");
//        return serverBuilder.build().start();
    }
}

