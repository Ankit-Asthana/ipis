//package org.example;
//
//import com.github.koober.jsonrpc.JsonRpcHandlerMapping;
//import com.github.koober.jsonrpc.JsonRpcServiceExporter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class Module1Config {
//
//    @Bean
//    public Module1Service module1Service() {
//        return new Module1Service();
//    }
//
//    @Bean
//    public JsonRpcServiceExporter jsonRpcServiceExporter(Module1Service module1Service) {
//        JsonRpcServiceExporter exporter = new JsonRpcServiceExporter();
//        exporter.setService(module1Service);
//        exporter.setServiceInterface(Module1Service.class);
//        return exporter;
//    }
//
//    @Bean
//    public JsonRpcHandlerMapping jsonRpcHandlerMapping(JsonRpcServiceExporter jsonRpcServiceExporter) {
//        JsonRpcHandlerMapping handlerMapping = new JsonRpcHandlerMapping();
//        handlerMapping.setServiceExporter(jsonRpcServiceExporter);
//        return handlerMapping;
//    }
//}
