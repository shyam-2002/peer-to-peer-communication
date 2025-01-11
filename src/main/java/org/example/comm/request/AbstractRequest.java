package org.example.comm.request;

public abstract class AbstractRequest implements Request {
    private RequestType requestType;
    private String userId;

    public AbstractRequest() {
    }

    public AbstractRequest(Builder<?, ?> b) {
        this.requestType = b.requestType;
        this.userId = b.userId;
    }

    public static abstract class Builder<T extends AbstractRequest, E extends Builder<T, E>> {
        private RequestType requestType;
        private String userId;

        public E requestType(RequestType requestType) {
            this.requestType = requestType;
            return self();
        }

        public E userId(String userId) {
            this.userId = userId;
            return self();
        }

        public abstract T build();

        public abstract E self();
    }

    @Override
    public RequestType requestType() {
        return requestType;
    }

    @Override
    public String userId() {
        return userId;
    }
}
