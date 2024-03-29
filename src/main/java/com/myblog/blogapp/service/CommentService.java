package com.myblog.blogapp.service;

import com.myblog.blogapp.entity.Comment;
import com.myblog.blogapp.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(long postId, CommentDto commentDto);
   List<CommentDto> getCommentByPostId(long postId);

    CommentDto  updateComment(long postId, long id, CommentDto commentDto);
}
