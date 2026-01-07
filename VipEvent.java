public class VipEvent {
    private int eventFee;
    private int eventId;
    private String eventType;
    private int numberOfSeats;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getEventFee() {
        return eventFee;
    }

    public void setEventFee(int eventFee) {
        this.eventFee = eventFee;
    }
    public void register()
    {
        int fee;
        fee=2000;
        System.out.println("Fee:");
        System.out.println(fee);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
