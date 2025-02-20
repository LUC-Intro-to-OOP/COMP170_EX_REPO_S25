import java.util.Scanner;
public class LoopLuxuryLiving {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

       Apartment anApartment = new Apartment();

        System.out.println(anApartment);
       
        Apartment one_apartment = new Apartment("1000M", "123 Michigan Ave.", 44, 7000.00); //Declare an apartment object - Instantiation
        Apartment second_apartment = new Apartment("Amli 900", "900 S Clark St.", 26, 3800.00);

        

        System.out.println(one_apartment);
        System.out.println(second_apartment);

    }
}
