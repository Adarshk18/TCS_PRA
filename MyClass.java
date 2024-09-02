import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee1[] employee1 = new Employee1[5];
        for (int i = 0; i < 5; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            boolean d = in.nextBoolean();
            double e = in.nextLong();
            in.nextLine();

            employee1[i] = new Employee1(a,b,c, e, d);
        }
        String br = in.nextLine();
        int ans1 = findCountOfEmployeesUsingCompTransport(employee1,br);
        if (ans1!=0){
            System.out.println(ans1);
        }else {
            System.out.println("No Such Employees");
        }

        Employee1[] ans2 = findEmployeeWithSecondHighestRating(employee1);
        if (ans2!=null){
            for (int i = 0; i < ans2.length; i++) {
                if (ans2[i].getRating()>ans2[i+1].getRating()){
                    System.out.println(ans2[i+1].getEmployeeId());
                    System.out.println(ans2[i].getName());
                    break;
                }
            }
        }else{
            System.out.println("No such employess");
        }
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee1[] employee1, String p){
        int cnt =0;
        for (int i = 0; i < employee1.length; i++) {
            if(employee1[i].getBranch().equalsIgnoreCase(p) && !employee1[i].isTransport()){
                cnt++;
            }
        }
        if (cnt>0){
            return cnt;
        }else{
            return  0;
        }
    }

    public static Employee1[] findEmployeeWithSecondHighestRating(Employee1[] employee1){
        Employee1[] ep = new Employee1[0];
        Employee1 del;
        for (int i = 0; i < employee1.length; i++) {
            if (!employee1[i].isTransport()){
                ep = Arrays.copyOf(ep,ep.length+1);
                ep[ep.length-1] = employee1[i];
            }
        }

        for (int i = 0; i < employee1.length; i++) {
            for (int j = i; j < employee1.length; j++) {
                if (ep[i].getRating()<ep[j].getRating()){
                    del = ep[i];
                    ep[i] = ep[j];
                    ep[j] = del;
                }
            }
        }
        if (ep.length>0){
            return ep;
        }else{
            return null;
        }
    }
}

class Employee1{
    int employeeId;
    String name;
    String branch;
    double rating;
    boolean transport;

    public Employee1(int employeeId, String name, String branch, double rating, boolean transport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isTransport() {
        return transport;
    }

    public void setTransport(boolean transport) {
        this.transport = transport;
    }
}


