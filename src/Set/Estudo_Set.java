package Set;

import java.util.*;

public class Estudo_Set {
    public static void main(String[] args) {

        System.out.println("Crie um conjuto e adcione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d, 3.6));
        System.out.println(notas.toString());

        /* System.out.println("Exiba a posição da nota 5.0: ");
        //não é possivel pois fica em ordem aleatória e nao temos um get no set //
        */

        /*System.out.println("Adcione na lista a nota 8.0 na posição 4: ");
        não da pra trabalhar com posições na collection SET
        */

        /*System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        Não é possivel fazer substituição na collection SET

        */

        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5d));

        /*System.out.println("Exiba a terceira nota adcionada: ");
        Não é possivel pois nao temos o GET na collection set
        */

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.printf("%.1f", soma , "%n%n");

        System.out.printf("%nExiba a média das notas: ");
        System.out.printf("%.2f%n", soma/ notas.size(), "%n");


        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        /*System.out.println("Remova a nota na posição 0");
        Não é possivel
        */

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);


        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto> ");
        notas.clear();
        notas2.clear();
        notas3.clear();

        System.out.println("Verifique se todo o conjunto está vazio: ");
        System.out.println("HashSet está vazia? " + notas.isEmpty());
        System.out.println("LinkedHashSet está vazia? " + notas2.isEmpty());
        System.out.println("TreeSet está vazia? " + notas3.isEmpty());



    }
}
