import java.util.Arrays;
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Associate[] associates = new Associate[4];
        for (int i = 0; i < 4; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt();

            associates[i] = new Associate(a,b,c,d);
        }
        String as = in.nextLine();
        Associate[] ast = associatesForGivenTechnology(associates,as);
        if (as!=null){
            for (int i = 0; i < ast.length; i++) {
                System.out.println(ast[i].getId());
            }
        }
    }

    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTec){
        Associate[] as = new Associate[0];
        for (int i = 0; i < associates.length; i++) {
            if (associates[i].getTechnology().equalsIgnoreCase(searchTec) && associates[i].getExperienceInYears()%5==0){
                as = Arrays.copyOf(as,as.length+1);
                as[as.length-1] = associates[i];
            }
        }
        if (as.length>0){
            return as;
        }else{
            return null;
        }
    }
}

class Associate{
    int id;
    String name;
    String technology;
    int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
