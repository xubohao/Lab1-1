package pkgCore;

import java.util.concurrent.ThreadLocalRandom;

public class Die {

	private int DieValue;

	public Die() {
		// DONE: Determine DieVaue.. a random number between 1 and 6
		DieValue = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	}

	public int getDieValue() {
		return DieValue;
	}
}
