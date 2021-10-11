package Lesson4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int f = 0;
        for (int i = 0; i < Data.base.length; i++){
            if (Data.base[i] instanceof FL) {
                if (((FL) Data.base[i]).sex.equals("Male")) {
                    f++;
                }
            }
        }
        FL[] client_fl = new FL[f];
        int j = 0;
        for (int i = 0; i < Data.base.length; i++) {
            if (Data.base[i] instanceof FL) {
                if (((FL) Data.base[i]).sex.equals("Male")) {
                    client_fl[j] = (FL) Data.base[i];
                    j++;
                }
            }
        }

        Arrays.sort(client_fl, FL.SortYear);
        System.out.println("А вот собственно и список:");
        for (int i = 0; i < client_fl.length; i++) {
            System.out.println(client_fl[i]);
        }
    }
}
