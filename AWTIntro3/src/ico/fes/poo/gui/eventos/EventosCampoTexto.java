/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author vik
 */
public class EventosCampoTexto implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Tecla:" + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    
    
}
