package ar.edu.unlp.info.oo1.ParcialOO1TikTok;

import java.util.ArrayList;

public class User {
	private ArrayList<Video> uploadedVideos;
	private Account typeAccount;
	private ArrayList<User> follows;
	
	public User(Account typeAccount) {
		this.typeAccount = typeAccount;
		this.uploadedVideos = new ArrayList<>();
		this.follows = new ArrayList<>();
	}
	
	public Account getTypeAccount() {
		return typeAccount;
	}
	
	public ArrayList<Video> getUploadedVideos() {
		return uploadedVideos;
	}
	
	public ArrayList<User> getFollows() {
		return follows;
	}

	public void uploadVideo(Video video) {
		this.uploadedVideos.add(video);
	}
	
}
