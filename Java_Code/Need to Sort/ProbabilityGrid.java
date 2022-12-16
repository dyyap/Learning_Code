package d141;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Nick
public class ProbabilityGrid {

	private float[][] probabilities;

	private boolean ready = false;

	private int packLevels, cardLevels;

	public ProbabilityGrid(int maxPackLevel, int maxCardLevel, String location) {

		this.packLevels = maxPackLevel;
		this.cardLevels = maxCardLevel;
		try {
			load(new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param packLvl
	 *            The level of the pack (start at 0)
	 * @param cardLvl
	 *            The level of the card (start at 0)
	 * @return Probability between 0 (exclusive) and 1 (exclusive)
	 */
	public float getProbablity(int packLvl, int cardLvl) {
		return probabilities[packLvl][cardLvl];
	}

	public void load(File f) throws IOException {

		int insertColumn = 0, insertRow = 0;

		Scanner s = new Scanner(f);

		do {

			String line = s.nextLine();

			if (line.contains("-")) {
				insertColumn++;
				insertRow = 0;
				continue;
			}

			float value = s.nextFloat();

			if (value > 0 && value < 1) {
				probabilities[insertColumn][insertRow] = value;
				insertRow++;
			}

		} while (s.hasNextLine());

		s.close();

		if (loadedCorrectly()) {
			ready = true;
		} else {
			System.err.println("Probabilites did not load correctly!");
		}
	}

	private boolean loadedCorrectly() {

		for (int x = 0; x < packLevels; x++) {
			for (int y = 0; y < cardLevels; y++) {

				float val = getProbablity(x, y);
				if (val <= 0 || val >= 1) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean isReady() {
		return ready;
	}
}
