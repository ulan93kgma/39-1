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
        for (Ticket i : pq) {
            if (i.isVIP() == true) {
                System.out.println(i.isVIP());
            }
        }
        System.out.println("-----------------------------");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getCost());
        }

    }
}
