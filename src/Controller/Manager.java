/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Dictionary;
import View.Display;
/**
 *
 * @author DELL
 */
public class Manager {
    private Dictionary dictionary;
    private Display display;

    public Manager(Dictionary dictionary, Display display) {
        this.dictionary = dictionary;
        this.display = display;
    }

    public void processUserInput() {
        while (true) {
            int choice = display.menu();
            switch (choice) {
                case 1:
                    String english = display.getEnglishInput();
                    String vietnamese = display.getVietnameseInput();
                    if (dictionary.addWord(english, vietnamese)) {
                        display.displayMessage("Add successful.");
                    } else {
                        display.displayMessage("Word already exists.");
                    }
                    break;
                case 2:
                    String wordToDelete = display.getEnglishInput();
                    if (dictionary.deleteWord(wordToDelete)) {
                        display.displayMessage("Delete successful.");
                    } else {
                        display.displayMessage("Word not found.");
                    }
                    break;
                case 3:
                    String wordToTranslate = display.getEnglishInput();
                    String translation = dictionary.translate(wordToTranslate);
                    if (translation != null) {
                        display.displayTranslation(translation);
                    } else {
                        display.displayMessage("Not found in data");
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
