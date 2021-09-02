package co.josias;

class Pessoa {

    public String nome;
    private String telefone;
    private static String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static String getEndereco() {
        return endereco;
    }
    
    public static void setEndereco(String endereco) {
        Pessoa.endereco = endereco;
    } 
    
    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        setTelefone(telefone);
        setEndereco(endereco);
    }
    
}