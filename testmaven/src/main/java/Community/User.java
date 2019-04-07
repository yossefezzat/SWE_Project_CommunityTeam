package Community;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {	
	private String userId;
	private ArrayList<Post>posts = new ArrayList<Post>();
	private Follow followObject;
	private Notification notify;
	private Voting vote;
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	@RequestMapping("/CreatePost/data={data}")
	public String add_post(@PathVariable String data) {
		return data;
	}
	
	public void do_vote(String  Post_ID) {
		
	}
	
	public void edit_post(Integer Post_ID) {
		
	}
	
	public void delete_post(Integer Post_ID) {
		
	}
	
	public void make_Comment(String data , String postId) {
		
	}
	
	public void make_Reply(String data , String postId , String commentId){
		
	}
	
	public void follow_User(String UserId) {
		
	}
	
}
