//package org.example.model;
//
//
//import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
//import org.springframework.stereotype.Service;
//
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class SecondService {
//    public int callModuleA() throws Throwable {
//        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8083/json-rpc"));
//        Map<String, Integer> params = new HashMap<>();
//        params.put("a", 5);
//        params.put("b", 3);
//        return client.invoke("multiply", params, Integer.class);
//    }
//
//    public int callModuleAA() throws Throwable{
//        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8083/json-rpc"));
//        Map<String , Integer> params = new HashMap<>();
//        params.put("a",10);
//        params.put("b",5);
//        return client.invoke("subtract",params, Integer.class);
//    }
//}
//
