public class Students {
    private String usernames;
    private String passwords;

     Students(String username, String password) {
        this.usernames = username;
        this.passwords = password;
    }
    public String getStudents(){
         return "UserName  :" + usernames + "\n passWord  :"+ passwords;
    }

    @Override
    public String toString() {
        return
                "usernames='" + usernames + '\'' +
                ", passwords='" + passwords + '\'' ;

    }
}