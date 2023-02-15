package List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

    /*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

    public static void main(String[] args) {
        List<String> resp = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Responda com %nS - para SIM %nN - para NÃO%n%n");
        System.out.println("1. Telefonou para a vítima? ");
        String respa = scanner.next();
        resp.add(respa.toLowerCase());
        System.out.println("2. Esteve no local do crime? ");
        respa = scanner.next();
        resp.add(respa.toLowerCase());
        System.out.println("3. Mora perto da vítima? ");
        respa = scanner.next();
        resp.add(respa.toLowerCase());
        System.out.println("4. Devia para a vítima? ");
        respa = scanner.next();
        resp.add(respa.toLowerCase());
        System.out.println("5. Já trabalhou com a vítima? ");
        respa = scanner.next();
        resp.add(respa.toLowerCase());

        int count = 0;
        Iterator<String> contador = resp.iterator();
        while (contador.hasNext()) {
            String resps = contador.next();
            ;
            if (resps.contains("s")) {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("--SUSPEITA--");
                break;
            case 3:
            case 4:
                System.out.println("--CÚMPLICE--");
                break;
            case 5:
                System.out.println("--ASSASSINO--");
                break;
            default:
                System.out.println("--INOCENTE--");
                break;


        }

    }

}
