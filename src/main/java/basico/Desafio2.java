package codigo.basico;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância física");
        double distanciaServidores = scanner.nextDouble();

        System.out.println("Digite a velocidade do plano");
        double velocidadePlano = scanner.nextDouble();

        //TODO: Calcule a velocidade de download estimada
        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        // Apresentar o resultado
        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

        scanner.close();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        double VD = velocidadePlano/(1+ distanciaServidores/100);
        return VD;

    }
}