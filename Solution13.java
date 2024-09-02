public class Solution13 {
    public static void main(String[] args) {

    }
    public static int findAverageBudgetByDirector(Cinema[] cn, String director){
        int sum=0,cnt=0;
        for (int i = 0; i < cn.length; i++) {
            if (cn[i].getDirector().equalsIgnoreCase(director)){
                sum += cn[i].getBudget();
                cnt++;
            }
        }
        if (sum>0){
            int avg = sum/cnt;
            return avg;
        }else{
            return 0;
        }
    }
    public static int getMovieByRatingBudget(Cinema[] cn , int rating, int budget){
        Cinema cc = cn[0];
        for (int i = 0; i < cn.length; i++) {
            if (cn[i].getRating()==rating && cn[i].getBudget()==budget && rating%budget==0){
                return cn[i].getBudget();
            }
        }
        return 0;
    }
}

class Cinema{
    int movieId;
    String director;
    int rating;
    int budget;

    public Cinema(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
