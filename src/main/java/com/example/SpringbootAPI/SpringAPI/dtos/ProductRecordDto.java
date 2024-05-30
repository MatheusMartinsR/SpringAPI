package com.example.SpringbootAPI.SpringAPI.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(Long id, @NotBlank String nome, @NotNull String valor) {
}
