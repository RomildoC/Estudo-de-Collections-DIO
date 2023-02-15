package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temp6 = new ArrayList<Double>();


        double soma = 0.0;
        for (int i = 1; i<=6; i++){
            System.out.println("Qual temperatura do mes " + i + ": ");
            double temp = scan.nextDouble();
            temp6.add(temp);
            soma += temp;
        }

        double medtemp = soma/ temp6.size();

        System.out.println("Temperatura Semestral: " + temp6);
        System.out.println("Média da temperatura semestral: " + medtemp);


        for (Double temp : temp6){
            if(temp > medtemp){
                int index = temp6.indexOf(temp);
                switch (index){
                    case 0:
                    System.out.println((index + 1) + " - JANEIRO: " + temp + "C");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp + "C");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp + "C");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp + "C");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp + "C");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp + "C");
                        break;
                    default:
                        break;

                }
            }
        }
    }



}
