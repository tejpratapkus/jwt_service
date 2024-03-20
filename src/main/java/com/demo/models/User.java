package com.demo.models;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userId;

    private String name;

    private String email;
}
