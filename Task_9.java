public class Task_9 {
    public static void main(String[] args) {

       // Тепер порахуємо скільки кілометрів проїхав гонщик, якщо у кожному колі 1 км 345 м

        int userInput = 51;
        int j = userInput;
        int length = 1345;
        int distance;
        int distanceLeft;
        int allDistance = userInput * length;

        for (int i = 0; i <= userInput; i++) {
            distance = length * i;
            distanceLeft = allDistance - distance;
            System.out.println("Проїхано " + i + " коло." + " Проїхана дистанція " + distance + " м." + " Залишилось " + j + " коло."
                    + " Залишилось проїхати дистанцію " + distanceLeft + " м.");
            j--;
        }
    }
}
