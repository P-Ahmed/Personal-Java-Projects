package schoolcostmanagement;

import java.util.Scanner;

public class SchoolCostManagement {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input 1 if you want report:");
        int choice = sc.nextInt();
        if(choice == 1){
            
            Teacher obj = new Teacher();
            System.out.println("Enter the number of available teacher: ");
            int num = sc.nextInt();
            obj.salaryCount(num);

            Class_one one = new Class_one(23,23);
            one.classFeesReport();

            Class_two two = new Class_two(29,29);
            two.classFeesReport();

            Class_three three = new Class_three(22,22);
            three.classFeesReport();

            Class_four four = new Class_four(26,26);
            four.classFeesReport();

            Class_five five = new Class_five(30,30);
            five.classFeesReport();

            Class_six six = new Class_six(30,29);
            six.classFeesReport();

            Class_seven seven = new Class_seven(25,25);
            seven.classFeesReport();

            Class_eight eight = new Class_eight(28,28);
            eight.classFeesReport();

            Class_nine nine = new Class_nine(30,30);
            nine.classFeesReport();

            Class_ten ten = new Class_ten(30,30);
            ten.classFeesReport();

            System.out.println("\nTotal salary given to the teachers: ");
            System.out.println(obj.total_salary+"\n");

            System.out.println("\nTotal fees taken from all classes: ");
            System.out.println(Student.total_fees_paid+"\n");

            if(obj.total_salary >Student.total_fees_paid){
                System.out.println("We are in loss.The loss amount is: "+(Student.total_fees_paid - obj.total_salary));
                System.out.println("We need to advertise for more students and increase the quality of educational and other services.");
            }
            else if(obj.total_salary < Student.total_fees_paid){
                System.out.println("We are in profit.The profit amount is: "+(Student.total_fees_paid - obj.total_salary));
                System.out.println("Keep it up with good service to increase more revenue.");
            }
            else{
                System.out.println("We are nither in loss, neither in profit.The amount is: "+(Student.total_fees_paid - obj.total_salary));
                System.out.println("Advertise for more students and provide better education quality.");
            }
        }else{
            System.out.println("Thank you for your time.0");
        }
        
                
        
    }
    
}
