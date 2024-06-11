package ar.edu.unlp.info.oo1.ParcialOO1TikTok;

import java.util.ArrayList;

public class Comment {
	private User user;
	private String description;
	private ArrayList<Comment> comments;
	
	public Comment(User user, String description) {
		this.user = user;
		this.description = description;
		this.comments = new ArrayList<>();
	}
	
	public User getUser() {
		return user;
	}

	public String getDescription() {
		return description;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}
	
	public Comment addComment(User user,String description) {
		Comment comment = new Comment(user, description);
		comments.add(comment);
		return comment;
	}
	
	public int countComments(){
		return this.comments.size() + this.comments.stream()
		.mapToInt(comments -> comments.countComments())
		.sum();
	}
	
}
