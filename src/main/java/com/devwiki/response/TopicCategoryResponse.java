package com.devwiki.response;

import com.devwiki.domain.topic_category.TopicCategory;
import lombok.Builder;

@Builder
public class TopicCategoryResponse {
    private Long id;

    private String name;

    private String categoryImg;

    public TopicCategoryResponse(TopicCategory topicCategory) {
        this.id = topicCategory.getId();
        this.name = topicCategory.getName();
        this.categoryImg = topicCategory.getCategoryImg();
    }
}
