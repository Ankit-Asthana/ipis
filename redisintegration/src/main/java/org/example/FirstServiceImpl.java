package org.example;

import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    @Override
    public int add(int a, int b) {
            return a + b;
    }

//    @Override
//    public int subtract(int a, int b){
//        return a-b;
//    }
}
