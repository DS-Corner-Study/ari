package com.springboot.relationship.data.dto;

public class ChangeProductNameDto {
    private static Long number;
    private static String name;

    public ChangeProductNameDto(Long number, String name){
        this.number =number;
        this.name=name;
    }
    public ChangeProductNameDto(){}

    public Long getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
