package co.josias;

class Cliente extends Pessoa {

    private int quantidadeCompras;
    private double precoCompras;

    public double calcularDesconto() {
        if (quantidadeCompras > 10 && quantidadeCompras <= 20) {
            precoCompras -= 0.10 * precoCompras;
            System.out.println("O cliente obteve 10% de desconto.");
        }
        if (quantidadeCompras > 20) {
            precoCompras -= 0.20 * precoCompras;
            System.out.println("O cliente obteve 20% de desconto.");
        }

        return precoCompras;
    }

    public int getQuantidadeCompras() {
        return quantidadeCompras;
    }

    public void setQuantidadeCompras(int quantidadeCompras) {
        this.quantidadeCompras = quantidadeCompras;
    }

    public double getPrecoCompras() {
        return precoCompras;
    }

    public void setPrecoCompras(double precoCompras) {
        this.precoCompras = precoCompras;
    }

    public Cliente(int quantidadeCompras, double precoCompras, String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        //        this.quantidadeCompras = quantidadeCompras;
        setQuantidadeCompras(quantidadeCompras);
//        this.precoCompras = precoCompras;
        setPrecoCompras(precoCompras);
        this.nome = nome;
        setTelefone(telefone);
        setEndereco(endereco);
    }
    
    
}