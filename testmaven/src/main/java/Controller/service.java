package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Where;
import org.hibernate.mapping.Collection;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	
	@Autowired
	private PostRepository postrepo;
	
	@Autowired
	private CommentRepository comRepo;
	
	
	public List<Post> getallPosts(String UserId) {
		List<Post>posts = new ArrayList<Post>();
		postrepo.findAll().forEach(posts::add);
		return posts;
	}
	
	public void addPost(Post newPost) {
		postrepo.save(newPost);
	}
	
	public void updatePost(Post newPost , Long postID) {
		postrepo.save(newPost);
	}
	
	public void deletePost(Long postId , String user_id){
		postrepo.deleteById(postId);
	}
	
	
	public void addComment(Comment newComment , Long userId , Long postId) {
		newComment.setUser_ID(userId);
	    Post post = postrepo.findById(postId).get();
	    post.getComments().add(newComment);
		comRepo.save(newComment);
	}
	
	/*public void editComment(Comment updatedcomment , Long postId , Long commentId , Long userId) {
			
			updatedcomment.setUser_ID(userId);
		    Post post = postrepo.findById(postId).get();
		    for(int i = 0 ; i <  post.getComments().size() ; i++) {
		    	if(post.getComments().iterator().next().getComment_ID() == commentId) {
		    		post.getComments().iterator().next().setData(updatedcomment.getData());
		    		break;
		    	}
		    	else
		    		post.getComments().iterator().next().getComment_ID();
		    }
		    
		    //post.getComments().add(updatedcomment);
			//comRepo.save(updatedcomment);
	}*/
	
		
	public void deleteComment( Long commentId , Long postId) {
		Comment comment = comRepo.findById(commentId).get();
		postrepo.findById(postId).get().getComments().remove(comment);
		comRepo.deleteById(commentId);
		
	}
	

	
	
}
