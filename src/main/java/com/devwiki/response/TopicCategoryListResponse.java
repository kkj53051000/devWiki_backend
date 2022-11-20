package com.devwiki.response;

import com.devwiki.domain.topic_category.TopicCategory;

import java.util.List;
import java.util.stream.Collectors;

public class TopicCategoryListResponse {
    List<TopicCategoryResponse> items = null;

    public TopicCategoryListResponse(List<TopicCategory> topicCategoryList) {
        this.items = topicCategoryList.stream()
                .map(topicCategory -> new TopicCategoryResponse(topicCategory))
                .collect(Collectors.toList());
    }
}
