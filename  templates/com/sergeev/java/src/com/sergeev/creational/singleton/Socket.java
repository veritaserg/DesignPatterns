package com.sergeev.creational.singleton;

public class Socket {
    private static Socket socket;

    public static synchronized Socket getSocket(){
        if (socket==null)
            socket = new Socket();

        return socket;
    }
    private Socket(){}
}
