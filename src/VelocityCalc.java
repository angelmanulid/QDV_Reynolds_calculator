package qdvReynoldsCalculator_v1_00;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JTextField;

public class VelocityCalc {
	
	private static DecimalFormat df = new DecimalFormat("0.0000");
	
	public static void compute(JTextField fieldFlowRate, JTextField fieldDiameter, JTextField fieldVelocity, String unitFlowRate, String unitDiameter, String unitVelocity) {
		
		NumberFormat sciFormat = new DecimalFormat("0.####E0");
		
		Double valueFlowRate = Double.parseDouble(fieldFlowRate.getText());
		Double valueDiameter = Double.parseDouble(fieldDiameter.getText());
		Double valueVelocity = 0.0;
		
        if (valueDiameter<=0) {
        	fieldDiameter.setBackground(Color.RED);
        	return;
        }
        if (valueFlowRate<=0) {
        	fieldFlowRate.setBackground(Color.RED);
        	return;
        }
		
		switch (unitVelocity) {
		case "m/s":
			switch (unitDiameter) {
			case "meter":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			case "feet":
				valueDiameter = valueDiameter*0.3048;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			case "inch":
				valueDiameter = valueDiameter*0.0254;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			case "millimeter":
				valueDiameter = valueDiameter/1000;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			}
			break;
		case "ft/s":
			switch (unitDiameter) {
			case "meter":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			case "feet":
				valueDiameter = valueDiameter*0.3048;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			case "inch":
				valueDiameter = valueDiameter*0.0254;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			case "millimeter":
				valueDiameter = valueDiameter/1000;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueVelocity = 4*valueFlowRate/(Math.PI*Math.pow(valueDiameter, 2));
					break;
				}
				break;
			}
			valueVelocity = valueVelocity*0.3048;
			System.out.println("Velocity = " + valueVelocity);
			break;
		}
		if (valueVelocity < 0.01) {
		fieldVelocity.setText((sciFormat.format(valueVelocity)).toString());
		} else fieldVelocity.setText((df.format(valueVelocity)).toString());
	}

}
