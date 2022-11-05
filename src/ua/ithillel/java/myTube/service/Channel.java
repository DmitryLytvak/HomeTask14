package ua.ithillel.java.myTube.service;

import java.util.ArrayList;
import java.util.List;
import ua.ithillel.java.myTube.api.Publisher;
import ua.ithillel.java.myTube.api.Subscriber;
import ua.ithillel.java.myTube.entity.Update;
import ua.ithillel.java.myTube.entity.User;
import ua.ithillel.java.myTube.entity.Video;

public class Channel implements Publisher {
	
	private final List<Subscriber> subscriberList = new ArrayList<>();
	private final List<Video> videos = new ArrayList<>();
	private String name;
	private final int channelId;
	User user;
	
	public Channel(int channelId) {
		this.channelId = channelId;
	}
	
	public boolean loadVideo(Video video) {
		videos.add(video);
		notifySubs();
		return true;
	}
	
	@Override
	public boolean subscribe(Subscriber subscriber) {
		return subscriberList.add(subscriber);
	}
	
	@Override
	public boolean unFollow(Subscriber subscriber) {
		return subscriberList.remove(subscriber);
	}
	
	@Override
	public void notifySubs() {
		for (Subscriber sub : subscriberList) {
			sub.update(new Update("New video has been uploaded"));
		}
	}
	
	public String getName() {
		return name;
	}
	
	public List<Subscriber> getSubscriberList() {
		return subscriberList;
	}
	
	public List<Video> getVideos() {
		return videos;
	}
	
	public int getChannelId() {
		return channelId;
	}
	
}
