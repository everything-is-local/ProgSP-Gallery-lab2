package com.snytkov.lab2;

import java.util.ArrayList;
import java.util.List;

public class ArtworkManager {
    private static List<Artwork> collection = new ArrayList<Artwork>();

    static boolean appendArtwork(Artwork object) throws NullPointerException {
        if (object == null)
            throw new NullPointerException();

        return collection.add(object);
    }

    static boolean deleteArtwork(int id) throws NullPointerException {
        for (Artwork a : collection) {
            if (id == a.getId()) {
                return collection.remove(a);
            }
        }

        return false;
    }

    static void listCollection() {
        for (Artwork a : collection) {
            System.out.println(a);
        }
    }

    static boolean editAuthor(int id, String newAuthor) {
        boolean found = false;

        for (Artwork a : collection) {
            if (id == a.getId()) {
                a.setAuthor(newAuthor);
                found = true;
            }
        }

        return found;
    }

    static boolean editYear(int id, int newYear) {
        boolean found = false;

        for (Artwork a : collection) {
            if (id == a.getId()) {
                a.setYear(newYear);
                found = true;
            }
        }

        return found;
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

    static ArrayList<Artwork> filterByYearRange(int firstBorder, int secondBorder) {
        List<Artwork> result = new ArrayList<Artwork>();

        for (Artwork c : collection) {
            if (c.getYear() >= firstBorder && c.getYear() <= secondBorder)
                result.add(c);
        }

        return (ArrayList<Artwork>) result;
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


}
