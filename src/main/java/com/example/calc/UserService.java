package com.example.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserService {
        private final Map<String, OperationService> services;

        @Autowired
        public UserService(Map<String, OperationService> services) {
            this.services = services;
        }

        public void calculateResult(String type) {
            OperationService service = services.get(type);

            if (service != null) {
                service.result(10, 5);
            } else {
                System.out.println("Invalid operation type: " + type);
            }
        }
    }
