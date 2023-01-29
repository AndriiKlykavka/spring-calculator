package ua.kv.klykavka.andrii.commands;

import org.springframework.beans.factory.annotation.Autowired;
import ua.kv.klykavka.andrii.Calculator;

public class SubtractCommand implements Command{

    @Autowired
    private Calculator calculator;

    @Override
    public float execute(float a, float b) {
        return calculator.subtract(a, b);
    }
}
