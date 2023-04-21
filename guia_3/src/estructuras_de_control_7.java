import java.util.Scanner;
public class estructuras_de_control_7 {
    public static void main(String[]args) throws Exception{
        Scanner leer = new Scanner(System.in);
        String frase;
        int correcta =0;
        int incorrecta=0;
        do {
            
            System.out.println("Ingrese frase que sea de 5 caracteres empieze con 'X' y termine con 'O'");
            frase=leer.nextLine();
            if(frase.equals("&&&&&")){
                break;
            }
            frase = frase.toUpperCase();
            if (frase.length()==5 && frase.substring(0,1).equals("X") && frase.substring(frase.length()-1).equals("O")){
                correcta ++;
            }
            else{
                incorrecta ++;
            }
        } while (frase != "&&&&&");
        
        System.out.println("Ingresos correctos: "+correcta);
        System.out.println("Ingresos incorrectos: "+incorrecta);
        
    }
}
