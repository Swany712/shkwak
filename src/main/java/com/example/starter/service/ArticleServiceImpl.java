package com.example.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.starter.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	public List<Article> getList() {
		
		//가짜 데이터 만들어서 중간에 확인함
		Article article1 = new Article(1, "2020-07-14 12:12:12", "제목1", "내용1");
		Article article2 = new Article(2, "2020-07-15 12:12:13", "제목2", "내용2");
		Article article3 = new Article(3, "2020-07-16 12:12:14", "제목3", "내용3");
		
		List<Article> list = new ArrayList<>();
		
		list.add(article3);
		list.add(article2);
		list.add(article1);
		
		return list;		
	}
}
