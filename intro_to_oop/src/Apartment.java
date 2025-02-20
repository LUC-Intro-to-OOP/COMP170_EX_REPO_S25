public class Apartment {
    
    //Properties
    private String name;
    private String address;
    private int floorCount;
    private double rent;

    //Default constructor
    public Apartment(){
        name = "N/A";
        address = "N/A";
        floorCount = 0;
        rent = 4700.00;
    }

    //Overload a default construction
    public Apartment(String name, String address, int floors, double rent){
        this.name = name;
        this.address = address;
        floorCount = floors;
        this.rent = rent;

    }

    //Setter methods
    public void setName(String aName){
        name = aName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setFloorCount(int count){
        floorCount = count;
    }

    public void setRent(double rent){
        this.rent = rent;
    }

    //getter methods
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getFloorCount(){

        return floorCount;
    }
    public double getRent(){
        return rent;
    }


    //String representation of the apartment class
     @Override  //Annotation
    public String toString(){
        return String.format("Name: " + name + " Address: " + address + " Floor Count: " + floorCount + " Rent: " + rent );
    }
        


}
