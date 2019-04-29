package Model;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Controller.Post;



public class User {	

	private String userId;
	private Follow followObject;
	private Notification notify;
	private Voting vote;
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Follow getFollowObject() {
		return followObject;
	}

	public void setFollowObject(Follow followObject) {
		this.followObject = followObject;
	}

	public Notification getNotify() {
		return notify;
	}

	public void setNotify(Notification notify) {
		this.notify = notify;
	}

	public Voting getVote() {
		return vote;
	}

	public void setVote(Voting vote) {
		this.vote = vote;
	}

	
	
}
