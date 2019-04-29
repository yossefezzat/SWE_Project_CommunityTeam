package Controller;


import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Comment {
	
	@Id @GeneratedValue
	private Long CommentId;
	private String data;
	private Long User_ID;

	@ManyToOne
	private Post post;

	
	/*------------------------------------------Setters & Getters-------------------------------------*/ 
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Long getComment_ID() {
		return CommentId;
	}
	public void setComment_ID(Long comment_ID) {
		CommentId = comment_ID;
	}
	public Long getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(Long user_ID) {
		User_ID = user_ID;
	}





	


}
