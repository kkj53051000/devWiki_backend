package com.devwiki.controller.category;

import com.devwiki.request.TopicCategoryRequest;
import com.devwiki.service.TopicCategoryService;
import com.devwiki.vo.ResponseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/topiccategory")
public class TopicCategoryController {

    private final TopicCategoryService categoryService;

    @PostMapping("/add")
    public ResponseVo addCategory(@RequestBody TopicCategoryRequest request) {
        return categoryService.addCategory(request);
    }
}
