/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author prat
 */
public class Test {

    public static void main(String args[]) throws FileNotFoundException {
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream( new FileOutputStream("Beanarchive.xml")))) {
            encoder.writeObject("Pratz");
        }
        
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("Beanarchive.xml")))) {
            Object object = decoder.readObject();
            System.out.println(object);
        }

    }
}
