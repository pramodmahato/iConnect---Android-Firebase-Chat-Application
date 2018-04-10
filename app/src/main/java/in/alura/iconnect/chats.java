package in.alura.iconnect;

public class chats {
    public String date;
    public String message;

    public chats(){

    }

    public chats(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    public String getMessage() {
        return message;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
