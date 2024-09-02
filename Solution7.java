import java.util.Arrays;
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Institution[] institutions = new Institution[6];
        for (int i = 0; i < institutions.length; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt(); in.nextLine();
            int d = in.nextInt(); in.nextLine();
            String e = in.nextLine();

            institutions[i] = new Institution(a,b,c,d,e);

        }
    }

    public static int FindNumClearancedByLoc(Institution[] institutions, String loc){
        int sum =0;
        for (int i = 0; i < institutions.length; i++) {
            if (institutions[i].getLocation().equalsIgnoreCase(loc)){
                sum += institutions[i].getGetNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution[] UpdateInstitutionGrade(Institution[] institutions, String iName){
        Institution[] inst = new Institution[0];
        for (int i = 0; i < institutions.length; i++) {
            if (institutions[i].getInstitutionName().equalsIgnoreCase(iName)){
                inst = Arrays.copyOf(inst, inst.length+1);
                inst[inst.length-1] = institutions[i];
            }
        }
        if (inst.length>0){
            return inst;
        }else{
            return null;
        }
    }
}

class Institution{
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int getNoOfStudentsCleared;
    String location;
    String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int getNoOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.getNoOfStudentsCleared = getNoOfStudentsCleared;
        this.location = location;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getGetNoOfStudentsCleared() {
        return getNoOfStudentsCleared;
    }

    public void setGetNoOfStudentsCleared(int getNoOfStudentsCleared) {
        this.getNoOfStudentsCleared = getNoOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
