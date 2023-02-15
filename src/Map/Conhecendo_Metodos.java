package Map;

import java.util.*;

public class Conhecendo_Metodos {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);

        }};

        System.out.println(carrosPopulares.toString());


        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2);

        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo Tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("Uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: ");
        // Não tem um modelo q possa passar, igual ao set

        System.out.println("Exiba os modelos: ");
        System.out.println(carrosPopulares.keySet());
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiva os consumos dos carros: ");
        System.out.println(carrosPopulares.values());
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais Eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }


        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();

        }
        System.out.println(soma);


        System.out.println("Exiba a média dos consumos deste dicionário de carros: ");
        System.out.println((soma / carrosPopulares.size()));


        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");


/*        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        Double remove = 0d;

        while (iterator1.hasNext()) {
            remove = iterator1.next();
            if (remove != 15.6) {
                System.out.println(remove);

            }
        }

        FIZ ASSIM E FUNCIONOU SEGUE ABAIXO O METODO DA PROFESSORA
*/

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
        }

        System.out.println(carrosPopulares);


        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares1.toString());


        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);


        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionario esta vazio: ");
        System.out.println("Map está vazia? " + carrosPopulares.isEmpty());
        System.out.println("LinkedHashMap está vazia? " + carrosPopulares1.isEmpty());
        System.out.println("TreeMap está vazia? " + carrosPopulares2.isEmpty());
    }
}
