import java.util.*;

class charactertriangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the height");
        int h = in.nextInt();
        for (int i = 65; i < (h + 65); i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }
}