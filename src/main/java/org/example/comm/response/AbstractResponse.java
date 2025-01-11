package org.example.comm.response;


public class AbstractResponse implements Response {
    private ResponseType responseType;

    public AbstractResponse() {
    }

    public AbstractResponse(Builder<?, ?> b) {
        this.responseType = b.responseType;
    }

    public static abstract class Builder<T extends AbstractResponse, E extends Builder<T, E>> {
        private ResponseType responseType;

        public E responseType(ResponseType responseType) {
            this.responseType = responseType;
            return self();
        }

        public abstract T build();

        public abstract E self();
    }

    @Override
    public ResponseType responseType() {
        return responseType;
    }
}
