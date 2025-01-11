package org.example.comm.response;

public class BlockResponse extends AbstractResponse {
    public BlockResponse() {

    }

    public BlockResponse(Builder b) {
        super(b);
    }

    public static class Builder extends AbstractResponse.Builder<BlockResponse, Builder> {


        public Builder() {
            responseType(ResponseType.BLOCK);
        }

        @Override
        public BlockResponse build() {
            return new BlockResponse(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }
}
