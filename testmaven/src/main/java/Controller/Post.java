package Controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.w3c.dom.stylesheets.LinkStyle;

@Entity
public class Post {
	
	@Id @GeneratedValue
	private Long postId;
	private Long userId;
	private String data;
	private String privacy;
	private Integer vote_up;    ///counter voting up
	private Integer vote_down; /// counter voting down
	public String time;
	
	@ElementCollection
	private Set<Long>voteupUsers = new HashSet<Long>();
	
	@ElementCollection
	private Set<Long>votdownUsers = new HashSet<Long>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Comment> comments = new ArrayList<Comment>();

	public Post() {
		setVote_down(0);
		setVote_up(0);
	}
	
	public Post(String data, String privacy, Long user_ID, Integer vote_up, Integer vote_down, String time) {
		this.data = data;
		this.privacy = privacy;
		this.userId = user_ID;
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

	public Long getUser_ID() {
		return userId;
	}

	public void setUser_ID(Long user_ID) {
		this.userId = user_ID;
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

	public void setTime() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");  
		Date date = new Date(System.currentTimeMillis());
		this.time = formatter.format(date);
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
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	
	public Set<Long> getVoteupUsers() {
		return voteupUsers;
	}

	
	public void setVoteupUsers(Set<Long> voteupUsers) {
		this.voteupUsers = voteupUsers;
	}

	
	public Set<Long> getVotdownUsers() {
		return votdownUsers;
	}

	
	public void setVotdownUsers(Set<Long> votdownUsers) {
		this.votdownUsers = votdownUsers;
	}
	
	public void voteUpPlus() {
		this.vote_up++;
	}
	
	public void voteDownPlus() {
		this.vote_down++;
	}
	
	public void voteUpMinus() {
		this.vote_up--;
	}
	
	public void voteDownMinus() {
		this.vote_down--;
	}


	
	

	
}
