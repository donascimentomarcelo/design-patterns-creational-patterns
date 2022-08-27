package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.enums.IPhoneGeneration;
import br.com.cod3r.factory.apple.enums.IPhoneLevel;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		final IPhone standard = IPhoneFactory.orderIPhone(
				IPhoneGeneration.X.getValue(),
				IPhoneLevel.STANDARD.getValue()
		);
		System.out.println(standard);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		final IPhone highEnd = IPhoneFactory.orderIPhone(
				IPhoneGeneration.ELEVEN.getValue(),
				IPhoneLevel.HIGHEND.getValue()
		);
		System.out.println(highEnd);
	}
}
