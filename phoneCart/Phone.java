package phoneCart;



public class Phone implements Exchangeable,Repairable,Sellable{
   private String name;
    private int price;
   private String model;
   private PhoneType phoneType;


        Phone(String name, int price, String model, PhoneType phoneType){
            this.name=name;
            this.model=model;
            this.price=price;
            this.phoneType=phoneType;

        }

    public String toString(){
        return "Name: " + name + " || Price: $" +price+"||model:"+model+"||PhoneType:"+phoneType ;
    }


    @Override
    public void exchange() {
        System.out.println("The Samsung Phone are having Exchange Offer");
    }

    @Override
    public void repair() {
            System.out.println("The Google Phone are having 2 month Service");

    }

    @Override
    public void sell() {
        System.out.println("The Vivo Phone are out of stock!!!!");
    }
}
