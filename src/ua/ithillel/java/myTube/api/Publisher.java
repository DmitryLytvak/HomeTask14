package ua.ithillel.java.myTube.api;

import ua.ithillel.java.myTube.api.Subscriber;

public interface Publisher {
	
	boolean subscribe(Subscriber subscriber);
	
	boolean unFollow(Subscriber subscriber);
	
	void notifySubs();
	
}
