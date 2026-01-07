package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUsage {
    static void main(String[] args) {
//        String regex_01 = "(?:https?://)(?:www\\.)?([^/]+)";
        String URL = "http://localhost:8080/app";
        String regex = "(https?)://(?:www\\.)?([^:/]+)(?::(\\d+))?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(URL);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
