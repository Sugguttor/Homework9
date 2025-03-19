public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] arr = {62, 58, 71, 67, 60};
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();

        System.out.println("Задание 2");
        int[] secondArr = {60, 50, 30, 60, 80};
        int max = secondArr[0];
        int min = secondArr[0];
        for (int secondIndex = 1; secondIndex < secondArr.length; secondIndex++) {
            if (secondArr[secondIndex] <= min) {
                min = secondArr[secondIndex];
            }
        }
        for (int secondIndex = 1; secondIndex < secondArr.length; secondIndex++) {
            if (secondArr[secondIndex] >= max) {
                max = secondArr[secondIndex];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println();

        System.out.println("Задание 3");
        int[] thirdArr = {166, 155, 133, 166, 188};
        int secondSum = 0;
        for (int element : thirdArr) {
            secondSum += element;
        }
        double averageValue = (double) secondSum / thirdArr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");
        System.out.println();

        System.out.println("Задание 4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int thirdIndex = reverseFullName.length-1; thirdIndex >=0; thirdIndex--) {
            System.out.print(reverseFullName[thirdIndex]);
        }
    }
}