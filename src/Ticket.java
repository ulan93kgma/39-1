public class Ticket {
    private int cost;
    private boolean isVIP;

    public Ticket(int cost, boolean isVIP) {
        this.cost = cost;
        this.isVIP = isVIP;
    }

    public int getCost() {
        return cost;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
        if (isVIP == true){
            return ;
        }
    }

}
