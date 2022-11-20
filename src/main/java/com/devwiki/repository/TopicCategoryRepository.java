package com.devwiki.repository;


import com.devwiki.domain.topic_category.TopicCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicCategoryRepository extends JpaRepository<TopicCategory, Long> {
}
