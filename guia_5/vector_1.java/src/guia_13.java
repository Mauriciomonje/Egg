import java.util.Scanner;
public class guia_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String vector[] = new String[6];
        String aux = "";
              System.out.println("Pedir nombres de equipo");
        
        for(int i = 0 ; i < 6; i++){
        vector[i] = leer.next();
         }
       for (String elemento: vector){
           aux += "\n"+ elemento;
           
        }
        System.out.println(aux);
    }
}

