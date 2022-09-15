package com.devwiki.controller.category;

import com.devwiki.domain.category.Category;
import com.devwiki.request.CategoryRequest;
import com.devwiki.service.CategoryService;
import com.devwiki.vo.ResponseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class CategoryController {

    private final CategoryService categoryService;

    public ResponseVo addCategory(@RequestBody CategoryRequest request) {
        return categoryService.addCategory(request);
    }
}
