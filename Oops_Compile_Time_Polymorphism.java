
//  Use by Method Overloading

class Compile{

    void Name(){
        System.out.println("Compile Time Polymorphism ");
    }

    void Name(String name){
        System.out.println("Compile Time Polymorphism by "+name);

    }

    void run(int n){

        System.out.println("Any Number Type : "+n);

    }
    void run(String name,int a){

        System.out.println("Name : "+name+" | "+"Age "+a);

    }

}



public class Oops_Compile_Time_Polymorphism {

    public static void main(String[] args) {

        Compile obj = new Compile();
        obj.Name();
        obj.Name("Piyush");

        System.out.println(" ");

        Compile obj2 = new Compile();
        obj2.run(458);
        obj2.run("Raju",45);
    }
}
