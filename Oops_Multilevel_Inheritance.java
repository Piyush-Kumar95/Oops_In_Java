
// Multilevel Inheritance

class A{

    void showA(){
        System.out.println("Show A Class ");
    }

}

class B extends A{

    void showB(){
        System.out.println("Show B Class ");
    }
}

class C extends B{

    void showC(){
        System.out.println("Show C Class ");
    }

}

class D extends C{

    void showD(){
        System.out.println("Show D Class ");
    }
}


public class Oops_Multilevel_Inheritance {

    public static void main(String[] args) {

        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
        obj.showD();
    }
}
