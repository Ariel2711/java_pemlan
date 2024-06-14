import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            File myFile = new File("C://myFile.dat");
            FileOutputStream myOutputStream = new FileOutputStream(myFile);
            ObjectOutputStream myWriter = new ObjectOutputStream(myOutputStream);
            FileInputStream myInputStream = new FileInputStream(myFile);
            ObjectInputStream myReader = new ObjectInputStream(myInputStream);
            
            Data myData1 = new Data(1, "Putra");
            Data myData2 = new Data(2, "Aril");
        } catch (FileNotFoundException e) {
            
        }
    }
}
