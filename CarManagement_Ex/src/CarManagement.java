import java.util.*;

public class CarManagement {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);
        String model;
        double price;
        ElectricCar aCar;

        Car anotherCar = new Car();

        ArrayList<ElectricCar> electricCars = new ArrayList<>(); //Array of Cars


        //Populates the electricCar Array
        for(var i = 0; i < electricCars.size(); i++){
            System.out.print("Please enter name of Car: ");
            model = input.nextLine();

            System.out.print("Please enter the price of Car: ");
            price = Double.parseDouble(input.nextLine());
            aCar = new ElectricCar(model, price);
            
            //Now Add Car instance on line 20 to the Arraylist
            electricCars.add(aCar);
        }

       //Output the Electric Cars
       // for each loop 
        for (Car x : electricCars) {
            System.out.println(x);
    }



    }
}
