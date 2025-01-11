package org.example.comm.request;

public class JoinRequest extends AbstractRequest {

    public JoinRequest() {
    }

    public JoinRequest(Builder b) {
        super(b);
    }


    public static class Builder extends AbstractRequest.Builder<JoinRequest, Builder> {


        public Builder() {
            requestType(RequestType.JOIN);
        }

        @Override
        public JoinRequest build() {
            return new JoinRequest(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }
}
