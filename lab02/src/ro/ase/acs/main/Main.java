package ro.ase.acs.main;

import ro.ase.acs.contacts.Writeable;
import ro.ase.acs.contacts.Readable;
import ro.ase.acs.writers.ConsoleWriter;
import ro.ase.acs.readers.Reader;

public class Main {
	
	public static void main(String[] args) {
		IoC ioc = new IoC();
		ioc.register(Readable.class, Reader.class);
		ioc.register(Writeable.class, ConsoleWriter.class);
		Orchestrator orchestrator = new Orchestrator(ioc.resolve(Readable.class), ioc.resolve(Writeable.class));
		orchestrator.execute();
	}
	
}
