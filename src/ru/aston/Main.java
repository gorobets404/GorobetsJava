package ru.aston;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Задание 1:
         */
        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.println("Введите число");
        if (in.hasNextInt()) {
            input = in.nextInt();
            System.out.println(input);
        }
        if (input > 7) {
            System.out.println("Привет");
        }

        /**
         * Задание 2:
         */
        String name = "";
        System.out.println("Введите имя: ");
        if (in.hasNext()) {
            name = in.next();
            System.out.println(name);
        }
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени!");
        }
        
        /**
         * Задание 3:
         */
        String str = "";
        System.out.println("Введите массив целых чисел с разделителем ';' : ");
        if (in.hasNext()) {
            str = in.next();
            System.out.println(str);
        }
        String[] array = str.replaceAll(" ", ";")
                .replaceAll("[a-zA-Zа-яА-Я_]", ";")
                .replaceAll("\\]", ";").replaceAll("\\[", ";")
                .replaceAll("[,!#?$%&<>:|]", ";").split(";");
        int[] dataArray = new int[array.length];
        try {
            for (int i = 0; i < dataArray.length; ) {
                for (int j = 0; j < array.length; j++) {
                    dataArray[i] = Integer.valueOf(array[j]);
                    i++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат строки! ");
        }
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] % 3 == 0) {
                System.out.print(dataArray[i] + " ");
            }
        }
        in.close();
    }
}
