import java.util.Comparator;

public class TicketComparator2 implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if(o2.isVIP()){
            return 1;
        }else if
        (!o2.isVIP()){
            return -1;
        }else{
            return 0;
        }
    }
}
