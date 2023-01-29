package ua.kv.klykavka.andrii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.kv.klykavka.andrii.commands.Command;

@Component
public class User {
    @Autowired
    private Command add;

    @Autowired
    private Command subtract;

    @Autowired
    private Command multiply;

    @Autowired
    private Command divide;

    public float doAdd(float a, float b) {
        return add.execute(a, b);
    }

    public float doSubtract(float a, float b) {
        return subtract.execute(a, b);
    }

    public float doMultiply(float a, float b) {
        return multiply.execute(a, b);
    }

    public float doDivide(float a, float b) {
        return divide.execute(a, b);
    }
}
