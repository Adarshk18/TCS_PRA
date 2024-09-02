import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Movie[] movie = new Movie[4];
        for (int i = 0; i < 4; i++) {
            int a = in.nextInt(); in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt(); in.nextLine();

            movie[i] = new Movie(a,b,c,d);
        }
        String sg = in.nextLine();
        String[] ans = getMovieByGenre(movie,sg);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static String[] getMovieByGenre(Movie[] movie, String searchGenre){
        String[] mv = new String[0];
        for (int i = 0; i < movie.length; i++) {
            if (movie[i].getGenre().equalsIgnoreCase(searchGenre)){
                if (movie[i].getBudget()>80000000){
                    mv = Arrays.copyOf(mv,mv.length+1);
                    mv[mv.length-1] = "High Budget Movie";
                }else{
                    mv = Arrays.copyOf(mv,mv.length+1);
                    mv[mv.length-1] = "Low Budget Movie";
                }
            }
        }
        return mv;
    }
}


class Movie{
    int movieName;
    String company;
    String genre;
    int budget;

    public Movie(int movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public int getMovieName() {
        return movieName;
    }

    public void setMovieName(int movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}