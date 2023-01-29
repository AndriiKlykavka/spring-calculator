package ua.kv.klykavka.andrii;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import ua.kv.klykavka.andrii.configs.BeanConfig;

public class CalculatorApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = context.getBean("user", User.class);
        Calculator calculator = context.getBean("calculator", Calculator.class);
        float a = 10;
        float b = 5;
        System.out.println(user.doAdd(a, b));
        System.out.println(user.doSubtract(b, a));
        System.out.println(user.doMultiply(a, b));
        System.out.println(user.doDivide(a, b));
    }
}
