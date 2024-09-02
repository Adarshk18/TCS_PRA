import java.util.Arrays;

public class courseProgram {
    public static void main(String[] args) {

    }

    public static int findAvgOfQuizByAdmin(Course[] course, String ad){
        int sum=0, count=0;
        for (int i = 0; i < course.length; i++) {
            if (course[i].getCourseAdmin().equalsIgnoreCase(ad)){
                sum += course[i].getQuiz();
            }
        }
        if (count>0){
            int avg = sum/count;
            return avg;
        }else{
            return 0;
        }
    }

    public static Course[] sortCourseByHandsOn(Course[] course, int hd){
        Course[] cr = new Course[0];
        for (int i = 0; i < course.length; i++) {
            if (course[i].getHandson()<hd){
                cr = Arrays.copyOf(cr,cr.length+1);
                cr[cr.length-1] = course[i];
            }
        }
        Course val;
        for (int i = 0; i < course.length; i++) {
            for (int j = i+1; j < course.length; j++) {
                if (cr[i].getHandson()>cr[j].getHandson()){
                    val = cr[i];
                    cr[i] = cr[j];
                    cr[j] = val;
                }
            }
        }
        if (cr.length>0){
            return cr;
        }else{
            return null;
        }
    }
}

class Course{
    int courseId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}
