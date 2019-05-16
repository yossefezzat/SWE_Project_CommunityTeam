package Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


@Entity
public class User {
	
	@Id
	private Long userId;
	
	@ElementCollection
	private Set<Long> following = new HashSet<Long>();
	
	@ElementCollection
	private Set<Long> followers = new HashSet<Long>();
	
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Set<Long> getFollowing() {
		return following;
	}

	public void setFollowing(Set<Long> following) {
		this.following = following;
	}

	public Set<Long> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<Long> followers) {
		this.followers = followers;
	}
	
	
}
