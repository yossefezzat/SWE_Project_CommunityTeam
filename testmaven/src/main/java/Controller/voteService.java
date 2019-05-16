package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class voteService {

	@Autowired
	PostRepository votepost ;
	
	
	public void makeVoteUp(Long userId , Long PostId) {
		Post post = votepost.findById(PostId).get();
		if( post.getVoteupUsers().contains(userId) ) {
			return;
		}
		else if( post.getVotdownUsers().contains(userId) ) {
			post.getVotdownUsers().remove(userId);
			post.voteDownMinus();
		}
		
		post.getVoteupUsers().add(userId);
		post.voteUpPlus();
		votepost.save(post);
	}
	
	public void makeVoteDown(Long userId , Long PostId) {
		Post post = votepost.findById(PostId).get();
		if( post.getVotdownUsers().contains(userId) ) {
			return;
		}
		else if( post.getVoteupUsers().contains(userId) ) {
			post.getVoteupUsers().remove(userId);
			post.voteUpMinus();
		}
		
		post.getVotdownUsers().add(userId);
		post.voteDownPlus();
		votepost.save(post);
	}
	
}
