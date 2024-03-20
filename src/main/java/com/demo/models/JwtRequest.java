package com.demo.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {

    private String email;

    private String password;

}
