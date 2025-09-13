// Create Class

class Animal{

    // Create  Method
    public void eat(String animal){
        System.out.println(animal+" Is Eating_____");
    }

    public void run(String animal){
        System.out.println(animal+" Is Running_____");
    }
}

public class Oops_Class_Object_Method {

    public static void main(String[] args) {

        //Create Object
        Animal Dog = new Animal();
        Dog.eat("Dog");
        Dog.run("Tiger");

    }
}
