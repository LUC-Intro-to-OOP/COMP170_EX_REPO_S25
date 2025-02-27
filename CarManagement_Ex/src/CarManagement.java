public class CarManagement {
    public static void main(String[] args) throws Exception {
       
        Car sampleCar = new Car();
        Car carWithInfo = new Car("Benz", "G Class", 76000.00);
        Car carWithLimitedInfo = new Car("Ford", 50_000.00);
        System.out.println(sampleCar);
        System.out.println(carWithInfo);
        System.out.println(carWithLimitedInfo);


    }
}
