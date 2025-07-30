import java.util.Scanner;

public class AtividadeEsturturaDeRepeticaoPT1 {
    public static void main(String[] args) {
        nomeNumero();
    }

    public static void nomeNumero() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem-vindo! Por favor, digite o seu nome:");
        String nome = sc.next();

        System.out.println("Agora digite um número positivo para fazermos a contagem crescente e decrescente:");
        int nu1 = sc.nextInt();

        if (nu1 > 0) {

            System.out.println("\nAqui está a contagem de forma crescente de 0 até " + nu1 + ":");
            for (int i = 0; i <= nu1; i++) {
                System.out.println(i);
            }


            System.out.println("\nAqui está a contagem de forma decrescente de " + nu1 + " até 0:");
            for (int i = nu1; i >= 0; i--) {
                System.out.println(i);
            }


            System.out.println("\nExibindo o nome:");
            if (nome.length() > 6) {
                for (int i = 0; i < nu1; i++) {
                    System.out.println(nome);
                }
            } else {
                System.out.println(nome);
            }

        } else {
            System.out.println("Número inválido!!");
        }

        sc.close();
    }



            }






