import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        Flowers[] flowers = new Flowers[5];
        for (int i = 0; i < 5; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt(); in.nextLine();
            int d = in.nextInt(); in.nextLine();
            String e = in.nextLine();

            flowers[i] = new Flowers(a,b,c,d,e);
        }
        String ff = in.nextLine();
        int ans = findMinPriceByType(flowers,ff);
        if (ans!=0){
            System.out.println(ans);
        }else{
            System.out.println("No flowers");
        }

    }

    public static int findMinPriceByType(Flowers[] flowers, String s){
        Flowers[] fl = new Flowers[0];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].getType().equalsIgnoreCase(s) && flowers[i].getRating()>3){
                fl = Arrays.copyOf(fl,fl.length+1);
                fl[fl.length-1] = flowers[i];
            }
        }
        if (fl.length>0){
            Flowers mini = fl[0];
            for (int j = 1; j < fl.length; j++) {
                if (mini.getPrice()>fl[j].getPrice()){
                    mini = fl[j];
                }
            }
            return mini.getFlowerId();
        }
        return 0;
    }
}


class Flowers{
    int flowerId;
    String flowerName;
    int price;
    int rating;
    String type;

    public Flowers(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}