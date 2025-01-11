package org.example.serversidecode.comm;

import java.io.*;
import java.net.Socket;

public class SocketWrapper {

    private final Socket socket;
    private BufferedReader in;
    private BufferedWriter out;

    public SocketWrapper(Socket socket) throws IOException {
        this.socket = socket;
        this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
    }


    public String read() throws IOException {
        return in.readLine();
    }

    public void write(String msg) throws IOException {
        out.write(msg);
    }
}
