package co.josias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        
        int i = 0;
        while (i != 3) {
            System.out.println("==================MENU PRINCIPAL=================");
            System.out.println("Digite 1 para mostrar informações do funcionário.");
            System.out.println("Digite 2 para mostrar informações do cliente.");
            System.out.println("Digite 3 para sair.");
            Scanner in = new Scanner(System.in);
            i = in.nextInt();
            switch (i) {
                case 1:

                    int it = 0;
                    while (it != 3) {
                        System.out.println("\n=============MENU FUNCIONARIOS==============\n"
                                + "Cadastre e pesquise funcionários digitando 1\n"
                                + "Digite 2 para mostrar os funcionários atuais.\n"
                                + "Digite 3 para sair do menu dos funcionários.\n");
                        Scanner in2 = new Scanner(System.in);
                        it = in2.nextInt();
                        switch (it) {
                            case 1:
                                
                                Scanner digite = new Scanner(System.in);
                                System.out.println("Digite o nome do funcionário: \n");
                                String nome = digite.nextLine();
                                System.out.println("Digite o telefone do funcionário: \n");
                                String telefone = digite.nextLine();
                                System.out.println("Digite a rua do funcionário: \n");
                                String rua = digite.nextLine();
                                System.out.println("Digite o número da rua do funcionário: \n");
                                String numero = digite.nextLine();
                                System.out.println("Digite o bairro do funcionário: \n");
                                String bairro = digite.nextLine();
                                System.out.println("Digite a cidade do funcionário: \n");
                                String cidade = digite.nextLine();
                                System.out.println("Digite o UF do funcionário: \n");
                                String uf = digite.nextLine();
                                System.out.println("Digite o CEP do funcionário: \n");
                                String cep = digite.nextLine();
                                System.out.println("Digite o valor do salário: \n");
                                int salario = digite.nextInt();
                                System.out.println("Digite o tipo do contrato: \n");
                                String contrato = digite.nextLine();
                                String endereco = Funcionario.getEndereco();
                                Funcionario func1 = new Funcionario(salario, contrato, nome, telefone, endereco);
                                new Endereco(rua, numero, cep, bairro, cidade, uf);
                                System.out.println("Informações do funcionário:");
                                System.out.println("Nome do funcionário: "+ func1.nome);
                                System.out.println("Endereço: "+ func1.getEndereco());
                                System.out.println("Telefone: " + func1.getTelefone());
                                System.out.println("Tipo de contrato do funcionário: " + func1.getContrato());
                                System.out.println("Salário do funcionário: "+ func1.calcularRemuneracao());
                                System.out.println("");
                                listaFuncionarios.add(func1);
                                

                                System.out.println(listaFuncionarios.toString());
                                System.out.println("");
                                
                                Scanner selecao = new Scanner(System.in);
                                System.out.println("\nDeseja pesquisar um funcionário pelo nome? Digite 1 para sim e 2 para não: \n");
                                int sel = selecao.nextInt();
                                switch (sel) {
                                    case 1:
                                        Scanner search = new Scanner(System.in);
                                        System.out.println("Digite o nome do funcionário: ");
                                        String s = search.nextLine();
                                        int iterator = 0;
                                        while (iterator <= listaFuncionarios.size()) {
                                            if(listaFuncionarios.get(iterator).getNome().equals(s)) {
                                                System.out.println("Contém na lista: "+s);
                                                System.out.println(listaFuncionarios.toString());

//                                          break;
                                            }else{
                                                System.out.println(s + " não contém na lista: ");
                                                System.out.println(listaFuncionarios.toString());
//                                          break;
                                            }
                                            iterator++;
                                            break;
//                                          listaFuncionarios.contains(s);
                                        }
                                    break;
                                    case 2:
                                        System.out.println("\nOptou por nÃ£o pesquisar um funcionÃ¡rio.\n");
                                    break;
                                }
                                break;
                                case 2:
                                System.out.println(listaFuncionarios.toString());
                                System.out.println("");
                                break;
                                case 3:
                                System.out.println("Seleção de funcionários finalizada.");
                                System.out.println("");
                                break;
                        }
                    }

                    break;
                case 2:
                    Scanner digite4 = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente: \n");
                    String nomeCliente = digite4.next();
                    System.out.println("Digite a quantidade das compras: \n");
                    int qCompras = digite4.nextInt();
                    System.out.println("Digite o valor das compras: \n");
                    double vCompras = digite4.nextDouble();
                    System.out.println("Digite o telefone do cliente: \n");
                    String telCliente = digite4.next();
                    System.out.println("Digite a rua do cliente: \n");
                    String ruaCliente = digite4.next();
                    System.out.println("Digite o número da rua do cliente: \n");
                    String numCliente = digite4.next();
                    System.out.println("Digite o bairro do cliente: \n");
                    String bairroCliente = digite4.next();
                    System.out.println("Digite a cidade do cliente: \n");
                    String cidadeCliente = digite4.next();
                    System.out.println("Digite o UF do cliente: \n");
                    String ufCliente = digite4.next();
                    System.out.println("Digite o CEP do cliente: \n");
                    String cepCliente = digite4.next();
                    String endCliente = Funcionario.getEndereco();
                    Cliente cliente = new Cliente(qCompras, vCompras, nomeCliente, telCliente, endCliente);
                    new Endereco(ruaCliente, numCliente, cepCliente, bairroCliente, cidadeCliente, ufCliente);
//                  informações na tela
                    System.out.println("Informações do cliente:");
                    System.out.println("Nome do cliente: " + cliente.nome);
                    System.out.println("Telefone do cliente: " + cliente.getTelefone());
                    System.out.println("Endereço: "+ cliente.getEndereco());
                    System.out.println("Quantidade de compras: " + cliente.getQuantidadeCompras());
                    System.out.println("Preço das compras sem desconto: " + cliente.getPrecoCompras());
                    System.out.println("Preço das compras com desconto: " + cliente.calcularDesconto());
                    break;
                case 3:
                    System.out.println("Menu finalizado!");
                    break;
            }
        }
    }

}