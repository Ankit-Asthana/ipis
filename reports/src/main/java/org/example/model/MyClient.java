package org.example.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class MyClient {
    private final RestTemplate restTemplate;


    public MyClient() {
        this.restTemplate = new RestTemplate();
    }

    public Object add(int a, int b) throws ParseException {
        // Build the JSON-RPC request
        JSONParser jsonParser = new JSONParser();
        JSONObject requestObj = new JSONObject();
        requestObj.put("jsonrpc", "2.0");
        requestObj.put("method", "add");
        JSONArray params = new JSONArray();
        params.add(a);
        params.add(b);
        requestObj.put("params", params);
        requestObj.put("id", "1");

        // Set the request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Send the JSON-RPC request
        HttpEntity<String> requestEntity = new HttpEntity<>(requestObj.toJSONString(), headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:8083/jsonrpc", HttpMethod.POST, requestEntity, String.class);

        // Parse the JSON-RPC response
        JSONObject responseObj = (JSONObject) jsonParser.parse(responseEntity.getBody());
        return responseObj;
    }
}

