package com.devwiki.service;

import com.devwiki.domain.topic_category.TopicCategory;
import com.devwiki.repository.TopicCategoryRepository;
import com.devwiki.request.TopicCategoryRequest;
import com.devwiki.vo.ResponseVo;
import com.devwiki.vo.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TopicCategoryService {

    private final TopicCategoryRepository categoryRepository;

    public ResponseVo addTopicCategory(TopicCategoryRequest request) {
        TopicCategory category = TopicCategory.builder()
                .name(request.getName())
                .build();

        categoryRepository.save(category);

        return new ResponseVo(Status.SUCCESS);
    }
}
