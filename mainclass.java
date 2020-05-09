package hackathon;

import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class mainclass extends JFrame {
    
    public mainclass(){
        
        super("ARENA 3D");
        setLayout(new BorderLayout());
        setResizable(false);
        setSize(1000,588);
        setLocationRelativeTo(null);
        setVisible(true);
        try {
            URL filename = new URL("file:free_arena.obj");
        } catch (MalformedURLException ex) {
            Logger.getLogger(mainclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void main(String args[]){
        
        new mainclass();
        
        
    }
           
    
}
