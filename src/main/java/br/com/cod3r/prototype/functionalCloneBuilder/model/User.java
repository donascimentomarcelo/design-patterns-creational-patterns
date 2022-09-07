package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class User {
	private final String name;
	private final Integer age;
	private final Address address;
	
	public User(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	protected User clone() throws CloneNotSupportedException {
		Address addressClone = (Address) address.clone();
		return new User(name, age, addressClone);
	}

	public Builder cloneBuilder() {
		return new Builder(name, age, address);
	}

	public static class Builder {
		private String name;
		private Integer age;
		private Address address;

		public Builder(final String name, final Integer age, final Address address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder withAddress(Address address) {
			this.address = address;
			return this;
		}

		public User build() {
			return new User(name, age, address);
		}
	}
}
