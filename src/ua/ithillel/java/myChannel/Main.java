package ua.ithillel.java.myChannel;

import ua.ithillel.java.myChannel.service.Channel;
import ua.ithillel.java.myChannel.service.Member;

/**
 * @author Dmitry Litvak on 31.10.2022
 */

public class Main {
	
	public static void main(String[] args) {
		Channel channel = new Channel();
		Member member = new Member("Vlad");
		Member member2 = new Member("Irina");
		
		channel.registerSubscriber(member);
		channel.registerSubscriber(member2);
		
		channel.setNewsChannel(
				"Увага! Повітряна тривога! Зберігайте спокій!");
		channel.setNewsChannel(
				"Відбій тривоги назавжди!!!!! путін здох!!! Ура!!!!");
		channel.removeSubscriber(member);
		
	}
}
