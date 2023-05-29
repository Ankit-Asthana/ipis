//package org.example;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class JsonRpcController {
//    private final FirstService firstService;
//
//    @Autowired
//    public JsonRpcController(FirstService firstService) {
//        this.firstService = firstService;
//    }
//
////    @PostMapping(value = "/json-rpc", consumes = "application/json", produces = "application/json")
////    @ResponseBody
////    public JsonNode handleRequest(@RequestBody String requestBody) throws Exception {
////        ObjectMapper objectMapper = new ObjectMapper();
////        JsonRpcServer jsonRpcServer = new JsonRpcServer(objectMapper, firstService, FirstService.class);
////        return objectMapper.readTree(jsonRpcServer.handle(requestBody));
////    }
//
//
//}
//
//
//
//
//
//
//@RestController
//public class JsonRpcController {
//    private final FirstService firstService;
//
//    public JsonRpcController(FirstService firstService) {
//        this.firstService = firstService;
//    }
//
//    @PostMapping(value = "/json-rpc",consumes = "application/json", produces = "application/json")
//    public JsonNode handleRequest(@RequestBody String requestBody) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonRpcRequest jsonRpcRequest = objectMapper.readValue(requestBody, JsonRpcRequest.class);
//        JsonRpcResponse jsonRpcResponse = new JsonRpcResponse();
//        jsonRpcResponse.setId(jsonRpcRequest.getId());
//
//        try {
//            String methodName = jsonRpcRequest.getMethod();
//            JsonNode paramsNode = jsonRpcRequest.getParams();
//            int a = paramsNode.get(0).asInt();
//            int b = paramsNode.get(1).asInt();
//
//            if ("callModuleA".equals(methodName)) {
//                int result = firstService.multiply(a, b);
//                jsonRpcResponse.setResult(new IntNode(result));
//            } else if ("callModuleAA".equals(methodName)) {
//                int result = firstService.subtract(a, b);
//                jsonRpcResponse.setResult(new IntNode(result));
//            } else {
//                jsonRpcResponse.setError(new JsonRpcError(JsonRpcErrorCode.METHOD_NOT_FOUND));
//            }
//        } catch (Exception e) {
//            jsonRpcResponse.setError(new JsonRpcError(JsonRpcErrorCode.INTERNAL_ERROR));
//        }
//        return objectMapper.valueToTree(jsonRpcResponse);
//    }
//}



