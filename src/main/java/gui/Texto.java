/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author marcos
 */
public class Texto extends JLabel{
    public Texto() {
        super();
        setSizeMode(2);
    }

    public final void setSizeMode(int size) {
        Font font;
        font = switch (size) {
            case 1 -> new Font("Arial", Font.BOLD, 10);
            case 2 -> new Font("Arial", Font.BOLD, 15);
            case 3 -> new Font("Arial", Font.BOLD, 20);
            default -> new Font("Arial", Font.BOLD, 15);
        };
        setFont(font);
    }
    
}
