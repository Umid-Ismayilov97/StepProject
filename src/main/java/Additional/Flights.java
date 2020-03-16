package Additional;

public class Flights {
    private int  day,month,year;
    private int hour,min;
    private final String starting = "Kiev";
    private String destination;
    private int id;
    private int seats;

    public Flights(int day, int month, int year, int hour, int min, String destination, int seats) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
        this.destination = destination;
        this.seats = seats;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public String getStarting() {
        return starting;
    }

    public String getDestination() {
        return destination;
    }

    public int getId() {
        return id;
    }

    public int getSeats() {
        return seats;
    }

    public void setId(int id) {
        this.id = id;
    }
}
