package jr.springframework.sfgdi.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController controller;

    @BeforeEach
    public void setUp() {
        controller = new PropertyInjectedController();
    }

    @Test
    public void testKrijgGroet() {
        Assertions.assertThat(controller.krijgGroet()).isEqualTo("Hallo Wereld!");
    }
}
