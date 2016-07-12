package com.teamtreehouse.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

/**
 * Created by elyshaspector on 7/12/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Craig", "Dennis", 5, "Loved it!");
            printer.printRecord("Chirs", "Ramacciotti", 4, "Pretty good, would be better with an annotation or two.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
