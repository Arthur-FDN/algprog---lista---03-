import java.util.Scanner;

public class L03EX06 {
    public static void main (String[] args){
        Scanner escreve=new Scanner (System.in);
        int a, b,r, r_s=0,p,i;
        System.out.println("Digite dois valores:");
        a = escreve.nextInt();
        b = escreve.nextInt();
        r = Math.max(a,b);

        if (r==a){
            r_s= (int) (b+(Math.random()*((a-b)+1)));
    
        }
        else if(r==b){
            r_s= (int) (a+(Math.random()*((b-a)+1)));
            
        }

        p = r_s % 2;

        if(p==0){
            System.out.println("o numero sorteado e: "+ r_s);
            System.out.println("O numero informado e par.");
        }
        else if (p!=0){
            System.out.println("o numero sorteado e: "+ r_s);
            System.out.println("O numero informado e impar.");
        }
        escreve.close();
    }
}
