import java.io.Serializable;

public class Data implements Serializable {
    int nomor;
    String nama;

    public Data(int nomor, String nama){
        this.nomor = nomor;
        this.nama = nama;
    }
}
