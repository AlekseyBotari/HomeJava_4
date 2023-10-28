public class Task_12 {
    public static void main(String[] args) {

        //Вивести таблицю множення

        int userInput = 10;
        int answer;

        for (int i = 1; i <= userInput; i++) {
            System.out.println();
            for (int j = 1; j <= userInput; j++) {
                answer = i * j;
                System.out.println(i + " * " + j + " = " + answer + " ");
            }
        }
    }
}
