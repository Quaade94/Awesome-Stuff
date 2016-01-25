package Diablo3Calculator;

import javax.swing.JOptionPane;

public class Controller {
	
	private boolean loop = true;
	private int response = 0;
	private String[] choices = {"Gem Calculator", "Paragon Calculator", "Exit"};
	
	GemUpgrade GU = new GemUpgrade();
	ParagonCalculator PC = new ParagonCalculator();

	public void programLoop(){

		while (loop) {

			response = JOptionPane.showOptionDialog(
					null                         // Center in window.
					, "Choose a service:"        // Message
					, "Diablo 3 Calculator"      // Title in titlebar
					, JOptionPane.YES_NO_OPTION  // Option type
					, JOptionPane.PLAIN_MESSAGE  // messageType
					, null                       // Icon (none)
					, choices                    // Button text as above.
					, ""    // Default button's label
					);

			if (response == 0){
				GU.gemUpgrade();
			}

			if (response == 1){
				PC.paragonCalculator();
			}
			if (response == 2){
				System.exit(0);
			}
		}
	}
	
}
