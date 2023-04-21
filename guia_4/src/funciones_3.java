import java.util.Scanner;
/*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
    La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
    será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el 
    cambio (void).
    El cambio de divisas es:
    0.86 libras es un 1 €
    1.28611 $ es un 1 €
    129.852 yenes es un 1 €

 */
public class funciones_3 {
    public static void main(String[] args) {
        int opcion,euros;
        Scanner leer=new Scanner(System.in);
        System.out.println("MENU"+"\n"+"1_Convertir a libras"+"\n"+"2_Convertir a dolares"+"\n"+"3_Convertir a yenes"+"\n"+"4_Salir");
           do {
            
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de euros");
                    euros=leer.nextInt();
                    convertir(euros,"l");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de euros");
                    euros=leer.nextInt();
                    convertir(euros,"d");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de euros");
                    euros=leer.nextInt();
                    convertir(euros,"y");
                    break;
                case 4:
                    System.out.println("Cerrando...");
                    break;
            
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
            if (opcion!=4) {
                System.out.println("Elija una opcion.");
            }
           } while (opcion!=4);
    }
    public static void convertir(int e,String moneda) {
        switch (moneda) {
            case "l":
                System.out.println(e*0.86+" Libras");
                break;
            case "d":
                System.out.println(e*1.28611+" Dolares");
                break;
            case "y":
                System.out.println(e*129.852+" Yuanes");
                break;
        
            default:
                break;
        }

    }
}
