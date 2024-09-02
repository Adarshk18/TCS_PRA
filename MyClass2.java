import java.util.Arrays;
import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Antenna[] antenna = new Antenna[4];
        for (int i = 0; i < 4; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            double d = in.nextLong(); in.nextLine();

            antenna[i] = new Antenna(a,b,c,d);

        }
        String str = in.nextLine();
        int ans1 = searchAntennaByName(antenna,str);
        if (ans1!=0){
            System.out.println(ans1);
        }else{
            System.out.println("There is no antenna with the given parameter");
        }
        double ds = in.nextLong();
        Antenna[] ans2 = sortAntennaByVSWR(antenna,ds);
        if (ans2!=null){
            for (int i = 0; i < ans2.length; i++) {

            }
        }
    }

    public static int searchAntennaByName(Antenna[] antenna, String s){
        for (int i = 0; i < antenna.length; i++) {
            if (antenna[i].getAntennaName().equalsIgnoreCase(s)){
                return antenna[i].getAntennaId();
            }
        }
        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna[] antenna, double d){
        Antenna[] ant = new Antenna[0];
        for (int i = 0; i < antenna.length; i++) {
            if (antenna[i].getAntennaVSR()<d){
                ant = Arrays.copyOf(ant,ant.length+1);
                ant[ant.length-1] = antenna[i];
            }
        }
        for (int i = 0; i < ant.length; i++) {
            for (int j = 0; j < ant.length-i-1; j++) {
                if (ant[i].getAntennaVSR()<ant[j].getAntennaVSR()){
                    Antenna temp = ant[i];
                    ant[i] = antenna[i];
                    antenna[i] = temp;
                }
            }
        }
        if (ant.length>0){
            return ant;
        }else{
            return null;
        }
    }
}

class Antenna{
    private int antennaId;
    private String antennaName;
    private String projectLead;
    private double antennaVSR;

    public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSR) {
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSR = antennaVSR;
    }

    public int getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(int antennaId) {
        this.antennaId = antennaId;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSR() {
        return antennaVSR;
    }

    public void setAntennaVSR(double antennaVSR) {
        this.antennaVSR = antennaVSR;
    }
}
