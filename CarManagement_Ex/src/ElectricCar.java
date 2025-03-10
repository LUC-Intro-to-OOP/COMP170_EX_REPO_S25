public class ElectricCar extends Car implements CarOperations {
    final double DISCOUNT_OFFER = .20;

    
     //Constructor
     public ElectricCar(){
         name = "N/A";
         model = "N/A";
         price = 0;
     }
 
     public ElectricCar(String name, String model, double price){
         this.name = name;
         this.model = model;
         this.price = price;
         discountPrice();
     }
 
     public ElectricCar(String model, double price){
         name = "Mazda";
         this.price = price;
     }

     @Override
     public String CompanyName(){
        return "Electric Car Company";
     }
 
 
     //Getter and Setter methods
 
 
     //Setter methods
     public void setName(String aName){
         //set name property
         name = aName;
     }
 
     public void setModel(String model){
         //set name property
         this.model = model;
     }
 
     public void setPrice(double price){
         this.price = price;
     }
 
     //Getters
     public String getName(){
         return name;
     }
 
     public String getModel(){
         return model;
 
     }
 
     public double getPrice(){
         return price;
     }
 
     //Method that calculates discounted price
     private double discountPrice(){
         return price * (1 - DISCOUNT_OFFER);
     }
 
     @Override
     public String toString(){
 
         return String.format("Electric Car Name: " + name + " Model: " + model + " Price: "  + price + " Discount: $" + discountPrice());
 
     }

    @Override
    public void addCar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCar'");
    }

    @Override
    public void deleteCar(String itemName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCar'");
    }

    @Override
    public void modifyCar(String oldItemName, String newItemName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyCar'");
    }

    @Override
    public void displayCarList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayCarList'");
    }
}
