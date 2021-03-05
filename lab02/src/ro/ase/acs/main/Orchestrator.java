package ro.ase.acs.main;

import ro.ase.acs.contacts.Writeable;
import ro.ase.acs.contacts.Readable;


public class Orchestrator {
	
	private Readable reader;
	private Writeable writer;
	
	public Orchestrator(Readable readbl, Writeable writebl) {
		this.reader = readbl;
		this.writer = writebl;
	}
	
	
	public void execute() {
		writer.print(reader.read());
	}

}
