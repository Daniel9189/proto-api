package com.course.cqrs.proto_api.models;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class Person {
    private String id;

    private String fullName;

    private LocalDate birthDate;

    private Integer age;
}
