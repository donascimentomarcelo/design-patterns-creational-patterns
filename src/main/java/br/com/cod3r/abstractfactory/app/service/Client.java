package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		final RestAbstractFactory factory = new RestAbstractFactory();

		final UserService userService = factory.getUserService();
		userService.save("Crane");
		userService.delete(1);

		final CarService carService = factory.getCarService();
		carService.save("Abc");
		carService.update("Abc");
	}
}
