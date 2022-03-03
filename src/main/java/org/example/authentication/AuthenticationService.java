package org.example.authentication;


import org.example.database.SQLService;

public class AuthenticationService {
    public String getNicknameByLoginAndPassword(String login, String password) {
        return SQLService.getNicknameByLoginAndPassword(login, password);
    }

    public boolean registration(String password, String nickname) {
        return SQLService.registration(nickname, password);
    }

    public boolean changeNick(String oldNick, String newNick) {
        return SQLService.changeNick(oldNick, newNick);
    }
}
