package me.safronov.vyacheslav.testjunit;



import lombok.Data;




@Data

public class User {
    private String login ;
    private String email ;

    public User(String email) {
        this.email = email;
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {
    }

    public boolean checkTheCorrectSpellingEmail() {
        String str = email;
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            for (int y = 0; y < strChar.length; y++) {
                if (str.charAt(i) == '@' && str.charAt(y)=='.') {
                    return true;
                }
            }
        }
        throw new IncorrectEmailFormatException();
    }

    public boolean checkingForAMatchOfLoginAndEmail() {
        return login.equalsIgnoreCase(email);
    }

}
