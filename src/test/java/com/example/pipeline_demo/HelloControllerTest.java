package com.example.pipeline_demo;

import com.example.pipeline_demo.controller.HelloController;
import com.example.pipeline_demo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void testHello() {
        CalculatorService mockService = mock(CalculatorService.class);
        HelloController controller = new HelloController(mockService);

        String response = controller.hello();
        assertEquals("Hello Pipeline", response);
    }


    @Test
    void testAdd() {
        CalculatorService mockService = mock(CalculatorService.class);
        when(mockService.add(2,3)).thenReturn(5);

        HelloController controller = new HelloController(mockService);
        int result = controller.add(2,3);

        assertEquals(5, result);
    }
}
