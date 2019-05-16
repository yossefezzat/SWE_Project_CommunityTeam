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
public class PostService {
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private CommentRepository comRepo;
	
	public List<Post> getallPosts() {
		List<Post>posts = new ArrayList<Post>();
		postRepo.findAll().forEach(posts::add);
		return posts;
	}
	
	public void addPost(Post newPost , Long userId) {
		newPost.setTime();
		newPost.setUser_ID(userId);
		postRepo.save(newPost);
	}
	
	public void updatePost(Post newPost , Long postID) {
		postRepo.save(newPost);
	}
	
	public void deletePost(Long postId , String user_id){
		postRepo.deleteById(postId);
	}
	
	public List<Post> getUserPosts(Long userId){
		return postRepo.findByuserId(userId);
		
	}
	
	
	
	

	
	
}
