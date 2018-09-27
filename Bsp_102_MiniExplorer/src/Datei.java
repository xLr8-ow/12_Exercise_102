
import java.io.File;

public class Datei extends File {

    private String name;

    public Datei(String string, String name) {
        super(string);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
