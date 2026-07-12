package io.matrisk;

public record Message(String message) {
    public Message() {
        this("");
    } // JSON-B/Jackson
}
