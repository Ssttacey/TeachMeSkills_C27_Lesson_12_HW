package com.teachmeskills.lesson12.task2.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson12.task2.constant.Constant.*;

public class Search {
    public static void searchObjects(String doc) {

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern docPattern = Pattern.compile(DOC_REGEX);

        Matcher emailMatcher = emailPattern.matcher(doc);
        Matcher docMatcher = docPattern.matcher(doc);

        if (emailMatcher.find() && docMatcher.find()) {

            System.out.println("email: " + emailMatcher.group());
            System.out.println("document number: " + docMatcher.group());


        } else {
            System.out.println("Wrong data. We didn't find anything ");
        }
    }
}
