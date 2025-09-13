
// Oops_Hierarchical_Inheritance

class A1{

    void showA1(){
        System.out.println("Show A1 Class");
    }

}

class B1 extends A1{

    void showB1(){
        System.out.println("Show B1 Class");
    }
}

class C1 extends A1{

    void showC1(){
        System.out.println("Show C1 Class");
    }
}

public class Oops_Hierarchical_Inheritance {

    public static void main(String[] args) {

        C1 obj1 = new C1();
        obj1.showA1();
        obj1.showC1();

        B1 obj2 = new B1();
        obj2.showA1();
        obj2.showB1();

    }
}
