package com;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Test {

	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.getHostName() + "[" + inet.getHostAddress() + "]");
		JOptionPane.showMessageDialog(null, "msg", "title", JOptionPane.INFORMATION_MESSAGE); 
	}

}
