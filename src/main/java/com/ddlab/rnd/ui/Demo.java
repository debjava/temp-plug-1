package com.ddlab.rnd.ui;

import javax.swing.JFrame;

public class Demo {

	public static void main(String[] args) {
		Panel1 p1 = new Panel1();
//		p1.show(true);
		
		// Create the frame
        JFrame frame = new JFrame("Simple JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        // Add panel to frame
        frame.add(p1);

        // Display the frame
        frame.setVisible(true);


	}

}
