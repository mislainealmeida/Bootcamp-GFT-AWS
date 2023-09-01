package codigo.basico;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de servidores");
        int quantidadeServidores = scanner.nextInt();
        System.out.println("Digite a quantidade de banco de dados");
        int quantidadeBancosDados = scanner.nextInt();
        double custoTotal= calcularCustoTotal (calcularCustoBD(custoPorHoraBancoDados, quantidadeBancosDados), calcularCustoServidor(custoPorHoraServidor, quantidadeServidores));


        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        scanner.close();
    }

    public static double calcularCustoBD(double custoPorHoraBancoDados,double  quantidadeBancosDados){
        return custoPorHoraBancoDados * quantidadeBancosDados;

    }

    public static double calcularCustoServidor(double custoPorHoraServidor,double  quantidadeServidores){
        return custoPorHoraServidor * quantidadeServidores;

    }

    public static double calcularCustoTotal(double calcularCustoBD, double calcularCustoServidor){
        return calcularCustoBD + calcularCustoServidor;

    }
}