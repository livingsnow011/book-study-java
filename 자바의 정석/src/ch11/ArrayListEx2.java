package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";
        //length = 43 ;
        int length = source.length();
        List list = new ArrayList(length / LIMIT + 10);

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length)
                list.add(source.substring(i, i + LIMIT));
            else
                list.add(source.substring(i));
        }

        for (Object o : list) {
            System.out.println("o = " + o);
        }
    }
}
