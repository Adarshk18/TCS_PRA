import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        int sum =0;
        for (int i = 0; i < num.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),3);
        }
        if (sum == Integer.parseInt(num)){
            System.out.println("Armstrong number");

        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
