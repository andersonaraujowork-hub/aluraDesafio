import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int operacao = 0;

        System.out.println("**********************************");
        System.out.println("\nNome do Cliente :"+nome);
        System.out.println("Tipo conta: "+tipoConta);
        System.out.println("Saldo autal:"+saldo);
        System.out.println("**********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consulta valor
                2- Transferir Valor
                3- Receber Valor
                4- Sair
                
                """;
        Scanner leitura = new Scanner(System.in);
        while(operacao != 4){
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao ==1){
                System.out.println("O saldo atualizado é "+saldo);
            }else if(operacao == 2){
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo indisponivel");
                }else{
                    saldo -= valor;
                    System.out.println("Novo saldo "+saldo);
                }
            }else if(operacao == 3){
                System.out.println("Valor recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo "+saldo);
            }else if(operacao != 4){
                System.out.println("Opção invalida");

                
            }
        }

    }
}
