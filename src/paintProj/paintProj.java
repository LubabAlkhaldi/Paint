/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintProj;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.text.StyleConstants;

/**
 *
 * @author User
 */
public class paintProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             paint ic= new paint();
             Image icon= Toolkit.getDefaultToolkit().getImage("C:\\Uni\\Java\\GUI\\finalProj\\src\\finalproj\\icones\\paintIcon.png");
             ic.setIconImage(icon);
        //     ic.setSize(100);
             ic.setVisible(true);
   
    }
    
}
