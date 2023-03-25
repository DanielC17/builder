public class PacienteBuilder {
    private Paciente paciente;

    public PacienteBuilder(){
        paciente = new Paciente();
    }

    public Paciente build(){
        if(paciente.getNome().equals("")){
            throw new IllegalArgumentException("Nome invalido!!");
        }
        if(paciente.getCpf().equals("")){
            throw new IllegalArgumentException("CPF invalido!!");
        }
        return paciente;
    }

    public PacienteBuilder setNome(String nome){
        paciente.setNome(nome);
        return this;
    }

    public PacienteBuilder setCpf(String cpf){
        paciente.setCpf(cpf);
        return this;
    }

    public PacienteBuilder setPlanoDeSaude(String planoDeSaude){
        paciente.setPlanoDeSaude(planoDeSaude);
        return this;
    }

    public PacienteBuilder setDataNascimento(String dataNascimento){
        paciente.setDataNascimento(dataNascimento);
        return this;
    }

    public PacienteBuilder setTipoSanguinio(String tipoSanguinio){
        paciente.setTipoSanguinio(tipoSanguinio);
        return this;
    }

    public PacienteBuilder setCelular(String celular){
        paciente.setCelular(celular);
        return this;
    }


}
