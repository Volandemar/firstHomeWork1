import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long[] sales = {1, 5, 71, 13, 0};

        SalesManager salesManag = new SalesManager(sales);

        System.out.println(salesManag.max());
        System.out.println(salesManag.sum());
    }
}