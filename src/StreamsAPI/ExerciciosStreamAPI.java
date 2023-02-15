package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1","0","4", "1","2","3","9","9","6", "5");

        System.out.println("Imprima todos os elementos dessa lista de Strings: ");

        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

       /* numerosAleatorios.stream().forEach(s -> System.out.println(s)); */

      // numerosAleatorios.forEach(s -> System.out.println(s));

        numerosAleatorios.forEach(System.out::println);




        System.out.println("Pedgue os 5 ultimos primeiros numeros e coloque dentro de um Set: ");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros: ");

      /*  numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                Bora REDUZIR */

       // numerosAleatorios.stream()
        //        .map(s -> Integer.parseInt(s));
        //  Depois da um reference method na IDE

 /*       numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
FAZER DIFERENTE PQ TO FRESCO */

        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        

        System.out.println("Pegue os numero pares e maiores que 2 e os coloque em uma lista: ");
 /*       numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if (integer % 2 == 0 && integer > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList()).forEach(System.out::println);

                BORA REDUZIR
                */

        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("Mostre a média: ");
/*        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double value) {
                        System.out.println(value);
                    }
                });
        BORA REDUZIR DNOVO*/

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("Remova os numeros impares: ");
        collectList.removeIf(integer -> (integer % 2 != 0));
        System.out.println(collectList);






    }
}
