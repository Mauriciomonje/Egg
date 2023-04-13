import java.util.Scanner;

public class extra_7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        int n=leer.nextInt();
        int mayor=0;
        int menor=99999;
        int num=0;
        while (n!=0) {
            n--;
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            if (menor>num) {
               menor=num; 
            }
            else if(mayor<num){
                mayor=num;
            }
        }
        do {
            
        } while (condition);
    }
}
