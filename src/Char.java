public class Char {
    public static void main(String[] args) {
        int temp = 20;
        int time = 24;
        boolean late = time >= 23;

        boolean hot = temp > 25;
        if (!hot && late) {
            System.out.println(" Кондиционер выключен");
        }
    }
}

