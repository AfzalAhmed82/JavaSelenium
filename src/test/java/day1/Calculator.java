package day1;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); //class object
        cal.addNumber(10,20);

    }
    public void addNumber(int x, int y){
        int sum = x+y;
        System.out.println("Sum = " + sum);
    }

    public void subNumber(int x, int y){
        int sum = x-y;
        System.out.println("Sum = " + sum);
    }
    public void divNumber(float x, float y){
        float rem = x+y;
        System.out.println("Reminder = " + rem);
    }
    /**
     *  <access modifier> <return type> <method name> (list of parameters)
     *  {
     *      //body
     *  }
     */

}
