package com.putri.javaGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FromBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;

    public FromBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dari textnama
                String nama = textNama.getText();
                //mengambil data dari textnim
                String nim = textNim.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                System.out.println(mhs.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

}


