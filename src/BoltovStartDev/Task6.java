/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoltovStartDev;

/**
 *
 * @author user
 */
public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int[10][];
        
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = new int[(int) (5 + Math.random() * 10)];
            for(int j = 0; j < myArr[i].length; j++){
                myArr[i][j] = (int) (Math.random() * 50);
            }
        }
        
        
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----- конец задачи 6 ------");
    }
}
