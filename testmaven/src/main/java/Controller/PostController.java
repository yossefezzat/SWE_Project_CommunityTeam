package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  @RequestMapping("community/post")
public class PostController {
	
	@Autowired 
	PostService postservice;
	
	
	/*-------------------------------------------- Get all Posts ------------------------------------------------*/
	@RequestMapping("/allposts")
	public java.util.List<Post> getallPosts(){
		return postservice.getallPosts();
	}
	
	
	/*------------------------------------- Get all Posts of User -----------------------------------------------*/
	@RequestMapping("/userposts/{UserId}")
	public java.util.List<Post> getUserPosts(@PathVariable Long UserId){
		return postservice.getUserPosts(UserId);
	}
	
	
	
	/*-----------------------------------------create a post to the community-------------------------------------*/
	@RequestMapping(method = RequestMethod.POST, value = "/create_post/{userId}")	
	public String addpost(@RequestBody Post newPost , @PathVariable Long userId){
		postservice.addPost(newPost , userId);
		return newPost.getTime();
	}

	
	
	
	/* --------------------------------------- Update Post by Id ---------------------------------------------------*/
	@PutMapping("/updatepost/{postId}")
	public String updatePost(@RequestBody Post newPost , @PathVariable Long postId){
		postservice.updatePost(newPost , postId);
		return newPost.getTime();
	}
	
	
	
	
	/* ------------------------------------------- Delete Post by Id -----------------------------------------------*/
	@RequestMapping("/deletepost/{Post_id}/{User_id}")
	public void delete_post(@PathVariable Long Post_id , @PathVariable String User_id) {
		postservice.deletePost(Post_id , User_id);
	}
	


}
