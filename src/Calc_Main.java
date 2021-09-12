package qdvReynoldsCalculator_v1_00;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Calc_Main {

	public static void main(String[] args) {
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
			System.err.print(e);
		}
		
		
		
		try {
        	Calc_GUI gui = new Calc_GUI();
            gui.createAndShowGUI();
        } catch (Exception e) {
        	System.err.print(e);
        }

	}

}
