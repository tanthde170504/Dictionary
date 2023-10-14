/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.*;
import java.util.HashMap;
/**
 *
 * @author DELL
 */
public class Dictionary {

    private final HashMap<String, String> dictionary;
    private final String filePath = "C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\Dictionary\\test\\Test.txt";

    public Dictionary() {
        dictionary = new HashMap<>();
        readDictionaryFile();
    }


    public boolean addWord(String english, String vietnamese) {
    if (!dictionary.containsKey(english)) {
        dictionary.put(english, vietnamese);
        updateDictionaryFile();
        return true;
    }
    return false;
}

    public boolean deleteWord(String english) {
        if (dictionary.containsKey(english)) {
            dictionary.remove(english);
            updateDictionaryFile();
            return true;
        }
        return false;
    }

    private void readDictionaryFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    dictionary.put(parts[0].toLowerCase(), parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateDictionaryFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String translate(String english) {
        return dictionary.get(english.toLowerCase());
    }
}