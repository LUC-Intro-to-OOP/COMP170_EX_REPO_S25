public class Apartment {
    
    //Properties
    private String name;
    private String address;
    private int floorCount;

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

}
