import java.util.Scanner;

public class L03EX04 {

    public static void main(String[] args) {
        int operacao, r;
        Double PI = 3.141592, Perimetro, Area, Volume; 
        Scanner escreve = new Scanner(System.in);
        System.out.println("Escreva um numero de 1 a 3, sendo:"+"\n\n"+"1: calcular e imprimir o perímetro do círculo."+"\n"+"2: calcular e imprimir a área do círculo."+"\n"+"3: calcular e imprimir o volume da esfera."+"\n");
        operacao = escreve.nextInt();

        System.out.println("Digite o valor do raio do raio ou circulo: ");
        r = escreve.nextInt();

        if (operacao==1){
            Perimetro = 2*PI*r;
            System.out.println("O perímetro de um círculo e: "+ Perimetro);
        }
        else if(operacao==2){
            Area = PI*Math.pow(r, 2);
            System.out.println("A area do círculo e: "+ Area);
        }
        else if(operacao==3){
            Volume = (4/3)*PI*Math.pow(r,3);
            System.out.println("O Volume de uma esfera e: "+ Volume);
        }
        else{
            System.out.println("código da operação é inválido.");
        }
        escreve.close();
    }
}