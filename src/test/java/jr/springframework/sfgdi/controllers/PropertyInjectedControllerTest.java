package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;
import jr.springframework.sfgdi.services.GreetingServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController controller;

    @BeforeEach
    public void setUp() {
        controller = new PropertyInjectedController();
        ReflectionTestUtils.setField(controller, "greetingService", new GreetingServiceImpl());
    }

    @Test
    public void testKrijgGroet() {
        Assertions.assertThat(controller.krijgGroet()).isEqualTo("Hallo Wereld!");
    }
}
