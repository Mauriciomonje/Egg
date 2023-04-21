import java.util.Scanner;

public class extra_7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        int n=leer.nextInt();
        int n2=n;
        int mayor=0;
        int menor=99999;
        int num=0;
        System.out.println("Mediante while");
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
        System.out.println("menor "+menor+" mayor "+mayor);
        System.out.println("do while");
        do {
            n2--;
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            if (menor>num) {
               menor=num; 
            }
            else if(mayor<num){
                mayor=num;
            }
        } while (n2!=0);
        System.out.println("menor "+menor+" mayor "+mayor);
    }
}
