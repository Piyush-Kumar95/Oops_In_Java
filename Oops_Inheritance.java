
class Parent{

    void show1(){
        System.out.println("This is Parent Class ");
    }
}

class Child extends Parent{

    void show2(){
        System.out.println("This is Child Class ");
    }

}


public class Oops_Inheritance {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show1();
        obj.show2();
    }
}
