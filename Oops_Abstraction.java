
abstract class vehicle {

    int no_of_tyre;

    void displayTyres(){
        System.out.println("Number of Tyre : "+no_of_tyre);
    }

    abstract void start();
}


class car extends vehicle{

    void start(){

        no_of_tyre = 4;
        System.out.println("Car Start with Key ");
    }
}


class scooter extends vehicle{

    void start(){

        no_of_tyre = 2;
        System.out.println("Scooter Start with Kick");
    }

}

public class Oops_Abstraction 
{
    public static void main(String[] args) {

        vehicle car = new car();
        car.start();
        car.displayTyres();
        System.out.println();
        vehicle scooter = new scooter();
        scooter.start();
        scooter.displayTyres();
    }
}
