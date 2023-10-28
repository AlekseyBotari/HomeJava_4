public class Task_11 {
    public static void main(String[] args) {

        //Вивести фігуру із зірочок 5х7

        int userInput = 5;
        int userInput2 = 7;

        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j < userInput2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
