package com.ijoy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ijoy.mapper.CommentMapper;
import com.ijoy.modal.Comment;
import com.ijoy.service.ICommentService;


public class CommentServiceImpl implements ICommentService {

	@Autowired
	private CommentMapper commentMapper;
	public List<Comment> findAll() {
		
		List<Comment> list=commentMapper.findAll();
		System.out.println(list);
		return list;
	}
	
}
