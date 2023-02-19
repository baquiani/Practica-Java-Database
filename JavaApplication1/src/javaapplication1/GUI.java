/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;  

public class GUI implements ItemListener,ActionListener,WindowListener{
    
    
    
    Checkbox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10;  
    Label label,label2;
    Button bt1,bt2;
    TextField tf1,tf2,tf3,tf4;
    TextField[] a=new TextField[7];
    ConBD bd=new ConBD();
    TextArea textArea;
    Frame f;
    JFrame f1;
    
    GUI(){
       
        
        f= new Frame("Gestiune date Post TV");
        f1=new JFrame("Eroare");
        
        label = new Label();            
            
        label.setSize(500,100);
        label.setBounds(600,200,1000,400);
        textArea=new TextArea();
        textArea.setBounds(500,200,700,300);
        f.addWindowListener(this);
        
        checkBox1 = new Checkbox("Studio");    
        checkBox1.setBounds(100,100, 50,50);    
        checkBox2 = new Checkbox("Firma");    
        checkBox2.setBounds(250,100, 50,50);
        checkBox3 = new Checkbox("Persoane");    
        checkBox3.setBounds(400,100, 150,50);
        checkBox4 = new Checkbox("Emisiuni");    
        checkBox4.setBounds(550,100, 150,50);
        checkBox5 = new Checkbox("Sponsorizari");    
        checkBox5.setBounds(700,100, 150,50);
        checkBox6 = new Checkbox("Localitati");    
        checkBox6.setBounds(100,150, 150,50);    
        checkBox7 = new Checkbox("Colaborari");    
        checkBox7.setBounds(250,150, 150,50);
        checkBox8 = new Checkbox("Difuzari");    
        checkBox8.setBounds(400,150, 150,50);
        checkBox9 = new Checkbox("Tipuri Emisiuni");    
        checkBox9.setBounds(550,150, 150,50);
        checkBox10 = new Checkbox("Meserii");    
        checkBox10.setBounds(700,150, 150,50);
        bt1=new Button("introdu date");
        bt1.setBounds(100,600,100,50);
        bt2=new Button("afiseaza date");
        bt2.setBounds(500,600,100,50);
        
        a[0]=new TextField();
        a[0].setBounds(100,200,200,20);
        a[1]=new TextField();
        a[1].setBounds(100,250,200,20);
        a[2]=new TextField();
        a[2].setBounds(100,300,200,20);
        a[3]=new TextField();
        a[3].setBounds(100,350,200,20);
        a[4]=new TextField();
        a[4].setBounds(100,400,200,20);
        a[5]=new TextField();
        a[5].setBounds(100,450,200,20);
        
        f.add(textArea);f.add(checkBox1); f.add(checkBox2);f.add(checkBox3);f.add(checkBox4);f.add(checkBox5);f.add(checkBox6);f.add(checkBox7);f.add(checkBox8);f.add(checkBox9);f.add(checkBox10); f.add(label);f.add(bt1);f.add(bt2);f.add(a[0]);f.add(a[1]);f.add(a[2]);f.add(a[3]);f.add(a[4]);f.add(a[5]);
        checkBox1.addItemListener(this);    
        checkBox2.addItemListener(this);
        checkBox3.addItemListener(this);
        checkBox4.addItemListener(this);
        checkBox5.addItemListener(this);
        checkBox6.addItemListener(this);
        checkBox7.addItemListener(this);
        checkBox8.addItemListener(this);
        checkBox9.addItemListener(this);
        checkBox10.addItemListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        f.setSize(1280,720);    
        f.setLayout(null);    
        f.setVisible(true);
        f.addWindowListener(this);
        a[0].setVisible(false);
        a[1].setVisible(false);
        a[2].setVisible(false);
        a[3].setVisible(false);
        a[4].setVisible(false);
        a[5].setVisible(false);
       
             
     }

    public void windowActivated(WindowEvent e) {}    
    public void windowClosed(WindowEvent e) {}    
    public void windowClosing(WindowEvent e) {    
        f.dispose();    
    }    
    public void windowDeactivated(WindowEvent e) {}    
    public void windowDeiconified(WindowEvent e) {}    
    public void windowIconified(WindowEvent e) {}    
    public void windowOpened(WindowEvent arg0) {}    
           
    public void itemStateChanged(ItemEvent e) {      
        if(e.getSource()==checkBox1){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(false);
            a[3].setVisible(false);
            a[4].setVisible(false);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Nume studio");
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
            
            
        
        
        }
        if(e.getSource()==checkBox2){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(false);
            a[3].setVisible(false);
            a[4].setVisible(false);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Nume firma");
            checkBox1.setState(false);
            
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
        }
        if(e.getSource()==checkBox3){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(true);
            a[3].setVisible(true);
            a[4].setVisible(true);
            a[5].setVisible(true);
            
            a[0].setText("ID");
            a[1].setText("Nume");
            a[2].setText("Prenume");
            a[3].setText("CNP");
            a[4].setText("Domiciliu");
            a[5].setText("Meserie");
            
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
            
            
        
        
        }
        
        if(e.getSource()==checkBox4){
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(true);
            a[3].setVisible(true);
            a[4].setVisible(true);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Nume emisiune");
            a[2].setText("Tip emisiune");
            a[3].setText("Coordonator Sef");
            a[4].setText("Locatie");
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
            
        }
        if(e.getSource()==checkBox5){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(true);
            a[3].setVisible(true);
            a[4].setVisible(false);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Suma RON");
            a[2].setText("Emisiune sponsorizata");
            a[3].setText("Firma sponsor");
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
            
            
        
        
        }
        if(e.getSource()==checkBox6){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(false);
            a[3].setVisible(false);
            a[4].setVisible(false);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Nume localitate");
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
            
            
        
        
        }
        if(e.getSource()==checkBox7){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(true);
            a[3].setVisible(false);
            a[4].setVisible(false);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Nume persoana");
            a[2].setText("Nume emisiune");
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
            
            
        
        
        }
        if(e.getSource()==checkBox8){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(true);
            a[3].setVisible(true);
            a[4].setVisible(true);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Ziua difuzarii");
            a[2].setText("Ora inceput");
            a[3].setText("Ora sfarsit");
            a[4].setText("Tipul emisiunii");
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox9.setState(false);
            checkBox10.setState(false);
            
            
        
        
        }
        if(e.getSource()==checkBox9){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(false);
            a[3].setVisible(false);
            a[4].setVisible(false);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Tip emisiune");
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox10.setState(false);
            
            
        
        
        }
        if(e.getSource()==checkBox10){  
            a[0].setVisible(true);
            a[1].setVisible(true);
            a[2].setVisible(false);
            a[3].setVisible(false);
            a[4].setVisible(false);
            a[5].setVisible(false);
            a[0].setText("ID");
            a[1].setText("Nume meserie");
            checkBox1.setState(false);
            checkBox2.setState(false);
            checkBox3.setState(false);
            checkBox4.setState(false);
            checkBox5.setState(false);
            checkBox6.setState(false);
            checkBox7.setState(false);
            checkBox8.setState(false);
            checkBox9.setState(false);
            
            
        
        
        }
     }  
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==bt1){
        if(checkBox1.getState()==true){
            bd.insertStudio(Integer.parseInt(a[0].getText()), a[1].getText());
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
        }
        if(checkBox2.getState()==true){
            bd.insertFirma(Integer.parseInt(a[0].getText()),a[1].getText());
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
        }
        if(checkBox3.getState()==true){
            if(a[3].getText().length()<13||a[3].getText().length()>13){
                JOptionPane.showMessageDialog(f1,"Introduceti un CNP de 13 caractere!");
            }
            else{
            bd.insertPersoane(Integer.parseInt(a[0].getText()), a[1].getText(),a[2].getText(),a[3].getText(),Integer.parseInt(a[4].getText()),Integer.parseInt(a[5].getText()));
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            }
        }
        
        if(checkBox4.getState()==true){
            bd.insertEmisiuni(Integer.parseInt(a[0].getText()), a[1].getText(),Integer.parseInt(a[2].getText()),Integer.parseInt(a[3].getText()),Integer.parseInt(a[4].getText()));
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            
        }
        
        if(checkBox5.getState()==true){
            if(Double.parseDouble(a[1].getText())<0 || Double.parseDouble(a[1].getText())>99999999){
                JOptionPane.showMessageDialog(f1,"Introduceti o suma mai mare decat 0 si mai mica decat 99.999.999!");
            }
            else{
            bd.insertSponsorizare(Integer.parseInt(a[0].getText()), Double.parseDouble(a[1].getText()),Integer.parseInt(a[2].getText()),Integer.parseInt(a[3].getText()));
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            }
        }
        if(checkBox6.getState()==true){
            bd.insertLocalitati(Integer.parseInt(a[0].getText()), a[1].getText());
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            
        }
        if(checkBox7.getState()==true){
            bd.insertColaborari(Integer.parseInt(a[0].getText()), Integer.parseInt(a[1].getText()),Integer.parseInt(a[2].getText()));
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            
        }
        if(checkBox8.getState()==true){
            if(Integer.parseInt(a[2].getText())>Integer.parseInt(a[3].getText())){
                JOptionPane.showMessageDialog(f1,"Ora inceperii trebuie sa fie mai mica decat ora de sfarsit!");
                
            }
            else{
            bd.insertDifuzari(Integer.parseInt(a[0].getText()), a[1].getText(),Integer.parseInt(a[2].getText()),Integer.parseInt(a[3].getText()),Integer.parseInt(a[4].getText()));
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            }
        }
        if(checkBox9.getState()==true){
            bd.insertTipEmisiune(Integer.parseInt(a[0].getText()), a[1].getText());
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            
        }
        if(checkBox10.getState()==true){
            bd.insertMeserii(Integer.parseInt(a[0].getText()), a[1].getText());
            JOptionPane.showMessageDialog(f1,"Date introduse cu succes!");
            
        }
        
       
        }
        
        if(e.getSource()==bt2){
            
            if(checkBox1.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectStudio();
                while(a[i]!=null){
                    b=b+a[i]+"  "+" \n";
                    i++;
                }
                textArea.setText(b);
            }
            
            if(checkBox2.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectFirme();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox3.getState()==true){
                String[] a=new String[1000];
                String b="";
                int i=0;
                a=bd.selectPersoane();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox4.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectEmisiune();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox5.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectSponsorizari();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox6.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectLocalitati();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox7.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectColaborari();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox8.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectDifuzari();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox9.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectTipEmisiune();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            if(checkBox10.getState()==true){
                String[] a=new String[100];
                String b="";
                int i=0;
                a=bd.selectMeserii();
                while(a[i]!=null){
                    b=b+a[i]+"  "+"\n";
                    i++;
                }
                textArea.setText(b);
            }
            
        }
        
    }
    
    
    
        
        
    
    
    
    
    
}
