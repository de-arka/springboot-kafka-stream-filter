package com.kafka.stream.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Message Model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomMessage implements Serializable {
    private String messageId;
    private String messageContent;
    private String isMessageActive;
}
