package schoolcostmanagement;

public class Teacher {
    
    int salary = 12000;
    int total_salary;

    public void salaryCount(int number){
        total_salary = salary * number;
    }
    
    @Override
    public String toString(){
        return "Total salary given to teachers: "+total_salary;
    }
}
