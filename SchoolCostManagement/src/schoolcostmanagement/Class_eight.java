package schoolcostmanagement;

public class Class_eight extends Student{
    private final double monthly_fees = 1000;
    
    public Class_eight(int st_count, int fees_paid_st) {
        super(st_count, fees_paid_st);
    }
    
    public void monthlyFeesPaid(){
        fees_paid = st_count * monthly_fees;
        total_fees_paid += fees_paid;
        System.out.println("Fees collected: "+fees_paid);
    }
    
    public void reminder(){
        if(st_count > fees_paid_st){
            System.out.println("Remind the remaining class eight students to pay fees.");
        }
        else if(st_count == fees_paid_st){
            System.out.println("");
        }
        else{
            System.out.println("1.Kindly check your input\n"
                    +"2.Count total students of class eight carefully\n"
                    +"3.Count the receipt of fees paid class eight students carefully.");
        }
    }
    public void classFeesReport(){
        System.out.printf("Fees taken from class eight %d students out of %d students.\n",fees_paid_st,st_count);
        monthlyFeesPaid();
        reminder();
        System.out.println("");
    }
}
