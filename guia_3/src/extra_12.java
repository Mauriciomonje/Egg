import java.util.Scanner;

public class extra_12 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    switch (k) {
                        case 3:
                            System.out.print(i + "-" + j + "-E\n");
                            break;
                        default:
                            System.out.print(i + "-" + j + "-" + k + "\n");
                            break;
                    }
                }
            }
        }
    }
}