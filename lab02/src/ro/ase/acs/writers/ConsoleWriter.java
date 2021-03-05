package ro.ase.acs.writers;

import ro.ase.acs.contacts.Writeable;

public class ConsoleWriter implements Writeable{

	public void print(String message) {
		System.out.println(message);
	}

}
