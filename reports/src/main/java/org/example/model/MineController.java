package org.example.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MineController {

    @Autowired
    private JSONParser jsonParser;

    @PostMapping("/addition")
    public Object performAddition(@RequestBody String jsonRequest) throws ParseException {
        MyClient myClient = new MyClient();
        JSONObject requestObj = (JSONObject) jsonParser.parse(jsonRequest);
        JSONArray params = (JSONArray) requestObj.get("params");
        String a = params.get(0).toString();
        int b = Integer.parseInt(a);
        String c = params.get(1).toString();
        int d = Integer.parseInt(c);
        return myClient.add(b,d);
    }
}
