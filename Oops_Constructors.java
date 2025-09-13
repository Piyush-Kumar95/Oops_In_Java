
public class Oops_Constructors {

    String name;
    int Age ;

    //Create a Constructor
    Oops_Constructors(String n, int a){

        name = n;
        Age = a;

    }

    public static void main(String[] args) {

        Oops_Constructors std1 =   new Oops_Constructors("Piyush",19);
        System.out.println("Name : " + std1.name + " | " + "Age : " + std1.Age);


        Oops_Constructors std2 =   new Oops_Constructors("Raju",45);
        System.out.println("Name : " + std2.name + " | " + "Age : " + std2.Age);
    }

}
