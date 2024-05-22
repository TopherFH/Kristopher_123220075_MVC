/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Asus
 */
import View.Dosen.ViewDataDosen;
import View.Mahasiswa.ViewData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class HalamanUtama extends JFrame implements ActionListener{
    
    JLabel header = new JLabel("Welcome, User");
    JLabel text = new JLabel("Pilihlah Menu untuk ditampilkan");
    JButton button1 = new JButton("Mahasiswa");
    JButton button2 = new JButton("Dosen");
    
    public HalamanUtama (){
        
        setTitle("Main Page");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setSize(720, 720);
        
        add(header);
        header.setBounds(180, 40, 200, 30);
        
        add(text);
        text.setBounds(20, 100, 400, 40);
        
        add(button1);
        button1.setBounds(30, 180, 500, 50);
        
        add(button2);
        button2.setBounds(30, 240, 500, 50);
        
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            new ViewData();
        }
        else if (e.getSource()==button2){
            new ViewDataDosen();
        }
        this.dispose();;
    }
}
      