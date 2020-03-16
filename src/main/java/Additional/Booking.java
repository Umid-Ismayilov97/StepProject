package Additional;

public class Booking {
    private Person person;
    private Flights flight;
    private int id;

    public Booking(Person person, Flights flight, int id) {
        this.person = person;
        this.flight = flight;
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public Flights getFlight() {
        return flight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Booking{person=%s, flight=%s, id=%d}", person, flight, id);
    }
}
