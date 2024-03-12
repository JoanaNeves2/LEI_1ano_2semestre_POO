public class ContactIterator {
	private Contact[] contacts; // vetor de contactos
	private int size; // número de contactos no vetor
	private int nextIndex; // índice do próximo contacto

	public ContactIterator(Contact[] contacts, int size) {
		this.contacts = contacts;
		this.size = size;
		nextIndex = 0;
	}
	
	public boolean hasNext() {
		return nextIndex < size;
	}

	/** Pre: hasNext() */
	public Contact next() {
		return contacts[nextIndex++];
	}
}