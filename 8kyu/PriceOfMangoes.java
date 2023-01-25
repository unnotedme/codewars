public class PriceOfMangoes {
    public static int mango(int quantity, int price) {
        int giveFree = quantity / 3;
        return (quantity - (giveFree)) * price;
    }
}
