package org.example.model;

import org.json.simple.parser.ParseException;

public class Class {
    public static void main(String[] args) throws ParseException {
        MyClient myClient=new MyClient();
        Object result=myClient.add(10,7);
        System.out.println(result);
    }
}
