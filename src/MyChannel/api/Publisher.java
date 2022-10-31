package MyChannel.api;

/**
 * @author Dmitry Litvak on 31.10.2022
 */

public interface Publisher {
	
	void registerSubscriber(Subscriber subscriber);
	
	void removeSubscriber(Subscriber subscriber);
	
	void notifySubscriber();
	
}
