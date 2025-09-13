
// Single Inheritance

class First{

    void showFirst(){
        System.out.println("Show First Class");
    }

}

class Second extends First{

    void showSecond(){
        System.out.println("Show Second Class ");
    }

}

public class Oops_Single_Inheritance {

    public static void main(String[] args) {

        Second obj = new Second();
        obj.showFirst();
        obj.showSecond();

    }
}
