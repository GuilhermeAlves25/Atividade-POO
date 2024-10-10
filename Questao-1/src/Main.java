

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora\n");
        double valor = scanner.nextInt();

        System.out.println("Digite a quantidade de horas\n");
        double horas = scanner.nextInt();

        double salario = valor*horas;
        double Ir;
        if(salario <= 900){
            Ir = Calculo(salario,0);
            Printar(Ir,salario,horas,valor,0.00);
        }
        else if(salario > 900 && salario <= 1500){
            Ir = Calculo(salario,0.05);
            Printar(Ir,salario,horas,valor,0.05);
        }
        else if(salario > 1500 && salario <= 2500){
            Ir = Calculo(salario,0.10);
            Printar(Ir,salario,horas,valor,0.10);
        }
        else if(salario > 2500){
            Ir = Calculo(salario,0.20);
            Printar(Ir,salario,horas,valor,0.20);
        }
    }
    public static double Calculo(double salario,double percentual){
        double ir = salario - (salario*percentual);
        return ir;
    }
    public static double Printar(double IR,double salario,double horas,double valor,double percentual){
        System.out.printf("%-50s : R$%8.2f %n",
                String.format("Salário bruto(%.1fX%.1f)", horas, valor), salario);
        System.out.printf("%-50s : R$%8.2f %n",
                String.format("(-) Imposto de renda(%.2f%%)", percentual * 100), salario - IR);
        System.out.printf("%-50s : R$%8.2f %n",
                "(-) INSS (10%)", salario * 0.10);
        System.out.printf("%-50s : R$%8.2f %n",
                "FGTS (11%)", salario * 0.11);

        double descontos = (salario - IR) + (salario * 0.10);
        System.out.printf("%-50s : R$%8.2f %n",
                "Total de descontos", descontos);
        System.out.printf("%-50s : R$%8.2f %n",
                "Salário líquido", salario - descontos);

        return descontos;
    }
}
