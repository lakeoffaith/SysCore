package com.ijoy.service;

import java.util.List;

import javax.jws.WebService;

import com.ijoy.modal.Comment;

@WebService
public interface ICommentService {
	public List<Comment> findAll();
}
