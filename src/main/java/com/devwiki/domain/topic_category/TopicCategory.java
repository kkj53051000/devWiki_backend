package com.devwiki.domain.topic_category;

import com.devwiki.domain.user.User;
import lombok.*;

import javax.persistence.*; // 알아보기
import java.time.LocalDateTime;

@Entity
@Builder
@Getter @Setter
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
