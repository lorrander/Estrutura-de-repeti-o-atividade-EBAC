import java.util.Scanner;

public class BancoEletronico {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bem vido a caixa eletronico!!");
        int op;
        double saldo = 1000;
        do {


            System.out.println("\nseu saldo atual é de:" + saldo);
            System.out.println("\npara sacar presione 1 ");
            System.out.println("\npara consultar saldo presione 2");
            System.out.println("\npara fazer um deposito precione 3");
            System.out.println("\npara fazer um deposito precione 3");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("quanto desseja sacar ?  ");
                    double saq = sc.nextDouble();
                    if (saq <= saldo) {
                        saldo=saldo-saq;

                        System.out.println("Saque concluido!!\n\n seu saldo atual é de " + saldo);




                    } else {
                        System.out.println("Saldo insuficiente!! ");
                        break;
                    }
                case 2:
                    System.out.println("seu saldo atual é: " +saldo+ "R$");
                    break;
                case 3:

                    System.out.println("Qual sera o valor de deposito ?");
                    double dep = sc.nextDouble();
                    if (dep > 0) {
                        saldo = dep + saldo;
                        System.out.println("Deposito conluido seu saldo atual é de: " + saldo);
                    } else {
                        System.out.println("O valor digitado não pode ser depositado, por favor tente novamente");
                        break;
                    }
                case 4:
                    System.out.println("obrigado  por ussar nosso banco");
                    break;1
                default:
                    System.out.println("opção onvalida tente novamente!!!");


            }
        }while (op!=4);

            sc.close();

    }

}
