package BasicPrograms.inheritance;

public class singleInheritance {

    static class calculator {
        static void add() {
            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println("I am from base class  " + c);

        }

    }

    static class addition extends calculator {

        void floatadd() {
            float a1 = 19.3f;
            float a2 = 34.8f;
            float res = a1 + a2;
            System.out.println("I am from addition class own method  " + res);

        }

        void inherited() {
            System.out.print("I am from inherited class add () function");
            add();
        }

    }


    public static void main(String[] args) {
        calculator c = new calculator();
        addition a = new addition();

        c.add();
        a.inherited();
        a.floatadd();


    }

}



