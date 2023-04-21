import java.util.Scanner;

public class vector1 {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int[] vector= new int[100];
        for (int i = 0; i <= 99; i++) {
            vector[i]=i+1;
        }
        for (int j = 99; j >=0; j--) {
            System.out.println(vector[j]);
        }
    }
}
