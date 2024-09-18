public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("Задача №1");
        int[] arr = {10, 25, 16, 9, 20};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("«Сумма трат за месяц составила " + sum + " рублей»");


//Task 2
        System.out.println("Задача №2");
        int[] arr2 = {25, 15, 10, 30, 20};
        int arr2Max =Integer.MIN_VALUE ;
        int arr2Min= Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2Max < arr2[i]) {
                arr2Max=arr2[i];
            }
            if (arr2Min > arr2[i]) {
                arr2Min=arr2[i];
            }
        }
        System.out.println("«Минимальная сумма трат за неделю составила "
                    +arr2Min+ " рублей. Максимальная сумма трат за неделю составила "+arr2Max+" рублей»");


//Task 3
        System.out.println("Задача №3");
        int[] arr3 = {12, 23, 17, 9, 10};
        int sum3 = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum3 += arr3[i];
        }
        double average=(double) sum3/arr3.length;
        System.out.println("«Сумма трат за месяц составила " +average+" рублей»");
//Task 4
        System.out.println("Задача №4");
        char[] arr4 = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = arr4.length-1 ; i >=0; i--) {
                System.out.print(arr4[i]);
        }


    }
}