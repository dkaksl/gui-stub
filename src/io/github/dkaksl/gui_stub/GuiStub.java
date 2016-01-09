/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */

package io.github.dkaksl.gui_stub;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Amani Kilumanga
 *
 */
@SuppressWarnings("serial")
public class GuiStub extends JFrame implements ActionListener {

	private final JPanel centerPanel;

	public GuiStub(int width, int height) {
		centerPanel = generateCenterPanel();

		this.setLayout(new BorderLayout());
		this.setSize(width, height);
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private static JPanel generateCenterPanel() {
		JPanel jPanel = new JPanel();

		return jPanel;
	}

	private static void generateMainWindow() {
		GuiStub guiStub = new GuiStub(600, 600);
	}

	public void actionPerformed(ActionEvent e) {
		// if (e.equals(objectA)) { // do stuff }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				generateMainWindow();
			}
		});
	}
}
