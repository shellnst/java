package lesson_1;

public class MainClass {

    // первое задание
    public static void main(String[] args) {
        System.out.println("Результат = " + virazenie(2,2,4,2));
        sravnenie(13,9);
        otizilipoloz();
        otric();
        Imya();
    }
    // первое задание
    public static void typidann(){
        boolean bolli =true;
        byte b1 = 5;
        short s1 = 50;
        int i = 250;
        char c1 = 'D';
        long l1 = 12124412441L;
        float f1 = 123.3f;
        double d1 = 132.31;
    }
// второе задание
    static int virazenie (int a, int b, int c, int d){
        return a * (b+(c/d));
    }
    // третье задание
    public static void sravnenie(int a, int b){
        int c = 0;
        c = a+b;
        if (c>10 && c<20){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    // четвертое задание
    public static void otizilipoloz (){
        int a = 0;
        if (a >= 0 ){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    // пятое задание
    public static void otric(){
        int a = -25;
        if (a<0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    // шестое задание
    public static void Imya(){
        String str = "Слава";
        System.out.println("Привет," + str);
    }

}


