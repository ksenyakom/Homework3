package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Последовательность Фибоначчи
        Scanner consoleInput = new Scanner(System.in);
        int n = consoleInput.nextInt();

        int fib1 = 1;
        int fib2 = 1;
        System.out.print(fib1 + " " + fib2 + " ");
        for (int i = 1; i < n; i++) {

            int tempFib2 = fib2;
            fib2 = fib2 + fib1;
            fib1 = tempFib2;
            System.out.print(fib2+" ");
            if (i%20 == 0) System.out.println();

            if ((Integer.MAX_VALUE-(fib1 + fib2)) <= fib2)  {
                System.out.println("\nПривышено значение числа типа Integer");
                System.out.println("Остаток типа int "+(Integer.MAX_VALUE-(fib1 + fib2)) +"\n"+ "Количество членов последовательности Фибоначчи " + (i+2));
            break;}

        }
    }
}
