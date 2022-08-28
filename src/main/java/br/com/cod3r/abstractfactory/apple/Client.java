package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.enums.IPhoneLevel;

public class Client {
	
	public static void main(String[] args) {
		final BrazilRulesAbstractFactory brazilRulesAbstractFactory = new BrazilRulesAbstractFactory();
		final IPhoneXFactory iPhoneXFactory = new IPhoneXFactory(brazilRulesAbstractFactory);
		final IPhone11Factory iPhone11Factory = new IPhone11Factory(brazilRulesAbstractFactory);

		System.out.println("\n\n### IPHONE HIGH END ###");
		iPhoneXFactory.orderIPhone(IPhoneLevel.HIGHEND.getValue());

		System.out.println("\n\n### IPHONE STANDARD ###");
		iPhone11Factory.orderIPhone(IPhoneLevel.STANDARD.getValue());

	}
}
