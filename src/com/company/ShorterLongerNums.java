package com.company;

/**
 * Created by Daniil Kornienko on 06.04.2016.
 */
public class ShorterLongerNums {
    public static void main(String[] args) {
        int j;
        int y;
        for (int barrier = args.length-1; barrier>=0;barrier--) {
            for (int lnght = 0;lnght<barrier; lnght++) {
                if (args[lnght].length()>args[lnght+1].length()) {
                    String tmp = args[lnght];
                    args[lnght] = args[lnght+1];
                    args[lnght+1] =tmp;
                }

            }

        }
        j = args[0].length();
        y = args[args.length-1].length();
        System.out.println("Shortest value is: "+args[0] + " Lenght is: " +j);
        System.out.println("Longest value is: "+args[args.length-1] + " Lenght is: " +y);

    }
}
