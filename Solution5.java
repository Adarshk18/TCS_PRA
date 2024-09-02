import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fruits[] fruits = new Fruits[4];
        for (int i = 0; i < 4; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt(); in.nextLine();
            int d = in.nextInt(); in.nextLine();

            fruits[i] = new Fruits(a,b,c,d);
        }
        int rat = in.nextInt();
        int ans = findMaximumPriceByRating(fruits,rat);
        if (ans!=0){
            System.out.println(ans);
        }else{
            System.out.println("No such fruit");
        }

    }

    public static int findMaximumPriceByRating(Fruits[] fruits,int rr){
        int mx=0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getRating()>rr) {
                if (fruits[i].getPrice() > mx) {
                    mx = fruits[i].getPrice();
                }
            }
        }
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getPrice()==mx){
                return fruits[i].getFruitId();
            }
        }
        return 0;
    }
}

class Fruits{
    int fruitId;
    String fruitName;
    int price;
    int rating;

    public Fruits(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
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
}
