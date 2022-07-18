public class Main {
    public static void main(String[] args) {
        int newage = 40;
        if (newage < 0) {
            System.out.println("False age");
        }

        else if (newage < 18)
        {
            System.out.println("You are not adult");
        }
        else
        {
            System.out.println("You are adult");
        }

        int years = 10;
        double coef = 1;
        int current_salary = 1000;

        if (years<1) {
            coef = 1;
        }

        else if (years<=3) {
            coef = 1.1;
        }

        else {
            coef = 1.2;
        }

        double new_salary = (current_salary * coef);

        if (new_salary<4000) {
            new_salary = new_salary + 1000;
        }
        else  {
            new_salary = new_salary + 500;
        }

        System.out.println(new_salary);

        int sum = 0;

        for (int i = 1; i <=50; i++) {

            sum = sum + i;

        }

        System.out.println(sum);

    }

}