import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        Team[] teams = new Team[n];
        for (int i = 0; i < teams.length; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt(); in.nextLine();

            teams[i] = new Team(a,b,c,d);
        }
        int r = in.nextInt(); in.nextLine();
        String ctr = in.nextLine();
        Team ans = findPlayer(teams,r,ctr);
        if (ans!=null){
            System.out.println(ans.gettId());
            System.out.println(ans.gettName());
            System.out.println(ans.gettRun());
            System.out.println(ans.gettCountry());
        }
    }
    public static Team  findPlayer(Team[] teams,int run, String country){
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].gettCountry().equalsIgnoreCase(country) && teams[i].gettRun()> run){
                return teams[i];
            }
        }
        return null;
    }

}


class Team{
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;

    public Team(int tId, String tName, String tCountry, int tRun) {
        this.tId = tId;
        this.tName = tName;
        this.tCountry = tCountry;
        this.tRun = tRun;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettCountry() {
        return tCountry;
    }

    public void settCountry(String tCountry) {
        this.tCountry = tCountry;
    }

    public int gettRun() {
        return tRun;
    }

    public void settRun(int tRun) {
        this.tRun = tRun;
    }
}