package org.example;


import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private final FirstService myService;

    @Autowired
    public MyController(FirstService myService) {
        this.myService = myService;
    }

    @Autowired
    private JsonRpcHandler jsonRpcHandler;
    @PostMapping("/jsonrpc")
    public Object handleJsonRpcRequest(@RequestBody String jsonRequest) throws ParseException {
        // Parse the JSON-RPC request and invoke the appropriate method
        // using the myService instance.
        // Build the JSON-RPC response and return it.
        return jsonRpcHandler.handleRequest(jsonRequest);
    }
}

