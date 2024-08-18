package com.springjpa.SpringDataJpa.student;

public record StudentResponseDto(
        String firstName,
        String lastName,
        String email
) {
}
