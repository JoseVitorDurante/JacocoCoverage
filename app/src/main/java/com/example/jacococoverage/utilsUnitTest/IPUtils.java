package com.example.jacococoverage.utilsUnitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPUtils {

    public static boolean isValidIPv4(String ip) {
        String ipv4Pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        Pattern pattern = Pattern.compile(ipv4Pattern);

        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }
}
