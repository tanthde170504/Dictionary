/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Display {
    private Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("======== Dictionary program ========");
        System.out.println("\t1. Add new word.");
        System.out.println("\t2. Delete word.");
        System.out.println("\t3. Search word.");
        System.out.println("\t4. Exit.");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public String getEnglishInput() {
        System.out.print("Enter English: ");
        return scanner.next();
    }

    public String getVietnameseInput() {
        System.out.print("Enter Vietnamese: ");
        return scanner.next();
    }

    public void displayTranslation(String vietnamese) {
        System.out.println("Vietnamese: " + vietnamese);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}