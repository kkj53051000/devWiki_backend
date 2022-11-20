package com.devwiki.service;

import com.devwiki.domain.topic_category.TopicCategory;
import com.devwiki.repository.TopicCategoryRepository;
import com.devwiki.request.TopicCategoryRequest;
import com.devwiki.request.TopicCategoryUpdateRequest;
import com.devwiki.response.TopicCategoryListResponse;
import com.devwiki.response.TopicCategoryResponse;
import com.devwiki.vo.ResponseVo;
import com.devwiki.vo.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicCategoryService {

    private final TopicCategoryRepository topicCategoryRepository;

    public ResponseVo addTopicCategory(TopicCategoryRequest request) {
        TopicCategory topicCategory = TopicCategory.builder()
                .name(request.getName())
                .build();

        topicCategoryRepository.save(topicCategory);

        return new ResponseVo(Status.SUCCESS);
    }

    public TopicCategoryResponse getTopicCategoryById(long topic_category_id) {
        TopicCategory topicCategory = topicCategoryRepository.findById(topic_category_id).get();

        TopicCategoryResponse topicCategoryResponse = TopicCategoryResponse.builder()
                .id(topicCategory.getId())
                .name(topicCategory.getName())
                .categoryImg(topicCategory.getCategoryImg())
                .build();

        return  topicCategoryResponse;
    }

    public TopicCategoryListResponse getAllTopicCategory() {
        List<TopicCategory> topicCategoryList = topicCategoryRepository.findAll();

        TopicCategoryListResponse topicCategoryListResponse = new TopicCategoryListResponse(topicCategoryList);

        return topicCategoryListResponse;
    }

    public ResponseVo updateTopicCategory(TopicCategoryUpdateRequest request) {
        TopicCategory topicCategory = topicCategoryRepository.findById(request.getTopic_category_id())
                .get();

        topicCategory.setName(request.getName());

        return new ResponseVo(Status.SUCCESS);
    }

    public ResponseVo deleteTopicCategory(long topic_category_id) {
        TopicCategory topicCategory = topicCategoryRepository.findById(topic_category_id)
                .get();

        topicCategoryRepository.delete(topicCategory);

        return new ResponseVo(Status.SUCCESS);
    }
}
