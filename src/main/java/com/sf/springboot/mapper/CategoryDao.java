package com.sf.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sf.springboot.pojo.Category;

@Mapper
public interface CategoryDao {

	List<Category> findAll();

}
