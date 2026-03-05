package com.example.pipeline_demo.entity;

import jakarta.persistence.*;

@Entity
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int a;
    private int b;
    private int result;

    public Calculation() {}

    public Calculation(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResult() {
        return result;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setResult(int result) {
        this.result = result;
    }
}