package testes.target;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class TesteTarget03 {
    public static void main(String[] args) {
        Double[] faturamento = new Double[365];
        Random random = new Random();

        // Preenche o array com valores de faturamento
        for (int i = 0; i < faturamento.length; i++) {
            // 10% de chance de um dia não ter faturamento
            if (random.nextInt(10) == 0) {
                faturamento[i] = null;
            } else {
                faturamento[i] = Math.random() * 1000;
            }
        }

        // Filtra os valores nulos (dias sem faturamento)
        Double[] faturamentoComValores = Arrays.stream(faturamento)
                .filter(valor -> valor != null)
                .toArray(Double[]::new);

        // Calcula o faturamento mínimo e máximo
        Double minFaturamento = Arrays.stream(faturamentoComValores).min(Double::compare).orElse(null);
        Double maxFaturamento = Arrays.stream(faturamentoComValores).max(Double::compare).orElse(null);

        // Calcula o faturamento médio
        OptionalDouble faturamentoMedio = Arrays.stream(faturamentoComValores).mapToDouble(valor -> valor).average();

        // Conta o número de dias com faturamento acima da média
        long numDiasAcimaDaMedia = Arrays.stream(faturamentoComValores)
                .filter(valor -> valor > faturamentoMedio.getAsDouble())
                .count();

        System.out.println("Faturamento mínimo: " + String.format("%.2f", minFaturamento));
        System.out.println("Faturamento máximo: " + String.format("%.2f", maxFaturamento));
        System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaDaMedia);
    }
}