package com.example.pipeline_demo.repository;

import com.example.pipeline_demo.entity.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}