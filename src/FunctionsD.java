public class FunctionsD {


    public static void taskOne (int x){
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
    public static void drawRectangle(int x, int y) {
        String rec = new String();
        for (int i = 0; i < x; i++) {
            rec = rec + "+ ";
        }
        for (int i = 0; i < y; i++) {
            System.out.println(rec);
        }
    }

    public static void drawRectangle(int x){
        String rec = new String();
            for (int i = 0; i < x; i++) {
                rec = rec + "+ ";
            }
            for (int i = 0; i < x; i++) {
                System.out.println(rec);
            }

    }
    public static void getMax(int x, int y){
       if (x > y) {
           System.out.println(x);
       } else if (x < y) {
           System.out.println(y);
       } else {
           System.out.println("Числа равны");
       }

    }
    public static void getMax(float x, float y){
        if (x > y) {
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        } else {
            System.out.println("Числа равны");
        }

    }
    public static String s = new String();
    public static void drawRectangleRecursive(int x, int y) {

        if (x > 0 & y > 0) {
            x--;
            s = s + "+ ";
            drawRectangleRecursive(x, y);
        } else if (x == 0 & y > 0) {
            System.out.println(s);
            y--;
            drawRectangleRecursive(x, y);
        } else if (x==0 & y==0) {s="";}
    }


    public static void drawRectangleRecursive(int x) {
        if (x > 0) {
            x--;
            s = s + "+ ";
            drawRectangleRecursive(x);
            System.out.println(s);

        }
    }



}
