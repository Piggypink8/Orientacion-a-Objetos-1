package ar.edu.unlp.info.oo1.ParcialOO1TikTok;

import java.util.ArrayList;

public class Video {
	private int likes;
	private ArrayList<Comment> comments;
	
	public Video() {
		this.likes = 0;
		this.comments = new ArrayList<>();
	}

	public int getLikes() {
		return likes;
	}
	
	public ArrayList<Comment> getComments() {
		return comments;
	}
	
	public int countComments() {
		return this.comments.size() + this.comments.stream()
		.mapToInt(comments -> comments.countComments())
		.sum();
	}
	
	public void addLike() {
		this.likes++;
	}
	
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
}
