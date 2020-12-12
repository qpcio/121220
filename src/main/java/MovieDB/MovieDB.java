package MovieDB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieDB {
    static List<Movie> movieList = new ArrayList<>();

    static void menuSelection() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter == 0) {
            System.out.println(
                    "1. Dodaj Film\n" +
                            "2. Szukaj filmu po nazwie\n" +
                            "3. Wypisz filmy z zakresu dat\n" +
                            "4. Sprawdz w jakich filmach grał dany aktor\n" +
                            "5. Ile kosztowalo wyprodukowanie danego filmu");

            int selectMenu = scanner.nextInt();
            switch (selectMenu) {
                case 1:
                    break;
                case 2:
                    findMovieByTitle(movieList);
                    break;
                case 3:
                    searchMovieFromRange(movieList);
                    break;
                case 4:
                    checkMoviesForActor(movieList);
                    break;
                case 5:
                    checkMovieBudget(movieList);
                    break;
                default:
                    System.out.println("Zły wybór");
                    counter++;
            }

        }
    }

    static void dataPreparation() {
        Director stevenSpilberg = new Director("Steven", "Spilberg", 2000);
        Director jamesCameron = new Director("James", "Cameron", 3000);

        Actor tomCruiz = new Actor("Tom", "Cruiz", 1000);
        Actor juliaRoberts = new Actor("Juila", "Roberts", 1100);
        Actor stevenSigal = new Actor("Steven", "Sigal", 1200);

        Movie titanic = new Movie("Titanic", stevenSpilberg,
                LocalDate.of(2020, 12, 1), Arrays.asList(tomCruiz, juliaRoberts), MovieType.action);
        Movie rambo = new Movie("Rambo", jamesCameron,
                LocalDate.of(2018, 12, 1), Arrays.asList(tomCruiz, stevenSigal), MovieType.horror);
        movieList.add(titanic);
        movieList.add(rambo);
    }

    private static void findMovieByTitle(List<Movie> movieList) {
        System.out.println("Podaj nazwe szukanego filmu ");
        Scanner scanner1 = new Scanner(System.in);
        String movieTitle = scanner1.nextLine();

        for (Movie movie : movieList) {
            if (movie.getTitle().equals(movieTitle)) {
                String toString = movie.toString();
                System.out.println(toString);
            }
        }
    }

    private static void checkMoviesForActor(List<Movie> movieList) {
        System.out.println("Podaj imię lub nazwisko aktora");
        Scanner scanner = new Scanner(System.in);
        String firstOrLastName = scanner.nextLine();

        for (Movie movie : movieList) {
            for (Actor actor : movie.getActorList()) {
                if (actor.getFirstName().equals(firstOrLastName)) {
                    System.out.println(movie.getTitle());
                } else if (actor.getLastName().equals(firstOrLastName)) {
                    System.out.println(movie.getTitle());
                }
            }
        }
    }

    private static void checkMovieBudget(List<Movie> movieList) {
        System.out.println("Podaj nazwę filmu dla którego sprawdzamy budżet");
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        double movieBudget = 0;

        for (Movie movie : movieList) {
            if (movieName.equals(movie.getTitle())) {
                movieBudget = movieBudget + movie.getDirector().getPayment();

                for (Actor actor : movie.getActorList()) {
                    movieBudget = movieBudget + actor.getPayment();
                }
                System.out.println(movieBudget);
            }

        }

    }

    private static void searchMovieFromRange(List<Movie> movieList) {
        System.out.println("Podaj datę od w formacie RRRR-MM-DD");
        Scanner scanner = new Scanner(System.in);
        LocalDate start = LocalDate.parse(scanner.nextLine());
        System.out.println("Podaj datedo w formacie RRRR-MM-DD");
        LocalDate end = LocalDate.parse(scanner.nextLine());

        for (Movie movie : movieList) {
            if (movie.getPremierDate().isAfter(start) && movie.getPremierDate().isBefore(end)
                    || movie.getPremierDate().equals(start) || movie.getPremierDate().equals(end) ){
                System.out.println(movie.getTitle());
            }
        }

    }

}
