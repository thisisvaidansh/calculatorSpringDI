package com.example.calc;

import org.springframework.stereotype.Component;

@Component
public class SubtractionService implements OperationService{
    @Override
    public void result(int a, int b) {
        System.out.println("Result: " + (a - b));
    }
}
