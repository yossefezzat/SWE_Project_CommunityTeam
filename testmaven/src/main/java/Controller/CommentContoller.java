package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping(value = "community/comment")
public class CommentContoller {
	
	@Autowired
	private CommentService service;
	
	/* Create Comment by Id */
	@RequestMapping(method = RequestMethod.POST, value = "/add/{postId}/{userId}")
	public void addcomment(@RequestBody Comment newComment , @PathVariable Long postId , @PathVariable Long userId){
		service.addComment(newComment , userId , postId);
	}

	@RequestMapping(method = RequestMethod.PUT , value = "/update/{commentId}/{postId}/{userId}")
	public void updateComment(@RequestBody Comment newComment , @PathVariable Long commentId , @PathVariable Long postId , @PathVariable Long userId ){
		newComment.setCommentId(commentId);
		newComment.setUser_ID(userId);
		service.editComment(newComment , postId , commentId );
		
	}
	
	/* Delete a Comment by Id and PostId */
	@RequestMapping("/delete/{commentId}/{postId}")
	public void delete_post(@PathVariable Long commentId , @PathVariable Long postId) {
		service.deleteComment(commentId, postId);
	}
	
}
