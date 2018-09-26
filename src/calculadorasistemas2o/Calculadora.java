package calculadorasistemas2o;

import java.util.Scanner;

public class Calculadora {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        int x,y;
        System.out.println("Pasame 1 numeros");
        a = in.nextInt();
        System.out.println("Pasame un 2o numero");
        b = in.nextInt();
        suma(x);
    }
    private static int suma (int x){
        int a,b,suma;
        a=in.nextInt();
        b=in.nextInt();
        suma = a+b;
        return x;
    }
}
