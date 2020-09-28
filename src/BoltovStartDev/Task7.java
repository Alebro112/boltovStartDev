/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoltovStartDev;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task7 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Задача 7 ------");
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите букву: ");
        String letter = scanner.nextLine();
        int n = 0;
        int index = -1;
        boolean isWhile = true;
        while (isWhile) {
            index = str.indexOf(letter, index + 1);
            if (index != -1){
                n++;
                continue;
            }
            isWhile = false;
        }
        
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ n + " раз");
        System.out.println("");
        System.out.println("----- конец задачи 7 ------");
    }
}
