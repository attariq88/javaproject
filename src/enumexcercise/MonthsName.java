package enumexcercise;

public class MonthsName {
    private Months months;

    public MonthsName(Months months) {
        this.months = months;
    }

    public void whatToDo(){
        switch (months){
            case January:
                System.out.println("asas");
                break;
            case February:
                System.out.println("assaasasas");
                break;
            default:
                System.out.println("sd");
        }
    }

    public static void main(String[] args) {
        MonthsName monthsName = new MonthsName(Months.April);
        monthsName.whatToDo();
    }



}
