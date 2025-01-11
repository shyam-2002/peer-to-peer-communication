package org.example.comm.request;

public class BlockRequest extends AbstractRequest {

    private String blockUserId;


    public BlockRequest() {
    }

    public BlockRequest(Builder b) {
        super(b);
        this.blockUserId = b.blockUserId;
    }


    public static class Builder extends AbstractRequest.Builder<BlockRequest, Builder> {

        private String blockUserId;

        public Builder() {
            requestType(RequestType.BLOCK);
        }

        public Builder blockUserId(String blockUserId) {
            this.blockUserId = blockUserId;
            return this;
        }

        @Override
        public BlockRequest build() {
            return new BlockRequest(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }

    public String blockUserId() {
        return blockUserId;
    }
}
