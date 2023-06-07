import java.util.Scanner;
class results{
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter your first score: "); 
       int score1 = sc.nextInt();
       System.out.println("Enter your second score: "); 
       int score2 = sc.nextInt();
       System.out.println("Enter your third score: "); 
       int score3 = sc.nextInt();

        int sum = score1 + score2 + score3;
        System.out.println("Your total score is: " +sum);
    
        int avg = sum/3;
        System.out.println("your average score is: " +avg); 

        if(avg>80){
            System.out.println("Good job! ");
        }else{
            System.out.println("Try harder");
        }
        }
       

    }
