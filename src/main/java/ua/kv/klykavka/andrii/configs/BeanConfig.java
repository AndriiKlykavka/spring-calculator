package ua.kv.klykavka.andrii.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.kv.klykavka.andrii.Calculator;
import ua.kv.klykavka.andrii.User;
import ua.kv.klykavka.andrii.commands.*;

@Configuration
public class BeanConfig {

    @Bean(name="user")
    public User getUser() {
        return new User();
    }

    @Bean(name="calculator")
    public Calculator getCalculator() {
        return new Calculator();
    }

    @Bean(name="add")
    public Command getAdd() {
        return new AddCommand();
    }

    @Bean(name="subtract")
    public Command getSubtract() {
        return new SubtractCommand();
    }

    @Bean(name="multiply")
    public Command getMultiply() {
        return new MultiplyCommand();
    }

    @Bean(name="divide")
    public Command getDivide() {
        return new DivideCommand();
    }
}
