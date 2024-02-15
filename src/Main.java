import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");
        int[] numbers = new int[4];
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i);
        }
        double[] fraction = {1.57, 7.654, 9.986};
        for (int x = 0; x < fraction.length; x++) {
            System.out.println(fraction[x]);
        }
        int[] box = new int[5];
        box[0] = 1;
        box[1] = 5;
        box[2] = 10;
        box[3] = 15;
        for (int y = 0; y < box.length; y++) {
            System.out.println(box[y]);
        }

        System.out.println("Задание 2");
        numbers = new int[]{2, 5, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int x = 0; x < fraction.length; x++) {
            if (x == fraction.length - 1) {
                System.out.println(fraction[x]);
                break;
            }
            System.out.print(fraction[x] + ", ");
        }
        for (int y = 0; y < box.length; y++) {
            if (y == box.length - 1) {
                System.out.println(box[y]);
                break;
            }
            System.out.print(box[y] + ", ");
        }

        System.out.println("Задание 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int x = fraction.length - 1; x >= 0; x--) {
            if (x == 0) {
                System.out.println(fraction[x]);
                break;
            }
            System.out.print(fraction[x] + ", ");
        }
        for (int y = box.length - 1; y >= 0; y--) {
            if (y == 0) {
                System.out.println(box[y]);
                break;
            }
            System.out.print(box[y] + ", ");
        }
        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
        }System.out.println(Arrays.toString(numbers));

    }
}