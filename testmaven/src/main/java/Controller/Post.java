package Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

import javax.persistence.*;

import org.w3c.dom.stylesheets.LinkStyle;

@Entity
public class Post {
	
	@Id @GeneratedValue
	private Long postId;
	private String user_ID;
	private String data;
	private String privacy;
	private Integer vote_up;    ///counter voting up
	private Integer vote_down; /// counter voting down
	public String time;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Comment> comments = new ArrayList<Comment>();

	public Post() {
		setVote_down(0);
		setVote_up(0);
	}
	
	public Post(String data, String privacy, String user_ID, Integer vote_up, Integer vote_down, String time) {
		this.data = data;
		this.privacy = privacy;
		this.user_ID = user_ID;
		this.vote_up = vote_up;
		this.vote_down = vote_down;
		this.time = time;
	}


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}

	public Long getPost_id() {
		return postId;
	}

	public void setPost_id(Long post_ID) {
		this.postId = post_ID;
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

	public Integer getVote_up() {
		return vote_up;
	}

	public void setVote_up(Integer vote_up) {
		this.vote_up = vote_up;
	}

	public Integer getVote_down() {
		return vote_down;
	}

	public void setVote_down(Integer vote_down) {
		this.vote_down = vote_down;
	}
	

	public Collection<Comment> getComments() {
		return comments;
	}

	
	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
	



	
	

	
}
