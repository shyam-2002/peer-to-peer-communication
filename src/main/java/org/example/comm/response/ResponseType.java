package org.example.comm.response;


public enum ResponseType {

    JOIN(1), BLOCK(2);

    int id;

    ResponseType(int id) {
        this.id = id;
    }
}
