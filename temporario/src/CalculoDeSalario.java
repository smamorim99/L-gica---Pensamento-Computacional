import java.util.Scanner;

public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner leitorDeEntrada = new Scanner(System.in);
            float valorSalario = leitorDeEntrada.nextFloat();
            float valorBeneficio = leitorDeEntrada.nextFloat();
        
                float valorImposto = 0;
                    if (valorSalario >= 0 && valorSalario <= 1100) {
                        valorImposto = 0.05F * valorSalario;
                    }
                    else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
                        valorImposto = 0.010F * valorSalario;
                    }
                    else {
                        valorImposto = 0.015F * valorSalario;
                    }
                    
            float saida = valorSalario - valorImposto + valorBeneficio;
            System.out.println(String.format("%.3f", saida));
                }

}
