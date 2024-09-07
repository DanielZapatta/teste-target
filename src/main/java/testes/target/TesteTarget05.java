package testes.target;

public class TesteTarget05 {
    public static void main(String[] args) {
        double distanciaTotal = 125; // em km
        double velocidadeCarro = 90; // em km/h
        double velocidadeCaminhao = 80; // em km/h
        double tempoPedagio = 5 * 3 / 60.0; // 5 minutos por pedágio, 3 pedágios, convertido para horas

// a) Tempo de encontro sem considerar os pedágios
        double tempoEncontro = distanciaTotal / (velocidadeCarro + velocidadeCaminhao);

// b) Tempo de encontro considerando os pedágios
        double tempoEncontroComPedagio = tempoEncontro + tempoPedagio;

// c) Distância de cada veículo a Ribeirão Preto no momento do encontro
        double distanciaCarro = velocidadeCarro * tempoEncontroComPedagio;
        double distanciaCaminhao = velocidadeCaminhao * tempoEncontro;

// Verificar qual veículo está mais próximo de Ribeirão Preto
        String veiculoMaisProximo = distanciaCarro < distanciaCaminhao ? "Carro" : "Caminhão";

        System.out.println("O veículo mais próximo de Ribeirão Preto quando eles se encontrarem será o: " + veiculoMaisProximo);
    }

//    No momento em que o carro e o caminhão se encontram na rodovia, ambos estão
//    praticamente à mesma distância de Ribeirão Preto. No entanto, devido ao tempo
//    adicional que o carro perde nos pedágios, o caminhão estará ligeiramente mais
//    próximo de Ribeirão Preto. A diferença é pequena, mas significativa o suficiente
//    para que o caminhão esteja um pouco mais perto da cidade quando os dois se cruzarem.
}
