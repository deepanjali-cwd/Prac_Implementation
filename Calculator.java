import java.util.Scanner;

public class Calculator {
    int a,b;

    //method for performing sum
    public int calculateSum(){
        
        return a+b;

    }
    // method for performing difference
    public int calculateDifference(){
        
        return a-b;
    }
    
    //creation of an obj
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();
        //take input from user
        System.out.println("Enter your first number:");
        calc.a = sc.nextInt();
        System.out.println("Enter your second number:");
        calc.b = sc.nextInt();

        calc.calculateSum();
        System.out.println("Sum :" + calc.calculateSum());
        calc.calculateDifference();
        System.out.println("Diff :" + calc.calculateDifference());

        sc.close();
        

        

    }


    
}
