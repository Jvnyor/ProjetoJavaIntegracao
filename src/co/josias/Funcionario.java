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
            System.out.println("Sal�rio padr�o: " + getSalario());
            salario += (0.30 * salario);
            System.out.println("O funcion�rio obteve 30% de aumento salarial, devido � modalidade de trabalho PJ.");
        }
        return salario;
    }

    @Override
    public String toString() {
        return "Funcion�rio:\n" + "Nome do funcion�rio: " + super.getNome() +"\nTelefone: " + super.getTelefone() + "\nEndere�o: " + super.getEndereco() + "\nSal�rio: " + salario + "\nTipo de contrato do funcion�rio: " + TipoContrato;
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