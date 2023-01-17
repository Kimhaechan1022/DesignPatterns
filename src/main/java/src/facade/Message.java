package src.facade;

public class Message {

    private Row row;

    public Message(Row row) {
        this.row = row;
    }

    public String makeName(){
        return "name: " + row.getName() + "/";
    }
    public String makeBirthday(){
        return "birthday: " + row.getBirthday() + "/";
    }
    public String makeEmail(){
        return "email: " + row.getEmail() + "/";
    }


}
