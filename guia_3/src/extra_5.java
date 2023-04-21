import java.util.Scanner;

public class extra_5 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese tipo de socio");
        String socio=leer.nextLine();
        System.out.println("Ingrese el monto del tratamiento");
        int monto=leer.nextInt();
        socio=socio.toUpperCase();
        switch (socio) {
            case "A":
                System.out.println("Monto a abonar $"+monto/2);
                break;
            case "B":
                System.out.println("Monto a abonar $"+monto/1.35);
                break;
            case "C":
                System.out.println("Monto a abonar $"+monto);
                break;
        
            default:
                System.out.println("Ingrese un socio valido");
                break;
        }
    }
}
