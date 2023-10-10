package Lesson2;

public class hw4 {
    public static void main(String[] args) {
        {

            int t = -25;

            if (t < 30 && t > -30)
                if (t > -5) {
                    System.out.println("Тепло");
                } else if (t <= -5 && t > -20) {
                    System.out.println("Нормально");
                } else if (t <= -20) System.out.println("Холодно");
        }
    }
}
