package com.teachmeskills.lesson12.task1;

import com.teachmeskills.lesson12.task1.RegexSearch;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text pls: ");
        String text = scanner.nextLine();
        RegexSearch.regex(text);
        scanner.close();
    }
}
