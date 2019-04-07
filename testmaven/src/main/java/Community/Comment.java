package Community;

import java.util.ArrayList;

public class Comment {
	private String data;
	private Integer Comment_ID ;
	private Integer User_ID;
	private ArrayList<Reply> replies = new ArrayList<Reply>();
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Integer getComment_ID() {
		return Comment_ID;
	}
	public void setComment_ID(Integer comment_ID) {
		Comment_ID = comment_ID;
	}
	public Integer getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(Integer user_ID) {
		User_ID = user_ID;
	}


	


}
