package io.github.ivvve.bingewatch.domain.webdrama.entity;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "web_dramas")
public class WebDrama {
    private String id;
    private String title;
    private String description;
    private int season;
}
