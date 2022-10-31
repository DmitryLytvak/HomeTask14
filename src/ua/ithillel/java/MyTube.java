package ua.ithillel.java;

import ua.ithillel.java.entity.DefaultUser;
import ua.ithillel.java.entity.PremiumUser;
import ua.ithillel.java.entity.User;
import ua.ithillel.java.entity.Video;
import ua.ithillel.java.service.Channel;

public class MyTube {
	
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
