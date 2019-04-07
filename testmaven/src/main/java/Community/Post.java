package Community;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Post {
	
	private String data;
	private String privacy;
	private Integer user_ID;
	private Integer post_ID;
	private Integer vote_up;   ///counter voting up
	private Integer vote_down; /// counter voting down
	public String time;
	
	public ArrayList<Comment> comments = new ArrayList<Comment>();
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(Integer user_ID) {
		this.user_ID = user_ID;
	}

	public Integer getPost_ID() {
		return post_ID;
	}

	public void setPost_ID(Integer post_ID) {
		this.post_ID = post_ID;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	

	
}
