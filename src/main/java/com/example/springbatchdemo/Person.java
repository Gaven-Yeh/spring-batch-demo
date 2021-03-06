package com.example.springbatchdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
}
