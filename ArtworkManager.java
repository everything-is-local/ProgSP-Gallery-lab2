package com.snytkov.lab2;

import java.util.ArrayList;
import java.util.List;

public class ArtworkManager {
    private static List<Artwork> collection = new ArrayList<Artwork>();

    static Artwork getArtworkByID(int id) {
        for (Artwork c : collection) {
            if (c.getId() == id)
                return c;
        }

        return null;
    }

    static void appendArtwork(Artwork object) throws NullPointerException {
        if (object == null)
            throw new NullPointerException();

        collection.add(object);
    }

    static boolean deleteArtwork(Artwork object) throws NullPointerException {
        if (object == null)
            throw new NullPointerException();

        return collection.remove(object);
        // id надо сделать уникальным
    }

    static void listCollection() {
        for (Artwork a : collection) {
            System.out.println(a);
        }
    }

    static void editAuthor(int id, String newAuthor) {
//        if (object == null)
//            throw new NullPointerException();

        for (Artwork c: collection) {

        }
    }

    static void editYear(int id) {

    }

    static Artwork searchByTitle(String title) {
        for (Artwork c : collection) {
            if (title.equals(c.getTitle()))
                return c;
        }
        return null;
    }

    static ArrayList<Artwork> searchByAuthor(String author) {
        List<Artwork> result = new ArrayList<Artwork>();

        for (Artwork c : collection) {
            if (author.equals(c.getAuthor()))
                result.add(c);
        }

        return (ArrayList<Artwork>) result;
    }

    static ArrayList<Artwork> filterByType(String type) {
        List<Artwork> result = new ArrayList<Artwork>();

        for (Artwork c : collection) {
            if (type.equals(c.getType()))
                result.add(c);
        }

        return (ArrayList<Artwork>) result;
    }

    static ArrayList<Artwork> filterByYear(int year) {
        List<Artwork> result = new ArrayList<Artwork>();

        for (Artwork c : collection) {
            if (year == c.getYear())
                result.add(c);
        }

        return (ArrayList<Artwork>) result;
    }

    static ArrayList<Artwork> filterByYearRange(int yearRange) {
        return null;
    }

    static ArrayList<Artwork> sortByTitle(String title) {
        List<Artwork> result = new ArrayList<Artwork>();

        for (Artwork c : collection) {
            if (title.equals(c.getTitle()))
                result.add(c);
        }

        return (ArrayList<Artwork>) result;
    }
    static ArrayList<Artwork> sortByAuthor(String author) {
        List<Artwork> result = new ArrayList<Artwork>();

        for (Artwork c : collection) {
            if (author.equals(c.getAuthor()))
                result.add(c);
        }

        return (ArrayList<Artwork>) result;
    }

    static ArrayList<Artwork> typeStatistics(String type) {
        List<Artwork> result = new ArrayList<Artwork>();

        for (Artwork c : collection) {
            if (type.equals(c.getType()))
                result.add(c);
        }

        return (ArrayList<Artwork>) result;
    }

    // Сохранение/загрузка


}
