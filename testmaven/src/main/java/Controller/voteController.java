package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("community/vote")
public class voteController {
	
	@Autowired
	voteService service;
	
	@RequestMapping("/up/{postId}/{userId}")
	public void voteUp(@PathVariable Long userId , @PathVariable Long postId ) {
		service.makeVoteUp(userId, postId);
	}
	
	@RequestMapping("/down/{postId}/{userId}")
	public void voteDown(@PathVariable Long userId , @PathVariable Long postId ) {
		service.makeVoteDown(userId, postId);
	}
	
}
