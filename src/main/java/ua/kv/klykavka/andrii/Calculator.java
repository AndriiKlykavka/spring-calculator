package ua.kv.klykavka.andrii;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public float add(float a, float b) {
        return a + b;
    }
    public float subtract(float a, float b) {
        return a - b;
    }
    public float multiply(float a, float b) {
        return a * b;
    }
    public float divide(float a, float b) {
        return a / b;
    }
}
