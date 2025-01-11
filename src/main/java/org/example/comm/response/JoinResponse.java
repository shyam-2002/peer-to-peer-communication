package org.example.comm.response;


public class JoinResponse extends AbstractResponse {
    public JoinResponse() {

    }

    public JoinResponse(Builder b) {
        super(b);
    }

    public static class Builder extends AbstractResponse.Builder<JoinResponse, Builder> {


        public Builder() {
            responseType(ResponseType.JOIN);
        }

        @Override
        public JoinResponse build() {
            return new JoinResponse(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }
}
