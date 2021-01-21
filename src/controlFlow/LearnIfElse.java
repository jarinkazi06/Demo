package controlFlow;

public class LearnIfElse {

    public static void main(String[] args) {
        int number = 26;
        if (number == 24) {
            System.out.println("Number is 24");
        } else {
            System.out.println("Number is not 24");
        }

        int age = 16;
        if (age >= 18 && age <= 21) {
            System.out.println("You are adult but can't buy cigarette");
        } else {
            System.out.println("You're not adult");
        }

        String gender = "female";
        if (gender == "female" || age >= 50 && number == 32) {
            System.out.println("You do not have to buy ticket");
        } else {
            System.out.println("You have to buy ticket");
        }

        if (gender == "male" || age >= 50 && number == 32) {
            System.out.println("Male do not have to buy ticket");
        } else {
            System.out.println("Male have to buy ticket");
        }


    }
}