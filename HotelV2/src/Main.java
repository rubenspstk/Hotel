public class Main {
    public static void main(String[] args) {

        Person person = new Person("Rúben");
        Person person1 = new Person("Inês");
        Hotel ritz = new Hotel("Ritz", 10);

        person.isCheckedIn();
        person.checkIn(ritz);
        person.isCheckedIn();
        System.out.println("Is room number " + person.getRoomID() + " available? " + ritz.getRoom(1).isAvailable());

        person1.isCheckedIn();
        person1.checkIn(ritz);
        person1.isCheckedIn();
        System.out.println("Is room number " + person1.getRoomID() + " available? " + ritz.getRoom(2).isAvailable());

        person.checkOut(ritz);
        person.isCheckedIn();

        person1.checkOut(ritz);
        person1.isCheckedIn();

    }
}