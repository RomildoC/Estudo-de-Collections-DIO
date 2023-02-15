package List;


import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Ex01_Diferente {

    public static void main(String[] args) {

        /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

        List<Double> temp6 = new ArrayList<Double>();
        temp6.add(26.0);
        temp6.add(25.0);
        temp6.add(22.0);
        temp6.add(26.0);
        temp6.add(21.0);
        temp6.add(19.0);

        Iterator<Double> iterator = temp6.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }

        System.out.printf("Temperatura média de %.2f %n", (soma/ temp6.size())  ,"ºC");

        System.out.println("1 - JANEIRO " + temp6.get(0));
        System.out.println("2 - FEVEREIRO " + temp6.get(1));
        System.out.println("3 - MARÇO " + temp6.get(2));
        System.out.println("4 - ABRIL " + temp6.get(3));
        System.out.println("5 - MAIO " + temp6.get(4));
        System.out.println("6 - JUNHO " + temp6.get(5));

        /*Eu sei que ficou faltando tirar as menores que a média, MAS irei fazer isso quando estiver entendendo melhor*/

    }
}
