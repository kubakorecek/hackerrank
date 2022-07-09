package com.strings.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;

import static java.lang.Math.*;

public class SparseArray {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Long> hashMapStrings = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (var item : strings
             )
        {
            hashMapStrings.add(toHash(item));
        }

        for (var item : queries
        )
        {
           result.add( Collections.frequency(hashMapStrings, toHash(item)));
        }

        return  result;
    }

    private static  Long toHash(String s)
    {
        long  hashCode = 0;
        long  mod = (long) 1e9 + 9;
        int p = 31;
        long p_pow = 1;

        for (Character c: s.toCharArray())
        {
            try{
                hashCode = (hashCode + ( c.hashCode() * p_pow))% mod;
                p_pow = (p_pow * p) % mod;
            }
            catch (ArithmeticException e)
            {
                System.out.printf("p %f \n", p);

                System.out.printf("c.hashCode() -97 %d\n",(c.hashCode()-97));
            }
        }



        return hashCode;
    }
}
