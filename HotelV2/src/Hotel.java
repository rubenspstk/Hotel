public class Hotel {

    private Room[] rooms;
    private String name;

    public Hotel(String name, int numRooms) {
        this.name = name;
        rooms = new Room[numRooms];

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            rooms[i].vacate();
        }
    }

    public void checkIn(Person person) {
        int roomNr = -1;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isAvailable()) {

                roomNr = i + 1;
                person.setHotel(this);
                person.setRoomID(roomNr);
                rooms[i].occupy();
                System.out.println(person.getName() + " will stay in room number " + roomNr);
                return;
            }
        }
        if (roomNr == -1) {
            System.out.println(this.getName() + " doesn't have available rooms.");
        }

    }

    public void checkOut(Person person) {
        rooms[person.getRoomID()].vacate();
        person.setHotel(null);
        person.setRoomID(-1);
    }

    public String getName() {
        return name;
    }

    public Room getRoom(int roomNumber) {
        return rooms[roomNumber - 1];
    }
}
