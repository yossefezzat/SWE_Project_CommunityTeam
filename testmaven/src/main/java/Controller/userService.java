package Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
	
	@Autowired
	userRepository userRepo ;

	public void followUser(Long userId , Long followUser){
		
		User newUser;
		User follow;
		
		if( userRepo.findById(userId).isPresent() ){
			newUser = userRepo.findById(userId).get();
		}
		else {
			newUser = new User();
			newUser.setUserId(userId);
			userRepo.save(newUser);
		}
		
		if( userRepo.findById(followUser).isPresent() ){
			follow = userRepo.findById(followUser).get();
		}
		else {
			follow = new User();
			follow.setUserId(followUser);
			userRepo.save(follow);
		}
		
		newUser.getFollowing().add(followUser);
		follow.getFollowers().add(userId);
		
		userRepo.save(follow);
		userRepo.save(newUser);
	}
	
	public void unfollow (Long userId  , Long unfollowed) {
		
		User user =userRepo.findById(userId).get();
		User unfollowUser =userRepo.findById(unfollowed).get();
	
		user.getFollowing().remove(unfollowed);
		unfollowUser.getFollowers().remove(userId);
		
		userRepo.save(user);
		userRepo.save(unfollowUser);

	}
	
	public Iterable<User> getFollowers() {
		return userRepo.findAll();
	}

	public Optional<User> getUser(Long userId) {
		return userRepo.findById(userId);
	}
	
}
