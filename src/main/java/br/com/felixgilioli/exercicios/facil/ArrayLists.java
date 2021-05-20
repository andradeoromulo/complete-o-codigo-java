package br.com.felixgilioli.exercicios.facil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe com métodos para trabalhar com listas do tipo {@link java.util.ArrayList}.
 */
public class ArrayLists {

    private ArrayLists() {}

    /**
     * Deve filtrar os elementos de {@param numeros} e retornar apenas os números que são impares.
     * @param numeros lista de inteiros.
     * @return lista de inteiros apenas com números impares.
     */
    public static List<Integer> getImpares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());
    }

    /**
     * Deve retornar a quantidade de pessoas que começam com a letra {@param letra}
     * @param pessoas lista contendo o nome das pessoas, ex: ["Felix", "Daiane"].
     * @param letra letra na qual deve você retornar a quantidade dos nomes que começam com ela, ex: "F"
     * @return quantidade de pessoas.
     */
    public static long getQuantidadeDePessoasQueComecamComALetra(List<String> pessoas, String letra) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.startsWith(letra))
                .count();
    }

    /**
     * Deve fazer a leitura de um valor inteiro.{@param valorEntrada}
     * Em seguida, calcule o menor número de notas possíveis(cédulas) onde o valor pode ser decomposto.
     * As notas que você deve considerar são de 100,50,20,10,5,2,1.
     * Na sequencia insira na ordem respetiva a demonstrada acima numa Lista de retorno a quantidade de cada cédula encontrada no calculo.
     * 
     * @param valorEntrada Você receberá um valor inteiro N (0 < N < 1000000).
     * @return lista com a quantidade de cédulas encontradas para cada valor.
     */
    public static List<Integer> getMenorQuantidadeDeCedulasPossivelParaInteiro(int valorEntrada) {
        List<Integer> quantidadeDeCedulas = new ArrayList<>();

        // Lógica de resolução
        int atual = valorEntrada;
        int cedulas100 = atual / 100;
        atual -= cedulas100 * 100;
        int cedulas50 = atual / 50 ;
        atual -= cedulas50 * 50 ;
        int cedulas20 = atual / 20 ;
        atual -= cedulas20 * 20  ;
        int cedulas10 = atual / 10 ;
        atual -=  cedulas10 * 10 ;
        int cedulas5 = atual / 5;
        atual -= cedulas5 * 5;
        int cedulas2 = atual / 2;
        atual -= cedulas2 * 2;
        int cedulas1 = atual;

        // Montagem da Lista
        quantidadeDeCedulas.add(cedulas100);
        quantidadeDeCedulas.add(cedulas50);
        quantidadeDeCedulas.add(cedulas20);
        quantidadeDeCedulas.add(cedulas10);
        quantidadeDeCedulas.add(cedulas5);
        quantidadeDeCedulas.add(cedulas2);
        quantidadeDeCedulas.add(cedulas1);

        return quantidadeDeCedulas;
    }
}
