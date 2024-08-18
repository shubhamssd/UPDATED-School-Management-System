package com.springjpa.SpringDataJpa.student;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record StudentDto(
        @NotEmpty
        String firstName,
        @NotEmpty
        String lastName,
        String email,

        Integer schoolId
) {
}
