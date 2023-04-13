import java.util.Scanner;

public class guia_10 {
    public static void main(String[]args) throws Exception{
        Scanner leer= new Scanner(System.in);
        int num;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un valor entre 1 y 20");
            num =leer.nextInt();
            if (num>0 && num <21) {
                for (int j = 0; j <= num; j++) {
                    if (j==0){
                        System.out.print(num);
                        continue;
                    }
                    else{
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }
            
        }
        

    }
}
