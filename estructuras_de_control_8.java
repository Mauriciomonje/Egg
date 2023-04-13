import java.util.Scanner;
public class estructuras_de_control_8 {
    public static void main(String[]args) throws Exception{
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del cuadrado");
        int j=leer.nextInt();
        for (int i = 1; i <= j; i++) {
            for (int k = 1 ; k <= j; k++){
                if (k==1 || k==j || i==1 || i==j) {
                    
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
