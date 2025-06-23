class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movie, String seat, double p) {
        movieName = movie;
        seatNumber = seat;
        price = p;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();
        m.bookTicket("Avengers", "A10", 250.0);
        m.displayTicket();
    }
}
