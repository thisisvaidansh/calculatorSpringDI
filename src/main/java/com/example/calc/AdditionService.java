package com.example.calc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AdditionService implements OperationService{

    @Override
    public void result(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
}
