import java.util.*;

class numbertriangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE HEIGHT OF THE TRIANGLE");
        int h = in.nextInt();
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}