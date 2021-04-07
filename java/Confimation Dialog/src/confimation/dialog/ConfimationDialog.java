
package confimation.dialog;

import javax.swing.JOptionPane;

public class ConfimationDialog {

    public static void main(String[] args) {
       int result = JOptionPane.showConfirmDialog(null, "Program sonlansın mı?","Dikkat",JOptionPane.YES_NO_OPTION);
       if(result == JOptionPane.YES_OPTION)
            System.out.println("Yes seçildi");
       else if(result == JOptionPane.NO_OPTION)
            System.out.println("No seçildi");
       else 
            System.out.println("Kapatıldı");
    }
    
}
