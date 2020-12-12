package MovieDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title;
    Director director;
    LocalDate premierDate;
    List<Actor> actorList = new ArrayList<>();
    MovieType movieType;

    public Movie(String title, Director director,
                 LocalDate premierDate, List<Actor> actorList, MovieType movieType) {
        this.title = title;
        this.director = director;
        this.premierDate = premierDate;
        this.actorList = actorList;
        this.movieType = movieType;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", premierDate=" + premierDate +
                ", actorList=" + actorList +
                ", movieType=" + movieType +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public LocalDate getPremierDate() {
        return premierDate;
    }

    public void setPremierDate(LocalDate premierDate) {
        this.premierDate = premierDate;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }
}
