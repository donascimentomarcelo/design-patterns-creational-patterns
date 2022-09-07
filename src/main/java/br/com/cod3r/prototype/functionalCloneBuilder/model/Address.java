package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable {
	private String street;
	private Integer number;
	
	public Address(String street, Integer number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public Integer getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static class Builder {
		private String street;
		private Integer number;

		public Builder(final String street, final Integer number) {
			this.street = street;
			this.number = number;
		}

		public Builder withStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder withNumber(Integer number) {
			this.number = number;
			return this;
		}

		public Address build() {
			return new Address(street, number);
		}
	}
}
