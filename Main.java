import java.util.Scanner;

public class Main {
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!");
        int range = 100;
        int number = (int)(Math.random() * range);// (int) - делает все числа целыми. входим из промежутка, теперь могут быть числа от 0 до 10
        System.out.println("Угадайте число от 0 до " + range);
        while (true) {
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!!!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше.Попробуйте ещё раз.");
            } else {
                System.out.println("Загаданое число больше Попробуйте ещё раз.");
            }
        }
        scanner.close();
    }
}

//region task_2
/* Модифицировать код так, чтобы игра могла загадывать
числа большего размера и поиграть в неё*/
//endregion