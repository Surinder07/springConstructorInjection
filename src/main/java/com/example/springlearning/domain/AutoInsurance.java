package com.example.springlearning.domain;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class AutoInsurance implements IInsurance{
    private String type;
    private Double price;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
