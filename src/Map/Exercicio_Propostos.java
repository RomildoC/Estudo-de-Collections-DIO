package Map;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class Exercicio_Propostos {

    public static void main(String[] args) {


        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> população = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(população.toString());
        System.out.println("");




        System.out.println("Substitua a população do estado RN por : 3.534.165");
        população.put("RN", 3534165);
        System.out.println(população.toString());
        System.out.println("");


        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        população.put("PB", 4039277);
        System.out.println(população.toString());
        System.out.println("");



        System.out.println("Exiba a população do estado PE: ");
        System.out.println(população.get("PE").toString());
        System.out.println("");



        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> população2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(população2.toString());
        System.out.println("");



        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> população3 = new TreeMap<>(população);
        System.out.println(população3);



        System.out.println("Exiba o estado com o menor população e seu respectivo valor");
        Collection<Integer> populacao = população.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : população.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.println(estadoMenorPopulacao);
        System.out.println("");

        System.out.println("Exiba o estado com a maior população e seu respectivo valor");
        System.out.println(estadoMaiorPopulacao);
        System.out.println("");



        System.out.println("Exiba a soma da população desses estados: ");

        Iterator<Integer> iterator = população.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println(soma);
        System.out.println("");



        System.out.println("Exiba a média da população deste dicionário de estados: ");
        System.out.println(soma/(populacao.size()));
        System.out.println("");



        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = população.values().iterator();

        while(iterator1.hasNext()){
            if (iterator1.next() >= 4000000){
                iterator1.remove();
            }
        }
        System.out.println(população);
        System.out.println("");



        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        população.clear();
        população2.clear();
        população3.clear();


        System.out.println("... Limpo ...");
        System.out.println(população);
        System.out.println("");


        System.out.println("Confira se a lista está vazia: ");
        System.out.println(população.isEmpty());

    }
}

