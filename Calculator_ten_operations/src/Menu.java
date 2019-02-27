import java.util.Scanner;

class Menu extends InputNumbers {

    private Scanner sc = new Scanner(System.in);

     void textMenu(){

        System.out.println("Addition press +");
        System.out.println("subtraction press -");
        System.out.println("division press /");
        System.out.println("multiplication press *");
        System.out.println("Rest press %");
        System.out.println("Absolute value press |");
        System.out.println("Max press x");
        System.out.println("Min press n");
        System.out.println("Factorial press !");
        System.out.println("Total power press ^");
        System.out.println("To exit press e");
    }

    void operations(){

       do {
           System.out.println("Enter symbol : ");
           symbol = sc.next().charAt(0);
           switch (symbol) {

               case '+':
                   System.out.println(getNum1() + getNum2());
                   break;

               case '-':
                   System.out.println(getNum1() - getNum2());
                   break;

               case '/':
                   System.out.println(getNum1() / getNum2());
                   break;

               case '*':
                   System.out.println(getNum1() * getNum2());
                   break;

               case '%':
                   System.out.println(getNum1() % getNum2());
                   break;

               case '|':
                   System.out.println(Math.abs(getNum1()) + " " + Math.abs(getNum2()));
                   break;

               case 'x':
                   System.out.println(Math.max(getNum1(), getNum2()));
                   break;

               case 'n':
                   System.out.println(Math.min(getNum1(), getNum2()));
                   break;

               case '!':
                   int fact1 = 1;
                   for (int i = 1; i <= getNum1(); i++) {
                       fact1 = fact1 * i;
                   }
                   int fact2 = 1;
                   for (int j = 1; j <= getNum2(); j++) {
                       fact2 = fact2 * j;
                   }
                   System.out.println(fact1 + " " + fact2);
                   break;

               case '^':
                   System.out.println((int) Math.pow(getNum1(), getNum2()));
                   break;

               default:
                   symbol = 'e';
                   break;
           }
       } while (symbol != 'e') ;
    }
}
