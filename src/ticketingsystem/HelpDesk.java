package ticketingsystem;

public class HelpDesk {
private int id;
private String[] issueSbject;
private String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getIssueSbject() {
        return issueSbject;
    }

    public void setIssueSbject(String[] issueSbject) {
        this.issueSbject = issueSbject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
public boolean CreateMessage(){
    return true;
}
}
