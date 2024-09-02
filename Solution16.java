import java.util.Scanner;

public class Solution16{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();

        int rev =n,cnt=0;
        for (int i = 0; i < n; i++) {
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if (rev==cnt){
            System.out.println("Armstrong Number.");
        }else{
            System.out.println("Not an Armstrong Number.");
        }
    }
}