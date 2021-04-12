import org.example.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class PessoaTest {

    @Test
    public void testMapper() {
        PessoaDTO pessoaDTO = PessoaDTO.builder()
                .nomeDto("Jimmy")
                .segundoNomeDto("Botezine")
                .ultimoNomeDto("Lopes")
                .cpfDto("84700114053")
                .sexualidadeDto(ESexo.MASCULINO)
                .idade(25)
                .build();

        PessoaMapper mapper = new PessoaMapperImpl();
        Pessoa pessoa = mapper.pessoaDtoToPessoa(pessoaDTO);

        assertNotNull(pessoa);
        assertEquals(pessoa.getNome(), pessoaDTO.getNomeDto());
        assertEquals(pessoa.getSegundoNome(), pessoaDTO.getSegundoNomeDto());
        assertEquals(pessoa.getUltimoNome(), pessoaDTO.getUltimoNomeDto());
        assertEquals(pessoa.getCpf(), pessoaDTO.getCpfDto());
        assertEquals(pessoa.getSexualidade(), pessoaDTO.getSexualidadeDto());
        assertEquals(pessoa.getIdade(), pessoaDTO.getIdade());
        assertNotNull(pessoa.getId());
    }



}

