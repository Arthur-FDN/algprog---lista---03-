import java.util.Scanner;

public class L03EX05 {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        Double a,b, r;
        char soma = '+', subtracao = '-', multiplicacao = '*', divisao = '/', potencia = '^', simbolo;
        System.out.println("Digite dois numero:");
        a=escreve.nextDouble();
        b=escreve.nextDouble();
        System.out.println("\n"+"Digite agora o tipo de operacao de deseja realizar:"+"\n");
        System.out.println("soma: +\n"+"subtracao: -\n"+"multiplicacao: *\n"+"divisao: /\n"+"potencia: ^\n");
        simbolo=escreve.next().charAt(0);

        if (simbolo == soma){
             r = a+b;
            System.out.println("Soma: "+ r);
        }
        else if (simbolo == subtracao){
            r=a-b;
            System.out.println("Subtracao: "+ r);
        }
        else if (simbolo == multiplicacao){
            r=a*b;
            System.out.println("Multiplicao: "+ r);
        }
        else if (simbolo == divisao){
            r=a/b;
            System.out.println("Divisao: "+ r);
        }
        else if (simbolo == potencia){
            r = Math.pow(a,b);
            System.out.println("Potencia: "+ r);
        }
        else{
            System.out.println("[ERRO]");
            System.out.println("\n"+"Símbolo da operação é inválido.");
        }
        escreve.close();
    }
}
