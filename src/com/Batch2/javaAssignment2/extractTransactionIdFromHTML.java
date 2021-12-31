/* 6. Extract only transaction ID from the given HTML */

package com.Batch2.javaAssignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractTransactionIdFromHTML {
    public static void main(String[] args) {
        String inputString="<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>";
        String strContent="";
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            strContent = matcher.group(2);
        }
        String[] content = strContent.split(" ");
        System.out.println("Extracted Transaction Id: "+content[2]);
    }
}
