package com.devwiki.response;

import lombok.Builder;

@Builder
public class TopicCategoryResponse {
    private Long id;

    private String name;

    private String categoryImg;
}
