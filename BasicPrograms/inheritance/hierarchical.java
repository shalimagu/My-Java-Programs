package BasicPrograms.inheritance;

public class hierarchical {


    static class employees{
        String name;
        int age;
        String JoiningDate;
         int Basic_salary=10000;

    }


    static class permanentEmployee extends employees{
        void PE()
        {

            name=" Sherin";
            age=30;
            int bonus=1000;
            JoiningDate="13-06-2022";

            System.out.println("Permanent Employes:"+"Name:"+name+"  age:"+ age+"   Salary:"+(Basic_salary+bonus));

        }


    }
    static class partTimeEmployee extends employees{
        void ParE()
        {
            name="Mark";
            JoiningDate="12-05-2022";

            System.out.println("PartTime employee  "+"   Name:"+name+" "+"JoiningDate:" + JoiningDate+" "+ "Salary:"+Basic_salary);
        }
    }

    static class ContractEmployee extends employees{
        void CE()
        {
             name="Tom";
            JoiningDate="17-07-2023";
            int TA=100;
            int DA=250;


            System.out.println("Contract Employee"+" "+name+"  "+"JoiningDate:"+JoiningDate +" "+"Salary="+ (Basic_salary+TA+DA));

        }


    }

    public static void main(String[] args) {





        permanentEmployee PT=new permanentEmployee();
        PT.PE();
        ContractEmployee  C=new ContractEmployee();
        C.CE();
        C.JoiningDate="02-03-2012";
        partTimeEmployee P=new partTimeEmployee();
        P.ParE();


    }



}
