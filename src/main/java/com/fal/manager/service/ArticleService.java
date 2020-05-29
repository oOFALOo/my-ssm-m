package com.fal.manager.service;


import com.fal.manager.entity.Article;
import com.fal.manager.utils.PageResult;
import com.fal.manager.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface ArticleService {

	PageResult getArticlePage(PageUtil pageUtil);

	Article queryObject(Integer id);

	List<Article> queryList(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);

	int save(Article article);

	int update(Article article);

	int delete(Integer id);

	int deleteBatch(Integer[] ids);
}
