import java.util.Scanner;
public class LoopLuxuryLiving {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
       
        Apartment one_apartment = new Apartment(); //Declare an apartment object - Instantiation
        Apartment second_apartment = new Apartment();

        one_apartment.setName("Amli 900");
        one_apartment.setAddress("123 Loyola Drive");
        one_apartment.setFloorCount(12);

        second_apartment.setName("1000M");
        second_apartment.setAddress("123 Loyola Drive");
        second_apartment.setFloorCount(12);

        System.out.println("Name: " + one_apartment.getName() + " Address: " + one_apartment.getAddress() + " Floor Count: " + one_apartment.getFloorCount());
        System.out.println("Name: " + second_apartment.getName() + " Address: " + second_apartment.getAddress() + " Floor Count: " + second_apartment.getFloorCount());

    }
}
