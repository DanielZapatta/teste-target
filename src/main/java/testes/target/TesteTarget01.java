package testes.target;

public class TesteTarget01 {
    public static void main(String[] args) {

        int indice = 12, soma = 0, K = 1;

        while (K < indice) {
            K = K +1; soma = soma + K;

            System.out.println(soma);
        }

        // No final do processo, é notado que o valor de soma é 77 pois
        // A cada iteração, o valor de K é incrementado em 1 e somado ao valor de soma.

    }
}