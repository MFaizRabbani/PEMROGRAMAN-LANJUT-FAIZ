package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dari textNama
                String nama = textNama.getText();
                //mengambil data dari textNim
                String nim = textNim.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                //Tampilkan output ke Form
                labelHasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}