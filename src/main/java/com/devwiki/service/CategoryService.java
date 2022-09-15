package com.devwiki.service;

import com.devwiki.domain.category.Category;
import com.devwiki.repository.CategoryRepository;
import com.devwiki.request.CategoryRequest;
import com.devwiki.vo.ResponseVo;
import com.devwiki.vo.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public ResponseVo addCategory(CategoryRequest request) {
        Category category = Category.builder()
                .name(request.getName())
                .build();

        categoryRepository.save(category);

        return new ResponseVo(Status.SUCCESS);
    }
}
