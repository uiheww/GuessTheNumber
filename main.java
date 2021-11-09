import java.util.Scanner;

public class main {

    public static void main(String[] args){
        System.out.println("Введите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        //region Scanner and value
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int result;
        //endregion

        if (operation == 1){
            result = a + b;
        } else if (operation == 2){
            result = a - b;
        } else if (operation == 3){
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("Результат = " + result);
    }
}


//region task_1
/**1.Дописать калькулятор, чтобы он мог выполнять деление
   2. Чтобы калькулятор при введение значения переменной "operation", отличного от заданных
* выдавал в консоль сообщение об ошибке и предлагал заново ввести значение*/
//endregion
