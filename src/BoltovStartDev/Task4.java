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
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = ((int) (Math.random() * 50)) * 2;
        }
        for(int i = 0; i < myArr.length; i++){
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        
        System.out.println("----- конец задачи 4 ------");
    }
}
