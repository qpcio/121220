package MovieDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title;
    //Director director;
    LocalDate premierDate;
    //List<Actor> actorList = new ArrayList<>();
    MovieType movieType;
    List<Staff> staffList;

    public Movie(String title, LocalDate premierDate,  List<Staff> staffList, MovieType movieType) {
        this.title = title;
        this.premierDate = premierDate;
        this.movieType = movieType;
        this.staffList = staffList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", premierDate=" + premierDate +
                ", movieType=" + movieType +
                ", staffList=" + staffList +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPremierDate() {
        return premierDate;
    }

    public void setPremierDate(LocalDate premierDate) {
        this.premierDate = premierDate;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
