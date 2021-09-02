package co.josias;

class Funcionario extends Pessoa {

    private int salario;
    private Object TipoContrato;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Object getContrato() {
        return this.TipoContrato;
    }

    public void setTipoContrato(Object tipoContrato) {
        TipoContrato = tipoContrato;
    }

    public int calcularRemuneracao() {
        if (getContrato().equals(String.valueOf(co.josias.TipoContrato.PJ))) {
            System.out.println("Salário padrão: " + getSalario());
            salario += (0.30 * salario);
            System.out.println("O funcionário obteve 30% de aumento salarial, devido à  modalidade de trabalho PJ.");
        }
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionário:\n" + "Nome do funcionário: " + super.getNome() +"\nTelefone: " + super.getTelefone() + "\nEndereço: " + super.getEndereco() + "\nSalário: " + salario + "\nTipo de contrato do funcionário: " + TipoContrato;
    }

    public Funcionario(int salario, Object TipoContrato, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.nome = nome;
        setTelefone(telefone);
        setSalario(salario);
        setTipoContrato(TipoContrato);
        setEndereco(getEndereco());
    }
}