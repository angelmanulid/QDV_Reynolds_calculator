package qdvReynoldsCalculator_v1_00;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JTextField;

public class DiameterCalc {
	
	private static DecimalFormat df = new DecimalFormat("0.0000");
	
	public static void compute (JTextField fieldFlowRate, JTextField fieldDiameter, JTextField fieldVelocity, String unitFlowRate, String unitDiameter, String unitVelocity) {
		
		NumberFormat sciFormat = new DecimalFormat("0.####E0");
		Double valueFlowRate = Double.parseDouble(fieldFlowRate.getText());
		Double valueVelocity = Double.parseDouble(fieldVelocity.getText());
		Double valueDiameter = 0.0;
		
        if (valueFlowRate<=0) {
        	fieldFlowRate.setBackground(Color.RED);
        	return;
        }
        if (valueVelocity<=0) {
        	fieldVelocity.setBackground(Color.RED);
        	return;
        }
		
		switch (unitVelocity) {
		case "m/s":
			switch (unitDiameter) {
			case "meter":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				}
				break;
			case "feet":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				}
				break;
			case "inch":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				}
				break;
			case "millimeter":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				}
				break;					
			}
			break;
		case "ft/s":
			valueVelocity = valueVelocity*0.3048;
			switch (unitDiameter) {
			case "meter":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					break;
				}
				break;
			case "feet":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.3048;
					break;
				}
				break;
			case "inch":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter/0.0254;
					break;
				}
				break;
			case "millimeter":
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueFlowRate/60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueFlowRate/3600;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "L/s":
					valueFlowRate = valueFlowRate/1000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "L/min":
					valueFlowRate = valueFlowRate/60000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "L/hr":
					valueFlowRate = valueFlowRate/3_600_000;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				case "gal/min":
					valueFlowRate = valueFlowRate/264.172*60;
					valueDiameter = Math.sqrt(4*valueFlowRate/(Math.PI*valueVelocity));
					valueDiameter = valueDiameter*1000;
					break;
				}
				break;					
			}
			break;
		}
		if (valueDiameter < 0.01) {
			fieldDiameter.setText((sciFormat.format(valueDiameter)).toString());
			} else fieldDiameter.setText((df.format(valueDiameter)).toString());
	}

}
