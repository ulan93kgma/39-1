import java.util.Comparator;

public class TicketComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o1.getCost() - o2.getCost();
    }

}
