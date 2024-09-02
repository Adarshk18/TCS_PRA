import java.util.Arrays;
import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < inventories.length; i++) {
            String a = in.nextLine();
            int b = in.nextInt(); in.nextLine();
            int c = in.nextInt(); in.nextLine();
            int d = in.nextInt(); in.nextLine();

            inventories[i] = new Inventory(a,b,c,d);
        }
        int l = in.nextInt();
        Inventory[] ans = Replenish(inventories,l);
        if (ans!=null){
            for (int i = 0; i < ans.length; i++) {
                if (ans[i].getThreshold()>75){
                    System.out.println(ans[i].getThreshold()+ "Critical Filling");
                }else if(ans[i].getThreshold()>=50 && ans[i].getThreshold()<=70){
                    System.out.println(ans[i].getThreshold()+"Moderate Filling");
                }else{
                    System.out.println(ans[i].getThreshold()+"Non critical filling");
                }
            }
        }
    }

    public static Inventory[] Replenish(Inventory[] inventories, int limit){
        Inventory[] in = new Inventory[0];
        for (int i = 0; i < inventories.length; i++) {
            if (limit>=inventories[i].getThreshold()){
                in = Arrays.copyOf(in, in.length+1);
                in[in.length-1] = inventories[i];
            }
        }
        if (in.length>0){
            return in;
        }else{
            return null;
        }
    }
}


class Inventory{
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}