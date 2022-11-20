package com.devwiki.domain.topic_category;

import com.devwiki.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*; // 알아보기
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TopicCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "topic_category_id")
    private Long id;

    private String name;

    private LocalDateTime createDate;

    private String categoryImg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
