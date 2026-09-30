import java.util.Scanner;

public class L03EX01 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.println("Escreva três numeros:");
        int A = escreva.nextInt();
        int B = escreva.nextInt();
        int C = escreva.nextInt();
        if (A>B && A>C){
           System.out.println("O maior numero é:"+A); 
        }
        else if (B>A && B>C){
            System.out.println("O maior numero é:"+B);
        }
        else if (C>A && C>B){
            System.out.println("O maior numero é:"+C);
        }
        float media= ((A+B+C)/3);
        System.out.println("A média aritimetica dos três número é:" + media);
        escreva.close();
    }
    
}
