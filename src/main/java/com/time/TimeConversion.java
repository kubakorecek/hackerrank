package com.time;

import java.util.ArrayList;
import java.util.List;

public class TimeConversion {
    public static String timeConversion(String s) {
        List<String> ss= new ArrayList<String>();
        ss.addAll(List.of(s.split(":", 3)));
        String tmp = ss.get(2).toString().substring(0,2);
        Integer tmp24 = Integer.parseInt(ss.get(0));
        String tmp2 = ss.get(0);

        if (ss.get(2).substring(2,4).equals("PM") &&
                ! ss.get(0).equals("12"))
        {
            tmp24 = tmp24 + 12;
            tmp2 = tmp24.toString();
        } else if(ss.get(2).substring(2,4).equals("AM") &&
                ss.get(0).equals("12")
        )
        {
            tmp2 = "00";
        }
        StringBuilder newS = new StringBuilder(tmp2 +":"+ ss.get(1) +":"+tmp);
        return newS.toString();
    }
}
