import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Taxi[] taxi = new Taxi[4];
        for (int i = 0; i < 4; i++) {
            int a = in.nextInt(); in.nextLine();
            int b = in.nextInt(); in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt(); in.nextLine();

            taxi[i] = new Taxi(a,b,c,d);
        }
        int dd = in.nextInt();
        Taxi ans = searchTaxiById(taxi,dd);
        if (ans!=null){
            System.out.println(ans);
        }else{
            System.out.println("Not Found");
        }

        Taxi ans2 = findTaxiWithLowestFare(taxi);
        if (ans2!=null){
            System.out.println(ans2);
        }else{
            System.out.println("Not Found");
        }
    }

    public static Taxi searchTaxiById(Taxi[] taxi, int id){
        for (int i = 0; i < taxi.length; i++) {
            if (taxi[i].getTaxi_id()==id){
                return taxi[i];
            }
        }

        return null;
    }

    public static Taxi findTaxiWithLowestFare(Taxi[] taxi){
        Taxi[] tx = new Taxi[0];
        for (int i = 0; i < taxi.length; i++) {
            for (int j = i; j < taxi.length; j++) {
                if (taxi[i].getFare()<taxi[j].getFare()){
                    tx = Arrays.copyOf(tx,tx.length+1);
                    tx[tx.length-1] = taxi[i];
                }
            }
        }
        return null;
    }
}


class Taxi{
    int taxi_id;
    int seats;
    String area;
    int fare;

    public Taxi(int taxi_id, int seats, String area, int fare) {
        this.taxi_id = taxi_id;
        this.seats = seats;
        this.area = area;
        this.fare = fare;
    }

    public int getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(int taxi_id) {
        this.taxi_id = taxi_id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}