
import java.io.File;
import java.util.LinkedList;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel<Datei> {

    private LinkedList<Datei> dateien = new LinkedList<>();

    private FileComparer fc = new FileComparer();

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

        if (filelist != null) {
            for (File file : filelist) {
                dateien.add(new Datei(file.getAbsolutePath(), file.getName()));
            }
            dateien.sort(fc);
            dateien.add(0, new Datei(f.getAbsoluteFile().getParent(), ".."));
            fireIntervalAdded(this, 0, dateien.size() - 1);
        }
    }

}
