package ar.edu.unlp.info.oo1.ParcialOO1TikTok;

import java.util.ArrayList;
import java.util.Comparator;

// Falta implementar el metodo para obtener la empresa con mayor costo de productos

public class TikTok {
	
	private ArrayList<User> users;
	private ArrayList<Video> videos;
	
	public TikTok() {
		this.users = new ArrayList<>();
		this.videos = new ArrayList<>();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public ArrayList<Video> getVideos() {
		return videos;
	}
	
	public User createUser(Account typeAccount) {
		User user = new User(typeAccount);
		this.users.add(user);
		return user;
	}
	
	public Video uploadVideo(Video video, User user) {
		user.uploadVideo(video);
		this.videos.add(video);
		return video;
	}
	
	public Comment addComment(Video video, User user, String description) {
		Comment comment = new Comment(user, description);
		video.addComment(comment);
		return comment;
	}
	
	//También deberia estar el método que agregue un comentario al comentario...
	
	public Video getMostLikedVideo() {
		return this.videos.stream()
		.max(Comparator.comparing(video -> video.getLikes()))
		.orElse(null);
	}
	
	public Video getMostCommentedVideo() {
		return this.videos.stream()
		.max(Comparator.comparing(video -> video.countComments()))
		.orElse(null);
	}
	
}
