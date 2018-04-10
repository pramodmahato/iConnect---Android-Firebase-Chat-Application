package in.alura.iconnect;



public class requests {

    private String user_name,user_status,user_thumbimage;


    public String request_type;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_thumbimage() {
        return user_thumbimage;
    }

    public void setUser_thumbimage(String user_thumbimage) {
        this.user_thumbimage = user_thumbimage;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public requests(String user_name, String user_status, String user_thumbimage, String request_type) {
        this.user_name = user_name;
        this.user_status = user_status;
        this.user_thumbimage = user_thumbimage;
        this.request_type = request_type;
    }
}
