
import java.io.File;
import java.util.LinkedList;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel<Datei> {

    private LinkedList<Datei> dateien = new LinkedList<>();

    @Override
    public int getSize() {
        return dateien.size();
    }

    @Override
    public Datei getElementAt(int i) {
        return dateien.get(i);
    }

    public void displayFolder(File f) {
        dateien.clear();
        File[] filelist = f.listFiles();
       
        dateien.add(new Datei(f.getAbsoluteFile().getParent(), ".."));
        if(filelist != null){
            for (File file : filelist) {
                dateien.add(new Datei(file.getAbsolutePath(), file.getName()));
            }
            fireIntervalAdded(this, 0, dateien.size()-1);
        }
    }

}
