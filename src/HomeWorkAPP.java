public class HomeWorkAPP {
    public static void main(String[] args) {
    System.out.println("Задание.1");
    int a = 0;
    int b = 1;
    boolean isBetween = isSumBetween10and20 (a , b);
    System.out.println (isBetween);

    System.out.println("Задание.2");
    printSignOf ( 13);

    System.out.println("Задание.3");
    boolean isNegative = isNegative ( -7);
    System.out.println (isNegative);

    System.out.println("Задание.4");
    print("Привет, земляне!", 7);

    System.out.println("Задание.5");
    boolean isLeap = isLeapOfYear (1962);
    System.out.println(isLeap);
    }
    public static boolean isSumBetween10and20 (int left, int right){
        int sum = left + right;
        return 10 < sum && sum <= 20;
    }
    public static void printSignOf (int number){
        if (number >= 0){
        System.out.println("Число положительное");
        } else {
        System.out.println("Число отрицательное");
        }

    }
    public static boolean isNegative (int number){
        return (number < 0);
    }
    public static void print(String messege, int count){
        for (int i = 0; i < count; i++){
            System.out.println(messege);
        }
    }
    public static boolean isLeapOfYear (int year){
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
        return true;
        } else {
        return false;
        }
    }
}
