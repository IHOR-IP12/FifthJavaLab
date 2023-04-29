package main.java;

import java.util.regex.Matcher;
 import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Я сьогодні був в Політехніці. Я сьогодні смачно поїв. Навіщо це все?.";
        String[] sentences = text.split("\\.");

        Pattern vowels = Pattern.compile("[А, Е, Є, И, І, Ї, О, У, Ю, Я,а,е,є,и,і,ї,о,у,ю,я]");
        for (String sentence : sentences) {
            Matcher matcher = vowels.matcher(sentence);
            int count = 0;
            while
            (matcher.find()) {
                count++;
            }
            System.out.println("Результат 1 речення: " + count + " голосних.");
            break;
        }
    }

}
