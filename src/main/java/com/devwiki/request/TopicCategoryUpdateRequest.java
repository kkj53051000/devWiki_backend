package com.devwiki.request;

import lombok.Getter;

@Getter
public class TopicCategoryUpdateRequest {
    private long topic_category_id;

    private String name;
}
