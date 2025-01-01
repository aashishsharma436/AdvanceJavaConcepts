package com.Collections.Compare;

import java.util.*;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating,int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public int compareTo(Movie m) {

        // Sort movies in ascending
        // order of year
        return this.year - m.year;
    }

    // Getter and Setter method
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

public class Comparble {
    public static void main(String[] args) {

        List<Movie> l = new ArrayList<>(
                Arrays.asList(new Movie("Star Wars", 8.7, 1977),
                    new Movie("Empire Strikes Back", 8.8, 1980),
                    new Movie("Return of the Jedi", 8.4, 1983)));

        // Sort movies using Comparable's
        // compareTo method by year
        Collections.sort(l);

        // Display the sorted list of movies
        System.out.println("Movies after sorting by year:");
        l.forEach(m-> System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear()));
    }
}
