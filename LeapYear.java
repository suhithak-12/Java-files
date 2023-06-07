
import java.util.Scanner; //required to run a scanner 
class leapyear{
    //taking user input
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year: ");
        int inputnum = sc.nextInt();

        if(inputnum%4 == 0|| inputnum%400 == 0){ //calling the function to run as a leap year if it is divisible by either 4 or 400
            System.out.println(inputnum+ " is a leap year"); //print statement
        }else{ //running it false if it isn't 
            System.out.println(inputnum+ " is not a leap year"); //print statement 
        }
        }
    }
