package qdvReynoldsCalculator_v1_00;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReynoldsCalc {
	
	public static void compute (JTextField fieldDiameter_Reynolds, JTextField fieldVelocity_Reynolds, JTextField fieldDensity_Reynolds, JTextField fieldViscosity_Reynolds, JTextField fieldReynolds, JComboBox boxDiameterUnit_Reynolds, JComboBox boxVelocityUnit_Reynolds, JComboBox boxDensityUnit_Reynolds, JComboBox boxViscosityUnit_Reynolds, JLabel labelFlowType) {
		Double valueDiameter_Reynolds = Double.parseDouble(fieldDiameter_Reynolds.getText());
		Double valueVelocity_Reynolds = Double.parseDouble(fieldVelocity_Reynolds.getText());
		Double valueDensity_Reynolds = Double.parseDouble(fieldDensity_Reynolds.getText());
		Double valueViscosity_Reynolds = Double.parseDouble(fieldViscosity_Reynolds.getText());
		Double valueReynolds = 0.0;
		
        String unitDiameter_Reynolds = (String)boxDiameterUnit_Reynolds.getSelectedItem();
        String unitVelocity_Reynolds = (String)boxVelocityUnit_Reynolds.getSelectedItem();
        String unitDensity_Reynolds = (String)boxDensityUnit_Reynolds.getSelectedItem();
        String unitViscosity_Reynolds = (String)boxViscosityUnit_Reynolds.getSelectedItem();
        
        if (valueDiameter_Reynolds<=0) {
        	fieldDiameter_Reynolds.setBackground(Color.RED);
        	return;
        }
        if (valueVelocity_Reynolds<=0) {
        	fieldVelocity_Reynolds.setBackground(Color.RED);
        	return;
        }
        if (valueDensity_Reynolds<=0) {
        	fieldDensity_Reynolds.setBackground(Color.RED);
        	return;
        }
        if (valueViscosity_Reynolds<=0) {
        	fieldViscosity_Reynolds.setBackground(Color.RED);
        	return;
        }
        
        fieldDiameter_Reynolds.setBackground(Color.WHITE);
        fieldVelocity_Reynolds.setBackground(Color.WHITE);
        fieldDensity_Reynolds.setBackground(Color.WHITE);
        fieldViscosity_Reynolds.setBackground(Color.WHITE);
        
        switch (unitVelocity_Reynolds) {
        case "m/s":
        	switch (unitDensity_Reynolds) {
        	case "kg/m\u00B3":
        		switch (unitViscosity_Reynolds) {
        		case "Pa\u2022s":
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		case "cP":
        			valueViscosity_Reynolds = valueViscosity_Reynolds/1000;
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		}
        		break;
        	case "g/mL":
        		valueDensity_Reynolds = valueDensity_Reynolds*1000;
        		switch (unitViscosity_Reynolds) {
        		case "Pa\u2022s":
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		case "cP":
        			valueViscosity_Reynolds = valueViscosity_Reynolds/1000;
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		}
        		break;
        	}
        	break;
        case "ft/s":
        	valueVelocity_Reynolds = valueVelocity_Reynolds*0.3048;
        	switch (unitDensity_Reynolds) {
        	case "kg/m\u00B3":
        		switch (unitViscosity_Reynolds) {
        		case "Pa\u2022s":
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		case "cP":
        			valueViscosity_Reynolds = valueViscosity_Reynolds/1000;
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		}
        		break;
        	case "g/mL":
        		valueDensity_Reynolds = valueDensity_Reynolds*1000;
        		switch (unitViscosity_Reynolds) {
        		case "Pa\u2022s":
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		case "cP":
        			valueViscosity_Reynolds = valueViscosity_Reynolds/1000;
        			switch (unitDiameter_Reynolds) {
        			case "meter":
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "feet":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.3048;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "inch":
        				valueDiameter_Reynolds = valueDiameter_Reynolds*0.0254;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			case "millimeter":
        				valueDiameter_Reynolds = valueDiameter_Reynolds/1000;
        				valueReynolds = valueDiameter_Reynolds*valueVelocity_Reynolds*valueDensity_Reynolds/valueViscosity_Reynolds;
        				break;
        			}
        			break;
        		}
        		break;
        	}
        	break;
        }

        fieldReynolds.setText(valueReynolds.toString());       
        
        if (valueReynolds > 2300) {
        	labelFlowType.setText("Turbulent flow");	   	        	
        } else if (valueReynolds > 0) {
        	labelFlowType.setText("Laminar flow");
        } else {
        	labelFlowType.setText("");
        	fieldReynolds.setText("Please do not enter negative/zero values");
        }
        

	}

}
