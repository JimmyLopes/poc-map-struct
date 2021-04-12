package org.example;

import javax.annotation.Generated;
import org.example.Pessoa.PessoaBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-11T14:09:46-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class PessoaMapperImpl implements PessoaMapper {

    @Override
    public Pessoa pessoaDtoToPessoa(PessoaDTO pessoaDTO) {
        if ( pessoaDTO == null ) {
            return null;
        }

        PessoaBuilder pessoa = Pessoa.builder();

        pessoa.ultimoNome( pessoaDTO.getUltimoNomeDto() );
        pessoa.cpf( pessoaDTO.getCpfDto() );
        pessoa.segundoNome( pessoaDTO.getSegundoNomeDto() );
        pessoa.nome( pessoaDTO.getNomeDto() );
        pessoa.sexualidade( pessoaDTO.getSexualidadeDto() );
        pessoa.idade( pessoaDTO.getIdade() );

        return pessoa.build();
    }
}
