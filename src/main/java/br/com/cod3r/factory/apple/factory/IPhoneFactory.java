package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.enums.IPhoneGeneration;
import br.com.cod3r.factory.apple.enums.IPhoneLevel;
import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public abstract class IPhoneFactory {

	public static IPhone orderIPhone(String generation, String level) {
	    IPhone device = null;

	    if (IPhoneGeneration.X.getValue().equals(generation)) {
	        if (IPhoneLevel.STANDARD.getValue().equals(level)) device = new IPhoneX();
	        else if (IPhoneLevel.HIGHEND.getValue().equals(level)) device = new IPhoneXSMax();
        } else if (IPhoneGeneration.ELEVEN.getValue().equals(generation)) {
            if (IPhoneLevel.STANDARD.getValue().equals(level)) device = new IPhone11();
            else if (IPhoneLevel.HIGHEND.getValue().equals(level)) device = new IPhone11Pro();
        }

	    device.getHardware();
	    device.assemble();
	    device.certificates();
	    device.pack();

	    return device;
    }
}
