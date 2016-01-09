/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */

package io.github.dkaksl.gui_stub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author Amani Kilumanga
 *
 */
@SuppressWarnings("serial")
public class GuiStub extends JFrame implements ActionListener {

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

	public void actionPerformed(ActionEvent e) {

	}

	private static void generateMainWindow() {

	}
}
