package com.devwiki.controller.category;

import com.devwiki.request.TopicCategoryRequest;
import com.devwiki.response.TopicCategoryListResponse;
import com.devwiki.response.TopicCategoryResponse;
import com.devwiki.service.TopicCategoryService;
import com.devwiki.vo.ResponseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/topiccategory")
public class TopicCategoryController {

    private final TopicCategoryService topicCategoryService;

    @PostMapping("/add")
    public ResponseVo addTopicCategory(@RequestBody TopicCategoryRequest request) {
        return topicCategoryService.addTopicCategory(request);
    }

    @GetMapping("/getbyid/{id}")
    public TopicCategoryResponse getTopicCategoryById(@PathVariable("id") long topic_category_id) {
        return topicCategoryService.getTopicCategoryById(topic_category_id);
    }

    @GetMapping("/getall")
    public TopicCategoryListResponse getAllTopicCategory() {
        return topicCategoryService.getAllTopicCategory();
    }
}
