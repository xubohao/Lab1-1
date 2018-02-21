package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// DONE: Execute Come Out roll, value ComeOutScore
		Roll roll = new Roll();
		rolls.add(roll);
		ComeOutScore = roll.getScore();

		// DONE: Create a loop that will execute a roll until point is made, or
		// seven-out
		// DONE: value the eGameResult after the round is complete
		
		// Issue: 
		// Because the given code use the same identifier "eGameResult"
		// for the Enum class name and the local variable,
		// I have to use the package name to differentiate them.
		// And I do not think that is a good practice...
		
		// switch initial:
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			eGameResult = pkgCore.eGameResult.CRAPS;
		} 
		else if (ComeOutScore == 7 || ComeOutScore == 11) {
			eGameResult = pkgCore.eGameResult.NATURAL;
		} 
		else {
			// Point or Seven-out case
			while (true) {
				Roll roll_try = new Roll();
				rolls.add(roll_try);
				int TryOutScore = roll_try.getScore();
				if (TryOutScore == 7) {
					eGameResult = pkgCore.eGameResult.SEVEN_OUT;
					break;
				} 
				else if (TryOutScore == ComeOutScore) {
					eGameResult = pkgCore.eGameResult.POINT;
					break;
				}
				// else: continue till Seven-out or Point.
			}
		}
	}

	public int RollCount() {
		// Return the roll count
		//return 0;
		
		// No to-do tag here, but implemented with intuition.
		return rolls.size();
	}

}
