package codigo.basico;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de logs");
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine();

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
           // parts[0] = data e hora
           // parts[1] contém o nome do serviço AWS
           // parts[2] contém o log do evento.

            String servico = parts[1];
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        String maiorServico = Collections.max(eventosPorServico.entrySet(), Map.Entry.comparingByValue()).getKey();
        String menorServico = Collections.min(eventosPorServico.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((servico, quantidade) -> {
            System.out.println(servico + ":" + quantidade);
        });

        System.out.println("Maior:" + maiorServico);
        System.out.println("Menor:" + menorServico);
    }
}

