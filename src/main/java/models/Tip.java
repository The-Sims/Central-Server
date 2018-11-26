package models;

public class Tip {
    int tipId;
    String origin;
    String sender;
    String message;
    String location;

    public Tip(int tipId, String origin, String sender, String message, String location) {
        this.tipId = tipId;
        this.origin = origin;
        this.sender = sender;
        this.message = message;
        this.location = location;
    }

    public Tip(String origin, String sender, String message, String location) {
        this.tipId = -1;
        this.origin = origin;
        this.sender = sender;
        this.message = message;
        this.location = location;
    }

    public int getTipId(){
        return tipId;
    }

    public void setTipId(int tipId) {
        this.tipId = tipId;
    }
}
