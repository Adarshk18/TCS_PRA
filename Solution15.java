import java.util.Arrays;
import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player2[] pl = new Player2[4];
        for (int i = 0; i < pl.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt();
            in.nextLine();
            int d = in.nextInt();
            in.nextLine();
            int e = in.nextInt();
            in.nextLine();

            pl[i] = new Player2(a,b,c,d,e);
        }
        int t = in.nextInt(); in.nextLine();
        double[] ans = findAverageOfRuns(pl,t);
        if (ans!=null){
            for (int i = 0; i < ans.length; i++) {
                if (ans[i]>80 && ans[i]<=100){
                    System.out.println("Grade A");
                }else if(ans[i]>=50 && ans[i]<=79){
                    System.out.println("Grade B");
                }else{
                    System.out.println("Grade C");
                }
            }
        }
    }

    public static double[] findAverageOfRuns(Player2[] pl, int target){
        double[] pp = new double[0];
        for (int i = 0; i < pl.length; i++) {
            if (target<=pl[i].getMatchesPlayed()){
                pp = Arrays.copyOf(pp,pp.length+1);
                pp[pp.length-1] = (pl[i].getRunsScored()/pl[i].getMatchesPlayed());
            }
        }
        if (pp.length>0){
            return pp;
        }else{
            return null;
        }
    }
}


class Player2{
    int id;
    String name;
    int iccRank;
    int matchesPlayed;
    int runsScored;

    public Player2(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public void setIccRank(int iccRank) {
        this.iccRank = iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}