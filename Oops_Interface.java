
interface Main{

     void pay();
     void user(String name);
}


class gPay implements Main{

    public void pay(){
        System.out.println("Pay Payment From GPay");
    }

    public void user(String name){
        System.out.println("Pay Holder Name :"+name);
    }
}


class PePhone implements Main{

    public void pay(){
        System.out.println("Pay Payment From PePhone");
    }

    public void user(String name){
        System.out.println("Pay Holder Name : "+name);
    }
}


public class Oops_Interface {
    public static void main(String[] args) {

        gPay obj = new gPay();
        obj.pay();
        obj.user("Raju");

        System.out.println();

        PePhone obj2 = new PePhone();
        obj2.pay();
        obj2.user("Rani");
    }
}
