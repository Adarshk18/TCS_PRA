import java.util.Scanner;

public class character_odd_place {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (i%2!=0){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}
