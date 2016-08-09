package Account;

import java.util.ArrayList;

/**
 * Class contains information about client and methods set and get information,
 * constructors for create object of class, override methods
 * "toString","equals","hashCode"
 */

public class Client {
	private String firstName;
	private String surname;
	private ArrayList<Account> listOfAccounts = new ArrayList<>();

	public Client() {
	}

	public Client(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ArrayList<Account> getlistOfAccounts() {
		return listOfAccounts;
	}

	public void setListOflistOfAccounts(ArrayList<Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}

	@Override
	public String toString() {
		return "Клиент:\nИмя:  " + firstName + "\nФамилия:  " + surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
