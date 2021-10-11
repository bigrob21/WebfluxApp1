package com.bigrob.pojos;

import lombok.Value;

import java.util.UUID;

@Value
public class Message {
    private String id = UUID.randomUUID().toString();
    private final String message;
}
