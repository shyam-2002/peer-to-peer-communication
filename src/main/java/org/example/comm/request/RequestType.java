package org.example.comm.request;

import java.util.HashMap;
import java.util.Map;

public enum RequestType {
    JOIN(1), BLOCK(2);

    int id;

    RequestType(int id) {
        this.id = id;
    }

    private static Map<Integer, RequestType> types = new HashMap<>();

    static {
        for (RequestType type : RequestType.values()) {
            types.put(type.id, type);
        }
    }

    public static RequestType get(int id) {
        return types.get(id);
    }
}
