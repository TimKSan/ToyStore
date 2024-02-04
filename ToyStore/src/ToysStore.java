public class ToysStore {
    
    private int toyID;
    private String toyName;

    public ToysStore(int toyID, String toyName) {
        this.toyID = toyID;
        this.toyName = toyName;
    }

    public ToysStore() {

    }

    public int getToyID() {
        return toyID;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyID(int toyID) {
        this.toyID = toyID;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public void sendForDistribut(int id, String name) {
        PrizeDistributionPoint.giftGivingProcess(id, name);
        InvitationToParticipateInDraw.countWin++;
    }
}
