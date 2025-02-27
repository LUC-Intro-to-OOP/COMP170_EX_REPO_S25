abstract class Car{
    protected String name;
    protected String model;
    protected double price;
   
    private final double DISCOUNT_OFFER = .20;

   abstract protected String CompanyName();




    @Override
    public String toString(){

        return String.format("Name: " + name + " Model: " + model + " Price: "  + price + " Discount: $" + discountPrice());

    }
  

}
