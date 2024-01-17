public class Room {

    private boolean available = true;

    public void occupy(){
        available = false;
    }

    public void vacate(){
        available = true;
    }

    public boolean isAvailable(){
        return available;
    }


}
