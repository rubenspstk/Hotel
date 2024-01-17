public class Person {

    private Hotel hotel;
    private int roomID;
    private Room room;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public String getName() {
        return this.name;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getRoomID() {
        return this.roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void checkIn(Hotel hotel) {
        hotel.checkIn(this);
        System.out.println(this.getName() + " just checked in at " + this.getHotel().getName());
    }

    public void checkOut(Hotel hotel) {
        String hotelName = this.getHotel().getName();
        hotel.checkOut(this);
        System.out.println(this.getName() + " just checked out from " + hotelName + ".");
    }

    public boolean isCheckedIn() {

        if (this.getHotel() != null) {
            System.out.println(this.getName() + " is checked in at " + this.getHotel().getName());
            return true;
        }
        System.out.println(this.getName() + " isn't checked in in any hotel");
        return false;

    }


}
