import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Какую задачу решать?");
        System.out.println("1 - вывод чисел от единицы до х");
        System.out.println("2 - нарисовать прямоугольник");
        System.out.println("3 - нарисовать квадрат");
        System.out.println("4 - нарисовать прямоугольник при помощи рекурсии");
        System.out.println("5 - нарисовать квадрат при помощи рекурсии");
        System.out.println("6 - сравнить два числа");
        System.out.println("7 - сравнить два дробных числа");
        System.out.println("0 - выход");

        int choise = validator("^[0-7]$");
        while ( choise > 0) {
            switch (choise) {
                case 1: {
                    ExecuteTaskOne();
                    choise = repeater();
                } break;
                case 2: {
                    ExecutedrawRectangle();
                    choise = repeater();
                } break;
                case 3: {
                    ExecutedrawSquare();
                    choise = repeater();
                } break;
                case 4: {
                    ExecutedrawRectangleRec();
                    choise = repeater();
                } break;
                case 5: {
                    ExecutedrawSquareRec();
                    choise = repeater();
                } break;
                case 6: {
                    ExecuteGetMax();
                    choise = repeater();
                } break;
                case 7: {
                    ExecuteGetMaxFloat();
                    choise = repeater();
                } break;
            }
        }
    }
        public static void ExecuteTaskOne() {
            System.out.println("ведите Х");
            int x = validator("^[0-99]*$");
            FunctionsD.taskOne(x);
            }


        public static void ExecutedrawRectangle(){
            System.out.println("введите размер прямоугольника - два числа");
            int x = validator("^[0-99]*$");
            int y = validator("^[0-99]*$");
            FunctionsD.drawRectangle(x, y);
        }

        public static void ExecutedrawSquare(){
            System.out.println("введите размер квадрата");
            int x = validator("^[0-99]*$");
            FunctionsD.drawRectangle(x);
        }

        public static void ExecutedrawRectangleRec(){
            System.out.println("введите размер прямоугольника - два числа");
            int x = validator("^[0-99]*$");
            int y = validator("^[0-99]*$");
            FunctionsD.drawRectangleRecursive(x, y);
        }

        public static void ExecutedrawSquareRec(){
            System.out.println("введите размер квадрата");
            int x = validator("^[0-99]*$");
            FunctionsD.drawRectangleRecursive(x);
            FunctionsD.s = "";
        }

        public static void ExecuteGetMax(){
            System.out.println("Введите два числа");
            int x = validator("^[0-99]*$");
            int y = validator("^[0-99]*$");
            FunctionsD.getMax(x, y);
    }

        public static void ExecuteGetMaxFloat(){
            System.out.println("Введите два числа");
            float x = validatorF("^[0-9]*[.,]?[0-9]+$");
            float y = validatorF("^[0-9]*[.,]?[0-9]+$");
            FunctionsD.getMax(x, y);
        }


        private static int validator(String regex ) {
            Scanner in = new Scanner(System.in);
            String result = in.nextLine();
            while (!result.matches(regex)) {
                System.out.println("Введите число");
                result = in.nextLine();
            }
            return Integer.parseInt(result);

        }

        private static float validatorF(String regex ) {
            Scanner in = new Scanner(System.in);
            String result = in.nextLine();
            while (!result.matches(regex)) {
                System.out.println("Введите число");
                result = in.nextLine();
            }
            return Float.parseFloat(result);

    }
        private static int repeater(){
            System.out.println("Введите номер задачи чтобы продолжить или 0 чтобы выйти");
            int choise = validator("^[0-7]$");
        return (choise);
        }

}