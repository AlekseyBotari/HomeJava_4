public class Task_8 {
    public static void main(String[] args) {

        //Гонщику потрібно проїхати 51 коло. Виводити на кожному етапі скільки зі скільки він вже проїхав та
        // скільки ще залишилось.

        int userInput = 51;
        int j = userInput;

        for (int i = 0; i <= userInput; i++) {
            System.out.println("Проїхано " + i + " коло." + "Залишилось " + j + " коло.");
            j--;
        }
    }
}
