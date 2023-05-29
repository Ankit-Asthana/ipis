package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import user.UserMessage;
import user.UserResponse;
import user.UserServiceGrpc;

@Service
public class ModuleAService {
    private final UserServiceGrpc.UserServiceBlockingStub moduleBService;
    public ModuleAService() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8084)
                .usePlaintext()
                .build();
        this.moduleBService = UserServiceGrpc.newBlockingStub(channel);
    }

    public String sayHello(String name) {
        user.UserMessage request = UserMessage.newBuilder().setName(name).build();
        UserResponse response = moduleBService.sayHello(request);
        return response.getMessage();
    }
}