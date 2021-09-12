package qdvReynoldsCalculator_v1_00;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JTextField;

public class FlowRateCalc {
	
	private static DecimalFormat df = new DecimalFormat("0.0000");
	
	public static void compute(JTextField fieldFlowRate, JTextField fieldDiameter, JTextField fieldVelocity, String unitFlowRate, String unitDiameter, String unitVelocity) {
		
		NumberFormat sciFormat = new DecimalFormat("0.####E0");
		
		Double valueDiameter = Double.parseDouble(fieldDiameter.getText());
		Double valueVelocity = Double.parseDouble(fieldVelocity.getText());
		Double valueFlowRate = 0.0;
        if (valueDiameter<=0) {
        	fieldDiameter.setBackground(Color.RED);
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
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
					break;
				}
				break;
			case "feet":
				valueDiameter = valueDiameter*0.3048;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
					break;
				}
				break;
			case "inch":
				valueDiameter = valueDiameter*0.0254;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
					break;
				}
				break;
			case "millimeter":
				valueDiameter = valueDiameter/1000;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
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
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
					break;
				}
				break;
			case "feet":
				valueDiameter = valueDiameter*0.3048;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
					break;
				}
				break;
			case "inch":
				valueDiameter = valueDiameter*0.0254;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
					break;
				}
				break;
			case "millimeter":
				valueDiameter = valueDiameter/1000;
				switch (unitFlowRate) {
				case "m\u00B3/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					break;
				case "m\u00B3/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60;
					break;
				case "m\u00B3/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3600;
					break;
				case "L/s":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*1000;
					break;
				case "L/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*60000;
					break;
				case "L/hr":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*3_600_000;
					break;
				case "gal/min":
					valueFlowRate = valueVelocity*Math.PI*Math.pow(valueDiameter, 2)/4;
					valueFlowRate = valueFlowRate*264.172*60;
					break;
				}
				break;
			}
			break;
		}
		if (valueFlowRate < 0.01) {
			fieldFlowRate.setText((sciFormat.format(valueFlowRate)).toString());
		} else fieldFlowRate.setText((df.format(valueFlowRate)).toString());
		
	}

}
