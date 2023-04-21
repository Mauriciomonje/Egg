import java.util.Scanner;

public class extra_1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de minutos");
        int min=leer.nextInt();
        int dia;
        int hora;
        
        dia=min/1440;
        hora=min/60;
        do {
                hora-=24;
                
        } while (hora>=24);
        
        
        System.out.println(dia+" dia "+hora+" horas");
    }
}