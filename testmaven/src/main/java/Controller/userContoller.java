package Controller;

import java.util.Optional;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/community")
public class userContoller {
	
	@Autowired
	userService service;
	
	@RequestMapping(value = "/follow/users")
	public Iterable<User> showFollowers() {
		return service.getFollowers();
	}
	
	@RequestMapping(value = "/follow/user/{userId}")
	public Optional<User> showUser(@PathVariable Long userId) {
		return service.getUser(userId);
	}

	@RequestMapping(value = "/follow/user/{userId}/{followUser}")
	public void follow(@PathVariable Long userId , @PathVariable Long followUser) {
		service.followUser(userId , followUser);
	}
	
	@RequestMapping("/unfollow/user/{userId}/{followedUser}")
	public void unfollow(@PathVariable Long userId , @PathVariable Long followedUser) {
		service.unfollow(userId, followedUser);
	}
	
	
}
