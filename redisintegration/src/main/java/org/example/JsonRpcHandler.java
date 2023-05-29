package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

@Component
public class JsonRpcHandler {
    private final FirstService myService;
    private final JSONParser jsonParser;

    public JsonRpcHandler(FirstService myService) {
        this.myService = myService;
        this.jsonParser = new JSONParser();
    }

    public Object handleRequest(String jsonRequest) throws ParseException {
        JSONObject requestObj = (JSONObject) jsonParser.parse(jsonRequest);
        JSONObject errorObj = new JSONObject();
        JSONObject responseObj = new JSONObject();
        try {
            // Parse the JSON-RPC request

            // Get the method and parameters from the request
//            String method = (String) requestObj.get("method");
            JSONArray params = (JSONArray) requestObj.get("params");
            String a = params.get(0).toString();
            int b = Integer.parseInt(a);
            String c=params.get(1).toString();
            int d=Integer.parseInt(c);
            // Invoke the method on the service
//            int result = myService.add(params.get(0), params.get(1));
            int result=myService.add(b,d);

            int id = Integer.parseInt(requestObj.get("id").toString());


            // Build the JSON-RPC response
            responseObj.put("jsonrpc", "2.0");
            responseObj.put("result", result);
            responseObj.put("id", id);

            // Return the JSON-RPC response
        } catch (Exception e) {
            // Handle any exceptions that occur during the request handling
            // and return an error response.

            errorObj.put("code", -1);
            errorObj.put("message", e.getMessage());


            responseObj.put("jsonrpc", "2.0");
            responseObj.put("error", errorObj);
            responseObj.put("id", null);

        }
        return responseObj.toJSONString();
    }
}
