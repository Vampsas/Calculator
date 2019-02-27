import java.util.Scanner;

 class InputNumbers {

    private Scanner sc = new Scanner(System.in);

    private int num1, num2;
    char symbol;

     int getNum1() {
        return num1;
    }

     int getNum2() {
        return num2;
    }

     void numbers(){

        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

    }
}
