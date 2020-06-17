package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterBasedControllerTest {

    private SetterBasedController controller;

    @BeforeEach
    public void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testKrijgGroet() {
        Assertions.assertThat(controller.krijgGroet()).isEqualTo("Hallo Wereld!");
    }

}
