
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class FileListRenderer implements ListCellRenderer<Datei> {

    

    @Override
    public Component getListCellRendererComponent(JList<? extends Datei> jlist, Datei e, int i, boolean bln, boolean bln1) {
        JLabel label = new JLabel(e.toString());
        label.setOpaque(true);
        if(e.isDirectory())
        {
            label.setForeground(Color.red);
            label.setFont(new Font("Courier New", Font.ITALIC + Font.BOLD, 15));
            label.setBackground(Color.gray);
        }
        
        else
        {
            label.setForeground(Color.blue);
            label.setFont(new Font("Courier New", Font.PLAIN, 15));
        }
        
        if(bln){
            label.setBackground(Color.white);
        }
        
        return label;
    }
    
}
