package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UI {


    public static void main (String[] args) throws SQLException {
        System.out.println("Connect to Data Base established.");
        System.out.println("Choose our mode:\n");
        System.out.println("<1> Show all tables in current schema.");
        System.out.println("<2> \"still do nothing.\"");
        System.out.println("<3> Disconnect DB and exit program.");

        Scanner scanner = new Scanner ( System.in );
        int choose;

        do {
            choose = scanner.nextInt();
            switch (choose) {
                case (1) -> SQLQueries.PrintSchemaTables();
//                case (2) -> still do nothing;
                case (3) -> {
                    SQLQueries.DisconnectorDB();
                    System.out.println("You exit a DataBase connection. See You later !!!");}
                default -> System.out.println("Wrong input. Try right input again.");
            }
        }
        while (choose <1 || choose >3);

    }
}
