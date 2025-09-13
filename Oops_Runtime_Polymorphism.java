
// Run Time Polymorphism

class A2{

    void show(String n){
        System.out.println("Show A2 Class"+n);

    }
}

class B2 extends A2{

    @Override
    void show(String n){
        System.out.println("Show B2 Class "+n);
    }
}

public class Oops_Runtime_Polymorphism {

    public static void main(String[] args) {

        B2 obj = new B2();
        obj.show("By Piyush");
    }
}
