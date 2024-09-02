import java.util.Scanner;

public class charRepeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int i=0;
        int count =0;
        char ch = str.charAt(i);
        for (int j = 0; j < str.length(); j++) {
            if (ch==str.charAt(j)){
                count++;
            }else{
                System.out.print(ch+""+count);
                ch = str.charAt(j);
                count =0;
                j--;
            }
            if (ch==str.charAt(str.length()-1) && j==str.length()-1){
                System.out.print(ch+""+count);
            }
        }

    }
}
