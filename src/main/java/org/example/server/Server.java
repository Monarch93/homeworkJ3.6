package org.example.server;


import org.example.authentication.AuthenticationService;

import java.util.concurrent.ExecutorService;

public interface Server {
    void broadcastMessage(String message);

    void sendPrivateMessage(ClientHandler sender, String nickname, String message);

    boolean isLoggedIn(String nickname);

    void subscribe(ClientHandler client);

    void unsubscribe(ClientHandler client);

    AuthenticationService getAuthenticationService();

    ExecutorService getExecutorService();
}
