package day2;

public class Var {
    //Global variable
     String city ="Bangalore";
     static String state ="Karnataka";
    public static void main(String[] args) {
        //non static
        Var var = new Var();
        var.city ="Hyd";
        System.out.println(var.city );
        System.out.println(state);

    }
    public static void register(){

    }
}
