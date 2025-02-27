import java.util.Scanner;
public class CarManagement {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);
        String model;
        double price;

        ElectricCar [] electricCars = new ElectricCar[2]; //Array of Cars


        //Populates the electricCar Array
        for(var i = 0; i < electricCars.length; i++){
            System.out.print("Please enter name of Car: ");
            model = input.nextLine();

            System.out.print("Please enter the price of Car: ");
            price = Double.parseDouble(input.nextLine());
            electricCars[i] = new ElectricCar(model, price);
        }

       //Output the Electric Cars
       // for each loop 
        for (Car aCar : electricCars) {
            System.out.println(aCar);
    }



    }
}
