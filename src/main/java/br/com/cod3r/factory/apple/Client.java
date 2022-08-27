package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		final IPhone standard = IPhoneFactory.orderIPhone("X", "standard");
		System.out.println(standard);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		final IPhone highEnd = IPhoneFactory.orderIPhone("11", "highEnd");
		System.out.println(highEnd);
	}
}
