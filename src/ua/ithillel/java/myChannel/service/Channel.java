package ua.ithillel.java.myChannel.service;

import java.util.ArrayList;
import java.util.List;
import ua.ithillel.java.myChannel.api.Publisher;
import ua.ithillel.java.myChannel.api.Subscriber;

/**
 * @author Dmitry Litvak on 31.10.2022
 */

public class Channel implements Publisher {
	
	private final List<Subscriber> memberList = new ArrayList<>();
	private String newsChannel;
	
	
	public void setNewsChannel(String news) {
		this.newsChannel = news;
		notifySubscriber();
	}
	
	@Override
	public void registerSubscriber(Subscriber subscriber) {
		memberList.add(subscriber);
	}
	
	@Override
	public void removeSubscriber(Subscriber subscriber) {
		memberList.remove(subscriber);
	}
	
	@Override
	public void notifySubscriber() {
		for (Subscriber listener : memberList) {
			listener.update(newsChannel);
		}
	}
	
}
