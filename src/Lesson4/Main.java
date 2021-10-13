package Lesson4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        System.out.println("Вот что получилось то...");
        ClientsGenerator generator = new Data();
        Clients[] customers = new Clients[20];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = generator.getRandomClients();
            System.out.println(customers[i]);
            System.out.println();
            System.out.println();
            System.out.println();
        }



          int f = 0;
        for (int i = 0; i < customers.length; i++){
            if (customers[i] instanceof FL) {
                if (((FL) customers[i]).sex.equals("Male")) {
                    f++;
                }
            }
        }
        FL[] client_fl = new FL[f];
        int j = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] instanceof FL) {
                if (((FL) customers[i]).sex.equals("Male")) {
                    client_fl[j] = (FL) customers[i];
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
