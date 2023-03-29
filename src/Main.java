public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum=sum+element;
            //System.out.println(element);
        }
        System.out.println("Сумма трат за месяц составила " +sum+ " рублей");

        System.out.println("Задача 2");
        int min = 200_000;
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+ " рублей.");
        System.out.println("Максимальная сумма трат за день составила "+max+ " рублей.");

        System.out.println("Задача 3");
        double sumA= sum;
        double amountA= arr.length;
        double average = sumA/ amountA;
        System.out.println("Средняя сумма трат за месяц составила " +average+ " рублей.");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length-1; j>=0; j--) {
            System.out.print(reverseFullName[j]);
        }
        System.out.println();
    }
}