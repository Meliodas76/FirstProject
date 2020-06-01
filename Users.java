public class Users {
    String nick;
    String pass;

    public Users(String name, String pass){
        this.nick = name;
        this.pass = pass;
    }
    public Users(){
        nick = "";
        pass = "";
    }

    public void setNick(String name){
        this.nick = name;
    }

    public void setPass(String pass){
        this.pass= pass;
    }

    public String getNick(){
        return nick;
    }

    public String getPass(){
        return pass;
    }






}
