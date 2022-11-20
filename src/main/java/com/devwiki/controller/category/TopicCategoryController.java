package com.devwiki.controller.category;

import com.devwiki.request.TopicCategoryRequest;
import com.devwiki.service.TopicCategoryService;
import com.devwiki.vo.ResponseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/topiccategory")
public class TopicCategoryController {

    private final TopicCategoryService categoryService;

    @PostMapping("/add")
    public ResponseVo addTopicCategory(@RequestBody TopicCategoryRequest request) {
        return categoryService.addTopicCategory(request);
    }
}
