package com.teachmeskills.lesson12.task2.run;

import com.teachmeskills.lesson12.task2.service.Search;

public class Runner {
    public static void main(String[] args) {
        String text = " Good morning! I'll send to your email new information for your work. " +
                "please fill out the document 1423-1512-51 and send it to my email: randomma@gmail.com " +
                "thank u!";
        Search.searchObjects(text);
    }
}
