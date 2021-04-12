package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PessoaMapper {

    @Mapping(source = "nomeDto", target = "nome")
    @Mapping(source = "segundoNomeDto", target = "segundoNome")
    @Mapping(source = "ultimoNomeDto", target = "ultimoNome")
    @Mapping(source = "cpfDto", target = "cpf")
    @Mapping(source = "sexualidadeDto", target = "sexualidade")
    @Mapping(target = "id", ignore = true)
    Pessoa pessoaDtoToPessoa(PessoaDTO pessoaDTO);
}
