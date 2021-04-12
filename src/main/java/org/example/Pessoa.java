package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Builder.Default
    private UUID id = UUID.randomUUID();
    private String nome;
    private String segundoNome;
    private String ultimoNome;
    private String cpf;
    private ESexo sexualidade;
    private Integer idade;
}
