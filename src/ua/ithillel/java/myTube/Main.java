package ua.ithillel.java.myTube;

import ua.ithillel.java.myTube.entity.DefaultUser;
import ua.ithillel.java.myTube.entity.PremiumUser;
import ua.ithillel.java.myTube.entity.User;
import ua.ithillel.java.myTube.entity.Video;
import ua.ithillel.java.myTube.service.Channel;

public class Main {
	
	public static void main(String[] args) {
		Channel channel = new Channel(0);
		User user = new PremiumUser("Valeriy", "Zalujnii");
		User user1 = new DefaultUser("Test", "Testovich");
		
		channel.subscribe(user);
		channel.subscribe(user1);
		channel.loadVideo(new Video(channel.getChannelId(), "How to cook russion solder", 1024));
		System.out.println(channel.getSubscriberList());
	}
	
}
