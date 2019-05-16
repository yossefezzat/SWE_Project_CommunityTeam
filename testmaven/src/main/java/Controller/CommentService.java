package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
	@Autowired
	PostRepository postrepo;
	
	@Autowired
	CommentRepository comRepo;
	
	public void addComment(Comment newComment , Long userId , Long postId) {
		newComment.setUser_ID(userId);
	    Post post = postrepo.findById(postId).get();
	    post.getComments().add(newComment);
		comRepo.save(newComment);
	}
	
	public void editComment(Comment updatedcomment , Long postId , Long commentId ) {
		
		 Post post = postrepo.findById(postId).get();
		 for(int i=0 ; i <  post.getComments().size() ; i++) {
			 if(post.getComments().get(i).getCommentId().equals(updatedcomment.getCommentId())){
				 post.getComments().set(i , updatedcomment);
				 break;
			 }
		 }
		 postrepo.save(post);
	}
	
	
	
		
	public void deleteComment( Long commentId , Long postId) {
		Comment comment = comRepo.findById(commentId).get();
		postrepo.findById(postId).get().getComments().remove(comment);
		comRepo.deleteById(commentId);
		
	}

}
