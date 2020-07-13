package com.example.starter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.starter.dto.Article;

@Component //이렇게 해야 AutoWired 에 의한 연결에 적용된다.
public class ArticleDaoImple implements ArticleDao {
	public List<Article> getList(){
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
