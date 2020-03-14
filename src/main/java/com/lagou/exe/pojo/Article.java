package com.lagou.exe.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-03-14 15:28
 */
@Data
@Entity(name = "t_article")
public class Article {

    /**
     * id int(11) NOT NULL AUTO_INCREMENT,
     * title varchar(50) NOT NULL COMMENT '文章标题',
     * content longtext COMMENT '文章具体内容',
     * created date NOT NULL COMMENT '发表时间',
     * modified date DEFAULT NULL COMMENT '修改时间',
     * categories varchar(200) DEFAULT '默认分类' COMMENT '文章分类',
     * tags varchar(200) DEFAULT NULL COMMENT '文章标签',
     * allow_comment tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否允许评论',
     * thumbnail varchar(200) DEFAULT NULL COMMENT '文章缩略图',
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private Date created;

}
