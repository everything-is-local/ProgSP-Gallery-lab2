package com.snytkov.lab2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenuManager {
    private static final String adminPassword = "admin";

    public static String getAdminPassword() {
        return adminPassword;
    }

    public static void displayUserLoginMenu() {}

    public static void displayMainMenu() {
        System.out.println("1. Append Painting");
        System.out.println("2. Append Sculpture");
        System.out.println("3. Append Photograph");
        System.out.println("4. List Collection");
        System.out.println("5. Delete Artwork (admin)");
        System.out.println("6. Edit Author/Year");
        System.out.println("7. Search By Title");
        System.out.println("8. Search By Author");
        System.out.println("9. Filter By Type");
        System.out.println("10. Filter By Year");
        System.out.println("11. Filter By Age Range");
        System.out.println("12. Sort By Title");
        System.out.println("13. Sort By Author");
        System.out.println("14. Show Type Statistics");
        System.out.println("15. Exit");
    }

    public static void startApplication() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Artwork> resultList = null;
        Artwork result = null;

        int select = -1, id = 0, year = 0;
        double weight = 0, depth = 0, height = 0, width = 0;
        String title = "", author =  "", type = "", material = "", printType = "", style = "", photoType = "", format = "";
        String password = "";

        while (select != 15) {
            while (true) {
                try {
                    displayMainMenu();
                    System.out.print("Enter your choice: ");
                    select = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                }
            }

            switch (select) {
                case 1:
                    while (true) {
                        try {
                            System.out.print("Enter id: ");
                            id = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter year: ");
                            year = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter title: ");
                            title = scanner.nextLine();

                            System.out.print("Enter author: ");
                            author = scanner.nextLine();

                            System.out.print("Enter type: ");
                            type = scanner.nextLine();

                            System.out.print("Enter printType: ");
                            printType = scanner.nextLine();

                            System.out.print("Enter style: ");
                            style = scanner.nextLine();

                            System.out.print("Enter width: ");
                            width = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter height: ");
                            height = scanner.nextDouble();
                            scanner.nextLine();

                            break;
                        } catch (InputMismatchException e) {
                            throw new RuntimeException();
                        }
                    }

                    if (ArtworkManager.appendArtwork(new Painting(id, title, author, year, type, width, height,
                            printType, style))) {
                        System.out.println("Artwork has successfully appended.");
                    } else {
                        System.out.println("Something went wrong.");
                    }

                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.print("Enter id: ");
                            id = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter year: ");
                            year = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter title: ");
                            title = scanner.nextLine();

                            System.out.print("Enter author: ");
                            author = scanner.nextLine();

                            System.out.print("Enter type: ");
                            type = scanner.nextLine();

                            System.out.print("Enter width: ");
                            width = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter height: ");
                            height = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter material: ");
                            material = scanner.nextLine();

                            System.out.print("Enter weight: ");
                            weight = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter depth: ");
                            depth = scanner.nextDouble();
                            scanner.nextLine();

                            break;
                        } catch (InputMismatchException e) {
                            throw new RuntimeException();
                        }
                    }

                    if (ArtworkManager.appendArtwork(new Sculpture(id, title, author, year, type, width, height,
                        material, weight, depth))) {
                        System.out.println("Artwork has successfully appended.");
                    } else {
                        System.out.println("Something went wrong.");
                    }

                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.print("Enter id: ");
                            id = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter year: ");
                            year = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter title: ");
                            title = scanner.nextLine();

                            System.out.print("Enter author: ");
                            author = scanner.nextLine();

                            System.out.print("Enter type: ");
                            type = scanner.nextLine();

                            System.out.print("Enter width: ");
                            width = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter height: ");
                            height = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Enter phototype: ");
                            photoType = scanner.nextLine();

                            System.out.print("Enter format: ");
                            format = scanner.nextLine();

                            break;
                        } catch (InputMismatchException e) {
                            throw new RuntimeException();
                        }
                    }

                    if (ArtworkManager.appendArtwork(new Photograph(id, title, author, year, type, width, height,
                        photoType, format))) {
                        System.out.println("Artwork has successfully appended.");
                    } else {
                        System.out.println("Something went wrong.");
                    }

                    break;
                case 4:
                    ArtworkManager.listCollection();
                    break;
                case 5:
                    while (true) {
                        try {
                            System.out.print("Enter the admin password to access this method: ");
                            password = scanner.nextLine();

                            if (password.equals(getAdminPassword()))
                                break;

                            System.out.println("Invalid admin pass, try again.");
                        } catch (InputMismatchException e) {
                            throw new RuntimeException();
                        }

                        while (true) {
                            try {
                                System.out.print("Enter id of artwork: ");
                                id = scanner.nextInt();
                                scanner.nextLine();

                                break;
                            } catch (InputMismatchException e) {
                                throw new RuntimeException(e);
                            }
                        }

                        if (ArtworkManager.deleteArtwork(id)) {
                            System.out.println("Artwork has successfully removed.");
                        } else {
                            System.out.println("Something went wrong.");
                        }
                    }
                    break;
                case 6:
                    System.out.print("What would you like to change (author/year): ");
                    String choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("author")) {
                        while (true) {
                            System.out.println("Enter id: ");

                            try {
                                id = scanner.nextInt();
                                scanner.nextLine();
                                break;
                            } catch (InputMismatchException e) {
                                throw new RuntimeException();
                            }
                        }

                        System.out.print("Enter new author: ");
                        String newAuthor = scanner.nextLine();

                        if (ArtworkManager.editAuthor(id, newAuthor)) {
                            System.out.println("Author has successfully changed.");
                        } else {
                            System.out.println("Something went wrong.");
                        }
                    } else if (choice.equalsIgnoreCase("year")) {
                        while (true) {
                            System.out.println("Enter id: ");

                            try {
                                id = scanner.nextInt();
                                scanner.nextLine();
                                break;
                            } catch (InputMismatchException e) {
                                throw new RuntimeException();
                            }
                        }

                        System.out.print("Enter new year: ");
                        int newYear = scanner.nextInt();
                        scanner.nextLine();

                        if (ArtworkManager.editYear(id, newYear)) {
                            System.out.println("Year has successfully changed.");
                        } else {
                            System.out.println("Something went wrong.");
                        }
                    }
                    break;
                case 7:
                    System.out.print("Enter title of artwork you would like to search:");
                    title = scanner.nextLine();

                    result = ArtworkManager.searchByTitle(title);
                    System.out.println(result);

                    break;
                case 8:
                    System.out.print("Enter author of artwork you would like to search:");
                    author = scanner.nextLine();

                    resultList = ArtworkManager.searchByAuthor(author);
                    System.out.println(resultList);

                    break;
                case 9:
                    System.out.print("Enter type of artwork you would like to filter:");
                    type = scanner.nextLine();

                    resultList = ArtworkManager.filterByType(type);
                    System.out.println(resultList);

                    break;
                case 10:
                    while (true) {
                        System.out.print("Enter year you would like to filter: ");

                        try {
                            id = scanner.nextInt();
                            scanner.nextLine();

                            break;
                        } catch (InputMismatchException e) {
                            throw new RuntimeException();
                        }
                    }

                    resultList = ArtworkManager.filterByYear(year);
                    System.out.println(resultList);

                    break;
                case 11:
                    // Age range
                    break;
                case 12:
                    System.out.print("Enter title you would like to sort: ");
                    title = scanner.nextLine();

                    resultList = ArtworkManager.sortByTitle(title);
                    System.out.println(resultList);
                    break;
                case 13:
                    System.out.print("Enter author of artwork you would like to sort:");
                    author = scanner.nextLine();

                    resultList = ArtworkManager.searchByAuthor(author);
                    System.out.println(resultList);
                    break;
                case 14:
                    System.out.print("Enter type to show statistics: ");
                    type = scanner.nextLine();

                    resultList = ArtworkManager.typeStatistics(type);
                    System.out.println(resultList);
                    break;
                case 15:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;
            }

        }
    }
}
