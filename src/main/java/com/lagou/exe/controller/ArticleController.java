package com.lagou.exe.controller;

import com.lagou.exe.pojo.Article;
import com.lagou.exe.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-03-12 23:44
 */
@Controller
@Slf4j
public class ArticleController {

    @Resource
    private ArticleRepository articleRepository;


    @RequestMapping("/index")
    public String toIndexPage(HttpServletResponse response, Model model, Integer pageNum){
        if (pageNum == null){
            pageNum = 1;
        }

        Sort sort =  Sort.by("id");
        // （当前页， 每页记录数， 排序方式）
        Pageable pageable =  PageRequest.of(pageNum - 1, 3, sort);
        Page<Article> list = articleRepository.findAll(pageable);


        model.addAttribute("data", list);

        return "index";
    }

}
