package com.putri.javaGUI;

import javax.swing.*;

public class RunFromBiodata {
    public static void main(String[] args) {
        JFrame JFrame = new JFrame("FormBiodata");
        JFrame.setContentPane(new FromBiodata().getRootPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(500,400);
        JFrame.setVisible(true);
    }

}
