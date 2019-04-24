package org.mine.initial;

import org.mine.regex.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractorUsage {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            String line = in.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile(TagContentExtractor.TAG_CONTENT_EXTRACTOR);
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
    }
}
