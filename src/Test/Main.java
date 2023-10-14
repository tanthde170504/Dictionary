/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Controller.Manager;
import Model.Dictionary;
import View.Display;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Dictionary model = new Dictionary();
        Display display = new Display();
        Manager manager = new Manager(model, display);
        manager.processUserInput();
    }
}

