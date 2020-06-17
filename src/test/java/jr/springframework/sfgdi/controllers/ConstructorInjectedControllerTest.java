package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    public void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testKrijgGroet() {
        Assertions.assertThat(controller.krijgGroet()).isEqualTo("Hallo Wereld!");
    }
}
