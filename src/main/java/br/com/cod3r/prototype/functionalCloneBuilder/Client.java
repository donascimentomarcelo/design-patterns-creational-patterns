package br.com.cod3r.prototype.functionalCloneBuilder;

import br.com.cod3r.prototype.functionalCloneBuilder.model.Address;
import br.com.cod3r.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) {
		final User user = new User("Original", 25, new Address("ABC Street", 1000));
		final User clone = user.cloneBuilder().withName("Clone").build();
		final User anotherClone = clone.cloneBuilder()
													.withAge(28)
													.withAddress(new Address("Los Santos", 9))
													.build();
		System.out.println(user);
		System.out.println(clone);
		System.out.println(anotherClone);
	}
}