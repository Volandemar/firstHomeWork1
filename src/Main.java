public class Main {
    public static void main(String[] args) {

        int[] sales = {1, 5, 71, 13, 0};

        SalesManager salesManag = new SalesManager(sales);

        System.out.println(salesManag.max());
    }
}