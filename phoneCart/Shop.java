package phoneCart;

import java.util.ArrayList;



public class Shop {
    public static void main(String[] args) {

        Phone m1=new Phone("SAMSUNG ",2000,"SAMSUNG On8",PhoneType._5G);
        Phone m2=new Phone("Google",3000,"Google pixel", PhoneType._6G);
        Phone m3=new Phone("VIVO",3500,"V20", PhoneType._5G);


        ArrayList<Phone> l= new ArrayList<>();
        l.add(m1);

        l.add(m2);

        l.add(m3);

        for (Phone p:l){
            System.out.println(p);
        }
        m1.exchange();
        m2.repair();
        m3.sell();
    }
}
