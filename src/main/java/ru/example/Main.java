package ru.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\maste\\Desktop\\Github\\JavaCore\\src\\main\\java\\ru\\example\\text.txt";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();

        String currentTime = TimeUtils.getCurrentTime();
        String entry = currentTime + " -> " + note;

        FileUtils.appendToFile(filePath, entry);

        System.out.println("Дозапись в файл: " + entry + " была выполнена успешно.");
    }
}
