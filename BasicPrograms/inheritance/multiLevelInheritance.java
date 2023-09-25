package BasicPrograms.inheritance;

public class multiLevelInheritance {
    static class Bank {
        String bank_name;
        String Branch_name;
        float interest;


    }
    static class SBI extends Bank{

        String User_name;
        String location;




    }
    static class loan extends SBI
    {

        int loan_amount;

    }

    public static void main(String[] args) {
        loan l1=new loan();
        l1.bank_name="sbi";
        l1.location="Bangalore";
        l1.Branch_name="MG Road";
        l1.User_name="Shalima";
        l1.loan_amount=20000;
        l1.interest=12.0f;

        System.out.println(l1.bank_name);
        System.out.println(l1.Branch_name);
        System.out.println(l1.location);
        System.out.println(l1.User_name);
        System.out.println(l1.loan_amount);
        System.out.println(l1.interest);



    }


}
