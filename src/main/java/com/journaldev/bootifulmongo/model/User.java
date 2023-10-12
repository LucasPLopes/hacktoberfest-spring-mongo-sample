package com.journaldev.bootifulmongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Document("users")
@Data
public class User {

    private String id;
    private String name;
    private LocalDateTime createAt = LocalDateTime.now();
    private Map<String, String> userSettings = new HashMap<>();

}
