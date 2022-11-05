package ua.ithillel.java.myChannel.service;

import ua.ithillel.java.myChannel.api.Subscriber;

/**
 * @author Dmitry Litvak on 31.10.2022
 */

public class Member implements Subscriber {
	
	private final String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String news) {
		System.out.println(name + " read the post: " + news);
	}
	
	
}
