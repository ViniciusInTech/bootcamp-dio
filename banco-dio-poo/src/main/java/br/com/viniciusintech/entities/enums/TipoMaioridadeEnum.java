package br.com.viniciusintech.entities.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TipoMaioridadeEnum {
    MAIORIDADE_CIVIL(18),
    MAIORIDADE_PENAL(18),
    MAIORIDADE_ELEITORAL(16);

    private final Integer actualValue;
}