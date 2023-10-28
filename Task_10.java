public class Task_10 {
    public static void main(String[] args) {

        // Одне морозиво коштує 4 грн 75 коп. Допоможіть продавцеві порахувати скільки коштує від однієї до
        // дев'яти порцій морозива

        int portionIceCream = 9;
        int price = 475;

        float allPrice;

        for (int i = 1; i <= portionIceCream; i++) {
            allPrice = (price * i) / 100F;
            System.out.println(i + " порції морозива коштує" + allPrice + " грн.");
        }

    }
}
