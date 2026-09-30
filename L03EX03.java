import java.util.Scanner;

public class L03EX03 {

    public static void main(String[] args) 
    {
        Float a, b, c, delta, x, x1, x2;
        Scanner escreve = new Scanner(System.in);

        System.out.println("Equacao do segundo grau: aX2 + bX + c = 0");
        System.out.println("Informe os valore de a, b e c:");
        a = escreve.nextFloat();
        b = escreve.nextFloat();
        c = escreve.nextFloat();
        delta =(b*b) - (4*a*c);

        if (a==0 && b==0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }
        else if (a==0 && b != 0) {
            x= -c/b;
            System.out.println("Essa é uma equação de primeiro grau:"+ x);
        }
        else 
        {
        if (delta > 0) {
            
        x1 = (-b + (float)Math.sqrt(delta)) / (2*a);
        x2 = (-b - (float)Math.sqrt(delta)) / (2*a);

            System.out.println("Esta equação possui duas raízes reais diferentes." + x1 + " e " + x2);
        }
        else if (delta== -delta) {
            System.out.println("Esta equação não possui raízes reais.");
        }
        else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");
        }
        } 
        escreve.close();
    }
}


