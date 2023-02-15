package Set;

import java.util.*;

public class Exercicio_Proposto {

    /*
    Crie um conjunto contendo as cores do arco Iris e:
    A- Exiba todas as cores uma baixo da outra
    B- A quantidade de cores que o arco-iris tem
    C- Exiba as cores em ordem alfabetica
    D- Exiba as cores na ordem inversa que foi informada
    E= Exiba todas as cores que começam com a letra "V"
    F- Exiba todas as cores que não começam com a letra "V"
    G- Limpe o conjunto
    H- Confira se o conjunto está vazio
     */

    /*
    Cores do Arco-Iris:
    Vermelho
    Laranja
    Amarelo
    Verde
    Azul
    Anil
    Violeta,
    */

    public static void main(String[] args) {

        System.out.println("Crie um conjunto contendo as cores do arco-iris: ");

        Set<String> cores = new HashSet<>();
            cores.add("Vermelho");
            cores.add("Laranja");
            cores.add("Amarelo");
            cores.add("Verde");
            cores.add("Azul");
            cores.add("Anil");
            cores.add("Violeta");
        System.out.println(cores);



        System.out.println("A- Exiba todas as cores uma baixo da outra: ");
        for (String cor: cores) System.out.println(cor);


        System.out.println("B- A quantidade de cores que o arco-iris tem: " + cores.size());


        System.out.println("C- Exiba as cores em ordem alfabetica: ");

        Set<String> cores1 = new TreeSet<>(cores);
        for (String cor: cores1) System.out.println(cor);

        System.out.println("D- Exiba as cores na ordem inversa que foi informada: ");
        Set<String> cores2 = new LinkedHashSet<>(Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println("Informada: " + cores2);
        List<String> coresList = new ArrayList<>(cores2);
        Collections.reverse(coresList);
        System.out.println("Reverso: " + coresList);


        System.out.println("E= Exiba todas as cores que começam com a letra \"V\": ");
        for (String cor : cores){
            if (cor.startsWith("V")){
                System.out.println(cor);
            }
        }

        System.out.println("F- Exiba todas as cores que não começam com a letra \"V\": ");
        for (String cor : cores){
            if (cor.startsWith("V")){

            }else {
                System.out.println(cor);
            }
        }

        System.out.println("G- Limpe o conjunto: ");
        cores.clear();
        System.out.println("...");
        System.out.println("Limpo");


        System.out.println("H- Confira se o conjunto está vazio: ");
        System.out.println("Primeiro conjunto está vazio: " + cores.isEmpty());
        System.out.println("Segundo conjunto está vazio: " + cores1.isEmpty());
        System.out.println("Terceiro conjunto está vazio: " + cores2.isEmpty());
        System.out.println("Quarto conjunto está vazio: " + coresList.isEmpty());


    }
}


