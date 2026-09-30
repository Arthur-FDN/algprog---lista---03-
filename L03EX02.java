import java.util.Scanner;

public class L03EX02 {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        int compra, pagamento, troco, resto, novo_troco;

        System.out.println("Valor da compra: ");
        compra = escreve.nextInt();
        System.out.println("Valor pago: ");
        pagamento = escreve.nextInt();

         troco = pagamento - compra;
        
        if (pagamento < compra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        }
        else if (troco >= 0){
            System.out.println("Troco: R$ "+ troco);

                    resto = (troco / 50);
            novo_troco = (troco - (resto * 50));
            System.out.println("Notas de R$ 50,00: "+ resto);

                        resto = (novo_troco / 20);
            novo_troco = (novo_troco - (resto * 20));
            System.out.println("Notas de R$ 20,00: "+ resto);

                        resto = (novo_troco / 10);
            novo_troco = (novo_troco - (resto * 10));
            System.out.println("Notas de R$ 10,00: "+ resto);

                        resto = (novo_troco / 5);
            novo_troco = (novo_troco - (resto * 5));
            System.out.println("Notas de R$ 5,00: "+ resto);

                        resto = (novo_troco / 2);
            novo_troco = (novo_troco - (resto * 2));
            System.out.println("Notas de R$ 2,00: "+ resto);

                        resto = (novo_troco / 1);
            novo_troco = (novo_troco - (resto * 1));
            System.out.println("Moedas de R$ 1,00: "+ resto);
        }
        escreve.close();
        }
    }
        

