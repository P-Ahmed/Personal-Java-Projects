package schoolcostmanagement;

public class Student {
    int st_count;
    int fees_paid_st;
    double fees_paid;
    static double total_fees_paid = 0;
    Student(int st_count,int fees_paid_st){
        this.st_count = st_count;
        this.fees_paid_st = fees_paid_st;    
    }
    
}
