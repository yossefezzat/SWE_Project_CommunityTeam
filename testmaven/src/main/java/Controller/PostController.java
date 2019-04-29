package Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Model.*;

@RestController  @RequestMapping("/post")
public class PostController {
	
	
	@Autowired 
	service postservice;
	
	@RequestMapping(method = RequestMethod.POST, value = "/create_post")
	public String addpost(@RequestBody Post newPost){
		postservice.addPost(newPost);
		return newPost.getUser_ID();
	}
	
//	@RequestMapping("/post/{postId}")
//	public Post getPost(@PathVariable("postId") int postId){
//		return postservice.getPost(postId);
//	}
	
	@RequestMapping("/AllPosts/{UserId}")
	public java.util.List<Post> getallPosts(@PathVariable String UserId){
		return postservice.getallPosts(UserId);
	}

	//@RequestMapping(method = RequestMethod.PUT, value = "/update_post/{postID}")
	@PutMapping("/updatepost/{postId}")
	public String updatePost(@RequestBody Post newPost , @PathVariable Long postID){
		postservice.updatePost(newPost,postID);
		return newPost.getUser_ID();
	}
	
	@RequestMapping("/deletepost/{Post_id}/user/{User_id}")
	public void delete_post(@PathVariable Long Post_id , @PathVariable String User_id) {
		postservice.deletePost(Post_id , User_id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/createComment/{postId}/{userId}")
	public Long addcomment(@RequestBody Comment newComment , @PathVariable Long postId , @PathVariable Long userId){
		postservice.addComment(newComment , userId , postId);
		return newComment.getUser_ID();
	}

	/*@RequestMapping(method = RequestMethod.PUT , value = "/updateComment/{commentId}/{postId}/{userId}")
	public String updateComment(@RequestBody Comment newComment , @PathVariable Long commentId , @PathVariable Long postId , @PathVariable Long userId){
		postservice.editComment(newComment , postId , commentId , userId);
		return newComment.getData();
	}*/
	
	@RequestMapping("/deletecomment/{commentId}/post/{postId}")
	public void delete_post(@PathVariable Long commentId , @PathVariable Long postId) {
		postservice.deleteComment(commentId, postId);
	}

}
