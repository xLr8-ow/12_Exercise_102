
import java.util.Comparator;


public class FileComparer implements Comparator<Datei> {

    @Override
    public int compare(Datei t1, Datei t2) {
        if(t1.isDirectory() && !t2.isDirectory())
        {
            return -1;
        }
        
        else if (!t1.isDirectory() && t2.isDirectory())
        {
            return 1;
        }
        
        else{
            return t1.getName().compareTo(t2.getName());
        }
    }
    
}
