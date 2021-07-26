package com.meli.demo.payload;

public class DeletePayload {

    private String id;

    public DeletePayload(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
