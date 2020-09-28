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
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = (int) (Math.random() * 50);
        }
        for(int i = 0; i < myArr.length; i++){
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        
        int sum = 0;
        for(int i = 0; i < myArr.length; i++){
            sum = sum + myArr[i];
        }
        
        int min = myArr[0];
        int max = myArr[0];
        for(int i = 0; i < myArr.length; i++){
            if (myArr[i] < min){ min = myArr[i];}
            else if (myArr[i] > max){ max = myArr[i];}
        }
        System.out.println("Сумма всех чисел массива: " + sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("----- конец задачи 3 ------");
    }
}
