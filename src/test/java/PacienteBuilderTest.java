import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PacienteBuilderTest {

    @Test
    void deveRetornarExecaoParaPacienteSemNome(){
        try{
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder.setCpf("12345667")
                    .setCelular("24 988789989")
                    .setPlanoDeSaude("Top")
                    .setDataNascimento("19/09/2000")
                    .setTipoSanguinio("0-")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Nome invalido!!", e.getMessage());
        }
    }

    @Test
    void deveRetornarExecaoParaPacienteSemCpf(){
        try{
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder.setNome("Lucas")
                    .setCelular("24 988789989")
                    .setPlanoDeSaude("Top")
                    .setDataNascimento("19/09/2000")
                    .setTipoSanguinio("0-")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("CPF invalido!!", e.getMessage());
        }
    }

    @Test
    void deveRetornarPacienteValido(){
        PacienteBuilder pacienteBuilder = new PacienteBuilder();
        Paciente paciente = pacienteBuilder.setNome("Lucas")
                .setCpf("1234567890")
                .setCelular("24 988789989")
                .setPlanoDeSaude("Top")
                .setDataNascimento("19/09/2000")
                .setTipoSanguinio("0-")
                .build();

        assertNotNull(paciente);

    }
}

