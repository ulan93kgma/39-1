import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Ticket> pq = new PriorityQueue<>(new TicketComparator());
        pq.add(new Ticket(40, true));
        pq.add(new Ticket(15, false));
        pq.add(new Ticket(70, true));
        pq.add(new Ticket(30, false));
        pq.add(new Ticket(20, true));
        pq.add(new Ticket(60, false));
        pq.add(new Ticket(50, false));

        PriorityQueue<Ticket> pq1 = new PriorityQueue<>(new TicketComparator2());
        pq1.add(new Ticket(40, true));
        pq1.add(new Ticket(15, false));
        pq1.add(new Ticket(70, true));
        pq1.add(new Ticket(30, false));
        pq1.add(new Ticket(20, true));
        pq1.add(new Ticket(60, false));
        pq1.add(new Ticket(50, false));


        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getCost());
        }
        System.out.println("-----------------------------");
        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll().isVIP());
        }

    }
}
