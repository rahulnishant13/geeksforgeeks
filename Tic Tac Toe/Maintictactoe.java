/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MyGame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author RAHUL
 */
public class Maintictactoe extends JFrame{
	JPanel p = new JPanel();

	public static void main(String [] args){
		Maintictactoe obj = new Maintictactoe();
	}
	public Maintictactoe() {
		super("Maintictactoe");
		setSize(400,400);
		setResizable(true);
                setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3,3));
		JButton b1 = new JButton();
                p.add(b1);
                b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                JButton b2 = new JButton();
                p.add(b2);
                b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    }
                   });
                JButton b3 = new JButton();
                p.add(b3);
                b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    }
                 });
                JButton b4 = new JButton();
                p.add(b4);
                b4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    }
                });
                JButton b5 = new JButton();
                p.add(b5);
                b5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
                });
                JButton b6 = new JButton();
                p.add(b6);
                b6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
                });
                JButton b7 = new JButton();
                p.add(b7);
                b7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
                });
                JButton b8 = new JButton();
                p.add(b8);
                b8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
                });
                JButton b9 = new JButton();
                p.add(b9);
                b9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
                });

                add(p);
	}
}