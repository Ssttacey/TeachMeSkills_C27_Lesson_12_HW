package com.teachmeskills.lesson12.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSearch {
    public static void regex(String str) {
        final String TAG_REGEX = "\\b([A-Z]){2,6}\\b";
        Pattern pattern = Pattern.compile(TAG_REGEX);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println( "there are abbreviations in the text:" + matcher.group() + " starting at index " +
                    matcher.start() + " and ending at index " + matcher.end() + ".");
        }
    }
}