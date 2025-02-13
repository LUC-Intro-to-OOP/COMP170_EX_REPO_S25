import java.util.Scanner;
public class LoopLuxuryLiving {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
       
      
        //Declared the array
        Apartment [] apartments = new Apartment[3];

        for(var i = 0; i < apartments.length; i++){
            //create the object instance
            String inputName, inputAddress;
            int floorCount;

            //Create the new object instance
            apartments[i] = new Apartment();

            System.out.print("Please enter name of Apartment " + (i+1));
            inputName = input.nextLine();
            apartments[i].name = inputName;

            System.out.println("Please enter Address:");
            inputAddress = input.nextLine();
            apartments[i].address = inputAddress;


            System.out.println("Please enter Floor Count:");
            floorCount = Integer.parseInt(input.nextLine());
            apartments[i].floorCount = floorCount;
        }

        for(int x=0; x < apartments.length; x++){
            System.out.println(apartments[x].name + " " + apartments[x].address + " " + apartments[x].floorCount);
        }
    }
}
