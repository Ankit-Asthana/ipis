//package org.example;
//
//import io.grpc.stub.StreamObserver;
//import org.springframework.stereotype.Service;
//import user.UserMessage;
//import user.UserResponse;
//import user.UserServiceGrpc;
//
//@Service
//public class Services extends UserServiceGrpc.UserServiceImplBase {
//    @Override
//    public void sayHello(UserMessage req, StreamObserver<UserResponse> responseObserver) {
//        String greeting = "Hello, " + req.getName() + "!";
//        UserResponse response = UserResponse.newBuilder().setMessage(greeting).build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//    @Override
//    public void sayHello(UserMessage req) {
//        String greeting = "Hello, " + req.getName() + "!";
//        UserResponse response = UserResponse.newBuilder().setMessage(greeting).build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//}