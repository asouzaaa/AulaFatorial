import java.util.Scanner;
public class Fatorial {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n, fat = 1;
        System.out.println("Digite um numero: ");
        n = sc.nextInt();

        while (n >= 13 || n <=0){

        }
        for (int aux = n; aux >0; aux --){
            fat = fat * aux;
        }
        System.out.print("Resultado obtido foi: " +fat);
        sc.close();
    }
}