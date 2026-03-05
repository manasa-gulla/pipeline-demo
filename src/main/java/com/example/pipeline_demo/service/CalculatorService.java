package com.example.pipeline_demo.service;

import com.example.pipeline_demo.entity.Calculation;
import com.example.pipeline_demo.repository.CalculationRepository;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final CalculationRepository repository;

    public CalculatorService(CalculationRepository repository) {
        this.repository = repository;
    }

    public int add(int a, int b) {

        int result = a + b;

        Calculation calculation = new Calculation(a,b,result);

        repository.save(calculation);

        return result;
    }
}