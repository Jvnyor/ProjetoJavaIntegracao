package co.josias;

import static co.josias.Pessoa.setEndereco;

class Endereco {
    private static String rua;
    private static String numero;
    private static String cep;
    private static String bairro;
    private static String cidade;
    private static String uf;

    public static void main(String[] args) {
        
    }
    
    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        Endereco.rua = rua;
    }

    public static String getNumero() {
        return numero;
    }

    public static void setNumero(String numero) {
        Endereco.numero = numero;
    }

    public static String getCep() {
        return cep;
    }

    public static void setCep(String cep) {
        Endereco.cep = cep;
    }
    
    public static String getBairro() {
        return bairro;
    }
    
    public static void setBairro(String bairro) {
        Endereco.bairro = bairro;
    }
    
    public static String getCidade() {
        return cidade;
    }
    
    public static void setCidade(String cidade) {
        Endereco.cidade = cidade;
    }
    
    public static String getUf() {
        return uf;
    }
    
    public static void setUf(String uf) {
        Endereco.uf = uf;
    }
    
    public Endereco(String rua, String numero, String cep, String bairro, String cidade, String uf) {
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
        setCep(cep);
        setCidade(cidade);
        setUf(uf);
        
        setEndereco(Endereco.getRua() + ", " + Endereco.getNumero() + ", " + Endereco.getBairro() + ", " + Endereco.getCidade() + " - " + Endereco.getUf() + " CEP: " + Endereco.getCep());
    }

}