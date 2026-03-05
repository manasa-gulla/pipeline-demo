package com.example.pipeline_demo;

import com.example.pipeline_demo.repository.CalculationRepository;
import com.example.pipeline_demo.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void testAdd() {

        CalculationRepository mockRepo = mock(CalculationRepository.class);

        CalculatorService calculatorService = new CalculatorService(mockRepo);

        int result = calculatorService.add(2,3);

        assertEquals(5,result);

        verify(mockRepo).save(any());
    }
}