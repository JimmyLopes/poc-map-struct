package org.example;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private String nomeDto;
    private String segundoNomeDto;
    private String ultimoNomeDto;
    private String cpfDto;
    private ESexo sexualidadeDto;
    private Integer idade;
}
