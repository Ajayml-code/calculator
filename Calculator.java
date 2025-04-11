public class Calculator{
    double a;
    double b;
    public Calculator(double a,double b){
        this.a=a;
        this.b=b;
    }
    void sum(){
        System.out.println("sum of a and b is : "+(a+b));
    }
    void substract(){
        System.out.println("substraction of a and b : "+(a-b));

    }
    void multiply(){
        System.out.pritnln("multiplication of two numbers : "+(a*b));
    }
    public static void main(String[] args){
        Calculator obj=new Calculator(5,10);
        System.out.println("sum is : " +obj.sum());
    }
}