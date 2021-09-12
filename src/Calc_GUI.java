package qdvReynoldsCalculator_v1_00;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class Calc_GUI extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JRadioButton radioFlowRate = new JRadioButton("Flow Rate");
	JRadioButton radioDiameter = new JRadioButton("Diameter");
	JRadioButton radioVelocity = new JRadioButton("Velocity");
	
	JTextField fieldFlowRate = new JTextField();
	JTextField fieldDiameter = new JTextField();
	JTextField fieldVelocity = new JTextField();
	
	String[] listFlowRateUnit = { "m\u00B3/s", "m\u00B3/min", "m\u00B3/hr", "L/s", "L/min", "L/hr", "gal/min" };
	String[] listDiameterUnit = {"meter", "feet", "inch", "millimeter" };
	String[] listVelocityUnit = { "m/s",  "ft/s" };
	
	JComboBox<String> boxFlowRateUnit = new JComboBox<String>(listFlowRateUnit);
	JComboBox<String> boxDiameterUnit = new JComboBox<String>(listDiameterUnit);
	JComboBox<String> boxVelocityUnit = new JComboBox<String>(listVelocityUnit);
	
	JButton buttonCalc = new JButton("Calculate");
	JButton buttonClear = new JButton("Clear");
	
	JTextField fieldDiameter_Reynolds = new JTextField();
	JTextField fieldDensity_Reynolds = new JTextField();
	JTextField fieldVelocity_Reynolds = new JTextField();
	JTextField fieldViscosity_Reynolds = new JTextField();
	JTextField fieldReynolds = new JTextField();
	
	String[] listDiameterUnit_Reynolds = {"meter", "feet", "inch", "millimeter" };
	String[] listVelocityUnit_Reynolds = { "m/s",  "ft/s" };
	String[] listDensityUnit_Reynolds = { "kg/m\u00B3",  "g/mL" };
	String[] listViscosityUnit_Reynolds = { "Pa\u2022s",  "cP" };
	
	JComboBox<String> boxDiameterUnit_Reynolds = new JComboBox<String>(listDiameterUnit_Reynolds);
	JComboBox<String> boxVelocityUnit_Reynolds = new JComboBox<String>(listVelocityUnit_Reynolds);
	JComboBox<String> boxDensityUnit_Reynolds = new JComboBox<String>(listDensityUnit_Reynolds);
	JComboBox<String> boxViscosityUnit_Reynolds = new JComboBox<String>(listViscosityUnit_Reynolds);
	JLabel labelFlowType = new JLabel("");
	

	JButton buttonCalc_Reynolds = new JButton("Calculate");
	JButton buttonClear_Reynolds = new JButton("Clear");
	
    // Setup COLORS
    Color BLUE = new Color(174, 234, 255);
    Color DARKBLUE = new Color(33, 150, 243);
    Color PINK = new Color(255, 209, 220);
    Color DARKPINK = new Color(205, 94, 119);
    
    
	public void createAndShowGUI() {
		
        // Create and set up the window.
        JFrame frame = new JFrame("QDV & Reynolds Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
        // Create Tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
		
//---------------------------- QDV Tab ----------------------------------//
		
               
        // Create Main Panel
        JPanel cardQDV = new JPanel();
        cardQDV.setPreferredSize(new Dimension(700, 400));
		
		// Top Panel Layout
		JPanel cardTop = new JPanel();
		GridLayout gridlayoutTOP = new GridLayout(4,1);
		cardTop.setLayout(gridlayoutTOP);
		cardTop.setPreferredSize(new Dimension(700, 150));
		cardTop.setBorder(BorderFactory.createEmptyBorder(10,20,5,5));
		
		// Top panel elements
		JLabel labelCalcFor = new JLabel("Calculate for:");
		cardTop.add(labelCalcFor);
		cardTop.add(radioFlowRate);
		cardTop.add(radioDiameter);
		cardTop.add(radioVelocity);
		
		ButtonGroup radioButtons = new ButtonGroup();
		radioButtons.add(radioFlowRate);
		radioButtons.add(radioDiameter);
		radioButtons.add(radioVelocity);
		
		radioFlowRate.addActionListener(this);
		radioDiameter.addActionListener(this);
		radioVelocity.addActionListener(this);
      
        // Mid Panel Layout
        JPanel cardMid1 = new JPanel();
		GridLayout gridlayoutMid = new GridLayout(3,1);
		cardMid1.setLayout(gridlayoutMid);
		cardMid1.setPreferredSize(new Dimension(150, 150));
		cardMid1.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        // Mid panel elements
		JLabel labelFlowRate = new JLabel("Flow Rate");
		JLabel labelDiameter = new JLabel("Diameter");
		JLabel labelVelocity = new JLabel("Velocity");
		cardMid1.add(labelFlowRate);
		cardMid1.add(labelDiameter);
		cardMid1.add(labelVelocity);

		
		GridLayout gridlayoutMid2 = new GridLayout(3,1);
		JPanel cardMid2 = new JPanel();
		cardMid2.setLayout(gridlayoutMid2);
		cardMid2.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		cardMid2.setPreferredSize(new Dimension(350, 150));
		cardMid2.add(fieldFlowRate);
		cardMid2.add(fieldDiameter);
		cardMid2.add(fieldVelocity);
		
		GridLayout gridlayoutMid3 = new GridLayout(3,1);
		JPanel cardMid3 = new JPanel();
		cardMid3.setLayout(gridlayoutMid3);
		cardMid3.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		cardMid3.setPreferredSize(new Dimension(150, 150));
		cardMid3.add(boxFlowRateUnit);
		cardMid3.add(boxDiameterUnit);
		cardMid3.add(boxVelocityUnit);
		
		// Bottom Panel Layout
		JPanel cardBottom = new JPanel();
		cardBottom.setPreferredSize(new Dimension(600, 150));
		cardBottom.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		// Bottom panel elements
		buttonCalc.setPreferredSize(new Dimension(200, 50));
		buttonCalc.addActionListener(this);
		buttonClear.setPreferredSize(new Dimension(100, 50));
		buttonClear.addActionListener(this);
		cardBottom.add(buttonCalc);
		cardBottom.add(buttonClear);
		
        //Add top, mid, bottom panels to 1 panel
        cardQDV.add(cardTop, BorderLayout.PAGE_START);
        cardQDV.add(cardMid1, BorderLayout.LINE_START);
        cardQDV.add(cardMid2, BorderLayout.CENTER);
        cardQDV.add(cardMid3, BorderLayout.LINE_END);
        cardQDV.add(cardBottom, BorderLayout.PAGE_END);
        
        
//-------------------------- Reynold's Calculator Tab -------------------------//		
		
     // Create Main Panel
        JPanel card_Reynolds = new JPanel();
        card_Reynolds.setPreferredSize(new Dimension(700, 400));
		
		// Top Panel Layout
		JPanel cardTop_Reynolds = new JPanel();
		GridLayout gridlayoutTOP_Reynolds = new GridLayout(1,1);
		cardTop_Reynolds.setLayout(gridlayoutTOP_Reynolds);
		cardTop_Reynolds.setPreferredSize(new Dimension(700, 50));
		cardTop_Reynolds.setBorder(BorderFactory.createEmptyBorder(5,10,5,5));
		
		// Top panel elements
		JLabel labelInstruc = new JLabel("Please enter value and choose units:");
		cardTop_Reynolds.add(labelInstruc);
      
        // Mid Panel 1 Layout
        JPanel cardMid1_Reynolds = new JPanel();
		GridLayout gridlayoutMid1_Reynolds = new GridLayout(5,1);
		cardMid1_Reynolds.setLayout(gridlayoutMid1_Reynolds);
		cardMid1_Reynolds.setPreferredSize(new Dimension(150, 250));
		cardMid1_Reynolds.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		JLabel labelDiameter_Reynolds = new JLabel("Diameter");
		JLabel labelVelocity_Reynolds = new JLabel("Velocity");
		JLabel labelDensity_Reynolds = new JLabel("Density");
		JLabel labelViscosity_Reynolds = new JLabel("Viscosity (\u03BC)");
		JLabel labelReynolds = new JLabel("Reynold's");
		cardMid1_Reynolds.add(labelDiameter_Reynolds);
		cardMid1_Reynolds.add(labelVelocity_Reynolds);
		cardMid1_Reynolds.add(labelDensity_Reynolds);
		cardMid1_Reynolds.add(labelViscosity_Reynolds);
		cardMid1_Reynolds.add(labelReynolds);
		
		// Mid Panel 2 Layout
		GridLayout gridlayoutMid2_Reynolds = new GridLayout(5,1);
		JPanel cardMid2_Reynolds = new JPanel();
		cardMid2_Reynolds.setLayout(gridlayoutMid2_Reynolds);
		cardMid2_Reynolds.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		cardMid2_Reynolds.setPreferredSize(new Dimension(350, 250));		
		cardMid2_Reynolds.add(fieldDiameter_Reynolds);
		cardMid2_Reynolds.add(fieldVelocity_Reynolds);
		cardMid2_Reynolds.add(fieldDensity_Reynolds);
		cardMid2_Reynolds.add(fieldViscosity_Reynolds);
		
		
		fieldReynolds.setEditable(false);
		fieldReynolds.setBackground(DARKPINK);
		cardMid2_Reynolds.add(fieldReynolds);
		
		// Mid Panel 3 Layout
		GridLayout gridlayoutMid3_Reynolds = new GridLayout(5,1);
		JPanel cardMid3_Reynolds = new JPanel();
		cardMid3_Reynolds.setLayout(gridlayoutMid3_Reynolds);
		cardMid3_Reynolds.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		cardMid3_Reynolds.setPreferredSize(new Dimension(150, 250));
		cardMid3_Reynolds.add(boxDiameterUnit_Reynolds);
		cardMid3_Reynolds.add(boxVelocityUnit_Reynolds);
		cardMid3_Reynolds.add(boxDensityUnit_Reynolds);
		cardMid3_Reynolds.add(boxViscosityUnit_Reynolds);
		cardMid3_Reynolds.add(labelFlowType);
		
		// Bottom Panel Layout
		JPanel cardBottom_Reynolds = new JPanel();
		cardBottom_Reynolds.setPreferredSize(new Dimension(600, 150));
		cardBottom_Reynolds.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		// Bottom panel elements
		buttonCalc_Reynolds.setPreferredSize(new Dimension(200, 50));
		buttonCalc_Reynolds.addActionListener(this);
		buttonClear_Reynolds.setPreferredSize(new Dimension(100, 50));
		buttonClear_Reynolds.addActionListener(this);
		cardBottom_Reynolds.add(buttonCalc_Reynolds);
		cardBottom_Reynolds.add(buttonClear_Reynolds);
		
        //Add top, mid, bottom panels to 1 panel
		card_Reynolds.add(cardTop_Reynolds, BorderLayout.PAGE_START);
		card_Reynolds.add(cardMid1_Reynolds, BorderLayout.LINE_START);
		card_Reynolds.add(cardMid2_Reynolds, BorderLayout.CENTER);
		card_Reynolds.add(cardMid3_Reynolds, BorderLayout.LINE_END);
		card_Reynolds.add(cardBottom_Reynolds, BorderLayout.PAGE_END);
		
		
		
//-------------------------- Main Frame ------------------------------------//

		// Create Font and set Font of all elements
		// QDV Tab
        Font f = new Font("serif", Font.PLAIN, 20);
        tabbedPane.setFont(f);
        labelInstruc.setFont(f);
        labelCalcFor.setFont(f);
        radioFlowRate.setFont(f);
        radioDiameter.setFont(f);
        radioVelocity.setFont(f);
        labelFlowRate.setFont(f);
        fieldFlowRate.setFont(f);
        boxFlowRateUnit.setFont(f);
        labelDiameter.setFont(f);
        fieldDiameter.setFont(f);
        boxDiameterUnit.setFont(f);
        labelVelocity.setFont(f);
        fieldVelocity.setFont(f);
        boxVelocityUnit.setFont(f);
        buttonCalc.setFont(f);
        buttonClear.setFont(f);
        // Reynold's Tab
        fieldViscosity_Reynolds.setFont(f);
        fieldDiameter_Reynolds.setFont(f);
        fieldDensity_Reynolds.setFont(f);
        fieldVelocity_Reynolds.setFont(f);
        fieldReynolds.setFont(f);
        boxDiameterUnit_Reynolds.setFont(f);
        boxVelocityUnit_Reynolds.setFont(f);
        boxDensityUnit_Reynolds.setFont(f);
        boxViscosityUnit_Reynolds.setFont(f);
        labelFlowType.setFont(f);
        buttonCalc_Reynolds.setFont(f);
        buttonClear_Reynolds.setFont(f);
        labelDiameter_Reynolds.setFont(f);
        labelVelocity_Reynolds.setFont(f);
        labelDensity_Reynolds.setFont(f);
        labelViscosity_Reynolds.setFont(f);
        labelReynolds.setFont(f);
        
        // Set BackGround Colors
//        frame.getContentPane().setBackground(BLUE);
        cardQDV.setBackground(BLUE);
        cardTop.setBackground(BLUE);
        cardMid1.setBackground(BLUE);
        cardMid2.setBackground(BLUE);
        cardMid3.setBackground(BLUE);
        cardBottom.setBackground(BLUE);
        radioFlowRate.setBackground(BLUE);
        radioDiameter.setBackground(BLUE);
        radioVelocity.setBackground(BLUE);
        
    	card_Reynolds.setBackground(PINK);
        cardTop_Reynolds.setBackground(PINK);
        cardMid1_Reynolds.setBackground(PINK);
        cardMid2_Reynolds.setBackground(PINK);
        cardMid3_Reynolds.setBackground(PINK);
        cardBottom_Reynolds.setBackground(PINK);
        
        
        // Add panel to frame
        tabbedPane.addTab("QDV Calculator", cardQDV);
        tabbedPane.addTab("Reynold's Calculator", card_Reynolds);
        frame.add(tabbedPane, BorderLayout.CENTER);        
        

        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
				
		if(e.getSource() == radioFlowRate) {
			fieldFlowRate.setText("");
			fieldFlowRate.setEditable(false);
			fieldDiameter.setEditable(true);
			fieldVelocity.setEditable(true);
			fieldFlowRate.setBackground(DARKBLUE);
			fieldDiameter.setBackground(Color.WHITE);
			fieldVelocity.setBackground(Color.WHITE);
		}
		
		if(e.getSource() == radioDiameter) {
			fieldDiameter.setText("");
			fieldDiameter.setEditable(false);
			fieldFlowRate.setEditable(true);
			fieldVelocity.setEditable(true);
			fieldDiameter.setBackground(DARKBLUE);
			fieldFlowRate.setBackground(Color.WHITE);
			fieldVelocity.setBackground(Color.WHITE);
		}
		if(e.getSource() == radioVelocity) {
			fieldVelocity.setText("");
			fieldVelocity.setEditable(false);
			fieldFlowRate.setEditable(true);
			fieldDiameter.setEditable(true);
			fieldVelocity.setBackground(DARKBLUE);
			fieldFlowRate.setBackground(Color.WHITE);
			fieldDiameter.setBackground(Color.WHITE);
		}
		if(e.getSource() == buttonCalc) {
			
	        String unitFlowRate = (String)boxFlowRateUnit.getSelectedItem();
	        String unitDiameter = (String)boxDiameterUnit.getSelectedItem();
	        String unitVelocity = (String)boxVelocityUnit.getSelectedItem();
	        	        
	        
	        if (radioFlowRate.isSelected()) {
				FlowRateCalc.compute(fieldFlowRate, fieldDiameter, fieldVelocity, unitFlowRate, unitDiameter, unitVelocity);
	        } else if (radioDiameter.isSelected()) {
				DiameterCalc.compute(fieldFlowRate, fieldDiameter, fieldVelocity, unitFlowRate, unitDiameter, unitVelocity);
	        } else if (radioVelocity.isSelected()) {
				VelocityCalc.compute(fieldFlowRate, fieldDiameter, fieldVelocity, unitFlowRate, unitDiameter, unitVelocity);
	        }
		}
		if(e.getSource() == buttonClear) {
			fieldFlowRate.setText("");
			fieldDiameter.setText("");
			fieldVelocity.setText("");
		}
		
		if(e.getSource() == buttonCalc_Reynolds) {
			if (Double.parseDouble(fieldDiameter_Reynolds.getText()) <=0 || Double.parseDouble(fieldVelocity_Reynolds.getText()) <=0 
					|| Double.parseDouble(fieldDensity_Reynolds.getText()) <=0 || Double.parseDouble(fieldViscosity_Reynolds.getText()) <=0) {
				labelFlowType.setText("Invalid input");
				labelFlowType.setForeground(Color.RED);
			}
			ReynoldsCalc.compute(fieldDiameter_Reynolds, fieldVelocity_Reynolds, fieldDensity_Reynolds, fieldViscosity_Reynolds, 
					fieldReynolds, boxDiameterUnit_Reynolds, boxVelocityUnit_Reynolds, boxDensityUnit_Reynolds, 
					boxViscosityUnit_Reynolds, labelFlowType);
		}
		if(e.getSource() == buttonClear_Reynolds) {
			fieldDiameter_Reynolds.setText("");
			fieldVelocity_Reynolds.setText("");
			fieldDensity_Reynolds.setText("");
			fieldViscosity_Reynolds.setText("");
			fieldReynolds.setText("");
			labelFlowType.setText("");
			
			fieldDiameter_Reynolds.setBackground(Color.WHITE);
			fieldVelocity_Reynolds.setBackground(Color.WHITE);
			fieldDensity_Reynolds.setBackground(Color.WHITE);
			fieldViscosity_Reynolds.setBackground(Color.WHITE);

		}

		
		} catch (Exception ex) {
				System.err.print(ex);
			}
		}
		
		

		
}

