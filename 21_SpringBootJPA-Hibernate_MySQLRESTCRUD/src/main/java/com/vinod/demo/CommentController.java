package com.vinod.demo;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class CommentController 
{
	@Autowired
	ICommentRepository commentRepository;
	
	//retreive comments
	//http://localhost:9090/api/comments
	@GetMapping("/comments")
	public List<Comment> getAllComments() {
		return commentRepository.findAll();
	}
	//insert a data
	//http://localhost:9090/api/comments
	@PostMapping("/comments")
	public Comment createComment(@RequestBody Comment comment) {
		return commentRepository.save(comment);
	}
	
	//http://localhost:9090/api/comments/41
	@GetMapping("/comments/{id}")
	public Comment getCommentById(@PathVariable(value = "id") Long commentId) {
		return commentRepository.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
	}
	
	//update the data
	//http://localhost:9090/api/comments/41
	@PutMapping("/comments/{id}")
	public Comment updateComment(@PathVariable(value = "id") Long commentId, @RequestBody Comment commentDetails) {

		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));

		comment.setPostName(commentDetails.getPostName());
		comment.setComments(commentDetails.getComments());

		Comment updatedComment = commentRepository.save(comment);
		return updatedComment;
	}
	
	//delete the data
	//http://localhost:9090/api/comments/41
	@DeleteMapping("/comments/{id}")
	public ResponseEntity<?> deleteComment(@PathVariable(value = "id") Long commentId) {
		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
		commentRepository.delete(comment);
		return ResponseEntity.ok().build();
	}

}
