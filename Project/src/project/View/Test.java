/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.View;

import project.Controller.ResortController;


/**
 *
 * @author thais
 */
public class Test {
    public static void main(String[] args) {
        printFuramaLogo();

        ResortController.displayMainMenu();
    }
    
    public static void printFuramaLogo() {
        System.out.println("  ______ _            __  __                      ");
        System.out.println(" |  ____| |          |  \\/  |                     ");
        System.out.println(" | |__  | | ___   ___| \\  / | __ _ _ __ ___   __ _ ");
        System.out.println(" |  __| | |/ _ \\ / __| |\\/| |/ _` | '_ ` _ \\ / _` |");
        System.out.println(" | |    | | (_) | (__| |  | | (_| | | | | | | (_| |");
        System.out.println(" |_|    |_|\\___/ \\___|_|  |_|\\__,_|_| |_| |_|\\__, |");
        System.out.println("                                              __/ |");
        System.out.println("                                             |___/ ");
        System.out.println("               Welcome to Resort Furama!       ");
    }


}
