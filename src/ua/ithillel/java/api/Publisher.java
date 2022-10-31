package ua.ithillel.java.api;

public interface Publisher {
	
	boolean subscribe(Subscriber subscriber);
	
	boolean unFollow(Subscriber subscriber);
	
	void notifySubs();
	
}
