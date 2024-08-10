import java.util.Scanner;
class Seats {
    private int totalSeat;


    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    synchronized void bookTicket(int ticket) {
        if (totalSeat >= ticket) {
            totalSeat -= ticket;
            System.out.println(ticket + " Booking successful");
            System.out.println(totalSeat + " seats left. Book now!");
        } else {
            System.out.println(totalSeat + " seat(s) available only");
        }
    }
}

class MovieTicketBooking extends Thread {
    static Seats obj;
    private int s;

    public MovieTicketBooking(int s) {
        this.s = s;
    }

    @Override
    public void run() {
        obj.bookTicket(s);
    }

    public static void main(String[] args) {
        obj = new Seats();
        obj.setTotalSeat(100);
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            System.out.println("Enter number of seat(s) for booking: ");
            int stNm = sc.nextInt();
            MovieTicketBooking mtb = new MovieTicketBooking(stNm);
            mtb.start();
            System.out.println("Enter Y for more booking seat(s) or any other key to exit.");
            ch = sc.next();
        } while (ch.charAt(0) == 'Y' || ch.charAt(0) == 'y');

        sc.close();
    }
}
