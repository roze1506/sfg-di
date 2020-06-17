package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.ConstructorGreetingService;
import jr.springframework.sfgdi.services.GreetingService;
import jr.springframework.sfgdi.services.SetterBasedGreetingService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterBasedControllerTest {

    private SetterBasedController controller;

    @BeforeEach
    public void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new SetterBasedGreetingService());
    }

    @Test
    public void testKrijgGroet() {
        Assertions.assertThat(controller.krijgGroet()).isEqualTo("Hallo Wereld vanuit Setter!");
    }

}
