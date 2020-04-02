package schoolcostmanagement;

public class Class_seven extends Student{
    private final double monthly_fees = 900;
    
    public Class_seven(int st_count, int fees_paid_st) {
        super(st_count, fees_paid_st);
    }
    
    public void monthlyFeesPaid(){
        fees_paid = st_count * monthly_fees;
        total_fees_paid += fees_paid;
        System.out.println("Fees collected: "+fees_paid);
    }
    
    public void reminder(){
        if(st_count > fees_paid_st){
            System.out.println("Remind the remaining class seven students to pay fees.");
        }
        else if(st_count == fees_paid_st){
            System.out.println("");
        }
        else{
            System.out.println("1.Kindly check your input\n"
                    +"2.Count total students of class seven carefully\n"
                    +"3.Count the receipt of fees paid class seven students carefully.");
        }
    }
    public void classFeesReport(){
        System.out.printf("Fees taken from class seven %d students out of %d students.\n",fees_paid_st,st_count);
        monthlyFeesPaid();
        reminder();
        System.out.println("");
    }
}
