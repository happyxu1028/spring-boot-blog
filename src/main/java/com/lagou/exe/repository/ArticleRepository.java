package com.lagou.exe.repository;

import com.lagou.exe.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-03-14 17:37
 */
public interface ArticleRepository extends JpaRepository<Article,Integer>, JpaSpecificationExecutor {


}
