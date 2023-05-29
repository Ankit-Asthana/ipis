package org.example;

//
//public class UserClient {
//
//    public static void main(String[] args) throws Exception {
//        final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
//                .usePlaintext()
//                .build();
//
//        UserMessage request = UserMessage.newBuilder().setName("Module2").build();
//        UserResponse response;
//        try {
//            response = UserServiceGrpc.newBlockingStub(channel).sayHello(request);
//            System.out.println(response.getMessage());
//        } catch (StatusRuntimeException e) {
//            return;
//        } finally {
//            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
//        }
//    }
//}

//import helloworld.GreetingServiceGrpc;
//import helloworld.RequestMessage;
//import helloworld.ResponseMessage;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import io.grpc.StatusRuntimeException;
//
//import java.util.concurrent.TimeUnit;
//
//public class UserClient {
//
//    public static void main(String[] args) throws Exception {
//        final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8088)
//                .usePlaintext()
//                .build();
//
//        RequestMessage request = RequestMessage.newBuilder().setName("gRPC module").build();
//        ResponseMessage response;
//        try {
//            response = GreetingServiceGrpc.newBlockingStub(channel).sayHello(request);
//            System.out.println(response.getMessage());
//        } catch (StatusRuntimeException e) {
//            return;
//        } finally {
//            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
//        }
//    }
//}
//
