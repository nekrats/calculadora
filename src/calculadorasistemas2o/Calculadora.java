package calculadorasistemas2o;

import java.util.Scanner;

public class Calculadora {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,c;
        System.out.println("Pasame 1 numeros");
        x = in.nextInt();
        System.out.println("Pasame un 2o numero");
        c = in.nextInt();
        System.out.println("resultado suma: "+suma(x,c));
        System.out.println("resultado resta: "+resta(x,c));
    }
    public static int suma (int x,int c){
        int o;
        o = x+c;
        return o;
    }
    public static int resta(int x, int c){
        int r;
        r=x-c;
        return r;
    }
}
