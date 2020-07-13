package com.example.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.starter.dto.Article;
import com.example.starter.service.ArticleService;

import groovy.util.logging.Slf4j;

//import jline.internal.Log;

@Controller
@Slf4j
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/article/list")
	public String showList(Model aModel) {
		List<Article> list = articleService.getList();
		
		aModel.addAttribute("list", list);	
		//request.setAttribute("list", list); 와 똑같은 표현
		
		//Log.info("list : " + list);
		
		return "article/list";
	}
}
