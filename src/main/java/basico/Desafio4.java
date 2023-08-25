package codigo.basico;

import java.util.Scanner;

public class Desafio4{
    public static void main(String[] args) {
        int podsPorNode = 10;
        int podsPorServidor = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número total de pods");
        int numeroTotalPods = scanner.nextInt();

        int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods/podsPorNode);
        int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods/podsPorServidor);

        if(numeroMinimoNodes <= 1 || numeroMinimoServidores <= 1 ){
            System.out.println("1.Recomendamos usar um unico node");
            System.out.println("2.Numero minimo de servidores:"+ numeroMinimoServidores);
        }else{
            System.out.println("1.Numero minimo de nodes:"+numeroMinimoNodes);
            System.out.println("2.Numero minimo de servidores:"+numeroMinimoServidores);
        }
        scanner.close();
    }
}


