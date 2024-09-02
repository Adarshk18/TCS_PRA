import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Phone[] phone = new Phone[4];
        for (int i = 0; i < 4; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt();

            phone[i] = new Phone(a,b,c,d);

        }
        String bs = in.nextLine();
        String o = in.nextLine();
        int ans1 = findPriceForGivenBrand(phone,bs);
        if (ans1!=0){
            System.out.println(ans1);
        }else{
            System.out.println("Not");
        }
        int ans2 = getPhoneIdBasedOnOs(phone,o);
        if (ans2!=0){
            System.out.println(ans2);
        }else{
            System.out.println("Nope");
        }

    }
    public static int findPriceForGivenBrand(Phone[] phone, String b){
        int sum =0;
        for (int i = 0; i < phone.length; i++) {
            if (phone[i].getBrand().equalsIgnoreCase(b)){
                sum += phone[i].getPrice();
            }
        }
        if (sum>0){
            return sum;
        }else{
            return 0;
        }
    }

    public static int getPhoneIdBasedOnOs(Phone[] phone, String os){
        Phone[] pp = new Phone[0];
        for (int i = 0; i < phone.length; i++) {
            if (phone[i].getOs().equalsIgnoreCase(os) && phone[i].getPrice()>=50000){
                return phone[i].getPhoneId();
            }
        }
        return 0;
    }
}


class Phone{
    int phoneId;
    String os;
    String brand;
    int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}