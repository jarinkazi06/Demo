package method;

public class LearnMethod {

    public int doSummation(){
        int num1=50;
        int num2=60;
        int total=num1+num2;
        //System.out.println("Total of two value: "+total);
        return total;
    }

    public int doSum(int number1,int number2){
        int num1=number1;
        int num2=number2;
        int total=num1+num2;
        System.out.println("Total value "+total);
        return total;
    }


    public int doSubs(int number1,int number2) {
        int num1 = number1;
        int num2 = number2;
        System.out.println("Subtraction value "+(num1-num2));
        return num1 - num2;
    }

    public int doSubtraction(int number1,int number2){
        System.out.println("Subtraction value "+(number1-number2));
        return number1-number2;
    }

    public double doMultiply(double number1,double number2){
        return number1*number2;
    }


 public static void checkDisplay(){
     System.out.println("Method");
 }

 public void studentInformation(){
        String name="James";
        String address="Queens,NY";
     System.out.println("Student name is "+name+" Student address is "+address);
 }

 public void salaryCalculation(){
        int month=12;
        double salary=4500.500;
        double yearlySalary=month*salary;
     System.out.println("Yearly Salary "+yearlySalary);
 }

public void doDivision(double num1, double num2){
        double result=num1/num2;
    System.out.println("Division result "+result);
}

public static void stInfo(String name,String address,String dob,String phoneNumber){
    System.out.println("Student name "+name+" Address "+address+" DOB "+dob+" Phone Number "+phoneNumber);
}




    public static void main(String[] args) {
        LearnMethod.checkDisplay();
        LearnMethod learn=new LearnMethod();
        int salary=4000;
        double totalSalary=salary+learn.doSummation();
        System.out.println("Total Salary "+totalSalary);
        learn.doSummation();
        learn.doSubs(340,40);
        learn.doSum(200,36);
        learn.doSubtraction(400,300);
        learn.doMultiply(30,25);
        System.out.println(learn.doMultiply(40,35));
        learn.studentInformation();
        learn.salaryCalculation();
        learn.doDivision(300,23);
        LearnMethod.stInfo("John","New York,NY","7/7/85","1234567890");
    }

}
