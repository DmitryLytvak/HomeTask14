package MyChannel.service;

import MyChannel.api.Publisher;
import MyChannel.api.Subscriber;
import java.util.ArrayList;
import java.util.List;

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
