import java.util.Scanner;

class Main{
    public static void main(String [] args) {
        //region operations
        System.out.println("Введите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        //endregion

        //region range of values
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            if (operation >4){
                System.out.println("Задано неверное число. Попробуйте снова: ");
            }
            else if (operation <1) {
                System.out.println("Задано неверное число. Попробуйте снова: ");
            }

            else {
            //region scanner and value
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                int result;
                //endregion
                //region conditions
                if (operation == 1){
                    result = a + b;
                } else if (operation == 2){
                    result = a - b;
                }
                else if (operation == 3){
                    result = a * b;
                }
                else {
                    result = a / b;
                }
                //endregion

                //region result
                System.out.println("Результат = " + result);
                scanner.close();
                //endregion
                break;
            }
        }//endregion
    }
}
