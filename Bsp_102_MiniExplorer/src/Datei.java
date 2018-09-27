
import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datei extends File {

    private String name;

    public Datei(String string, String name) {
        super(string);
        this.name = name;
    }

    @Override
    public String toString() {
        if(isFile()){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm").withZone(ZoneId.systemDefault());

            StringBuilder sb = new StringBuilder();
            
            if(canRead())
            {
                sb.append("R");
            }
            
            if(canWrite())
            {
                sb.append("W");
            }
            
            if(canExecute())
            {
                sb.append("X");
            }
            
            if(isHidden())
            {
                sb.append("H");
            }
            
            return String.format("%s, %s, %d KB %s", name, dtf.format(Instant.ofEpochMilli(lastModified())), length()/1024, sb.toString());
        }
        
        return name;
    }

}
