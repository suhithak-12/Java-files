import java.util.Scanner;

class calc{
    public static void main(String[] args){
        System.out.println("Calculator");
        Scanner scan = new Scanner(System.in);
        char operator;
        //int continue;
        

        System.out.println("enter the first number");
        int num1 = scan.nextInt();
        System.out.println("enter the second number");
        int num2 = scan.nextInt();
        System.out.println("Enter the operator used");
        operator = scan.next().charAt(0);
        if(operator == '+'){
            int add = num1 + num2;
            System.out.println(add+ " ");

        }else if(operator == '-'){
            int sub = num1 - num2;
            System.out.println(sub+ " ");

        }else if(operator == '*'){
            int mul = num1 * num2;
           System.out.println(mul+ " ");

        }else if(operator == '/'){
            int div = num1 / num2;
            System.out.println(div+ " ");
        }
         System.out.println("do you want to continue? enter 1 for yes or any other for no");
         int choice = scan.nextInt();

         while(choice == 1){
         }
          System.out.println("Bye Bye");
}
}