package staticcalculator;

import java.util.Scanner;

public class StaticCalculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c = 0;
        
        System.out.println("Which operation do you want?");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Mixed");
        
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter 1st number: ");
                a = sc.nextDouble();

                System.out.println("Enter 2st number: ");
                b = sc.nextDouble();
                c = add(a,b);
                System.out.println("The result of your addition is: "+c);
                break;
            case 2:
                System.out.println("Enter 1st number: ");
                a = sc.nextDouble();

                System.out.println("Enter 2st number: ");
                b = sc.nextDouble();
                c = sub(a,b);
                System.out.println("The result of your subtraction is: "+c);
                break;
            case 3:
                System.out.println("Enter 1st number: ");
                a = sc.nextDouble();

                System.out.println("Enter 2st number: ");
                b = sc.nextDouble();
                c = mul(a,b);
                System.out.println("The result of your multiplication is: "+c);
                break;
            case 4:
                System.out.println("Enter 1st number: ");
                a = sc.nextDouble();

                System.out.println("Enter 2st number: ");
                b = sc.nextDouble();
                c = div(a,b);
                System.out.println("The result of your division is: "+c);
                break;
            case 5:
                System.out.println("Enter number: ");
                a = sc.nextDouble();

                System.out.println("Enter number: ");
                b = sc.nextDouble();
                int another = 1;
                
                while(another == 1){
                System.out.println("Which operation do you want?");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                
                int choice2 = sc.nextInt();
                
                switch(choice2){
                    case 1:
                        c = add(a,b);
                        System.out.println("The result of your addition is: "+c);
                        break;
                    case 2:
                        c = sub(a,b);
                        System.out.println("The result of your subtraction is: "+c);
                        break;
                    case 3:
                        c = mul(a,b);
                        System.out.println("The result of your multiplication is: "+c);
                        break;
                    case 4:
                        c = div(a,b);
                        System.out.println("The result of your division is: "+c);
                        break;
                    default:
                        System.out.println("Wrong input.");
                        break;
                    }
                System.out.println("Want to do more calculations with previous result?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                another = sc.nextInt();
                if(another != 1){
                    break;
                }
                System.out.println("Enter new number");
                double temp = sc.nextDouble();
                a = c;
                b = temp;
                }
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }

    }
    
}
