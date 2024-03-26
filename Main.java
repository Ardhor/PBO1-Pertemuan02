import koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.Matakuliah;

public class Main{
    public static void main(String [] args){
        System.out.println("Ini Main Progeram");
        Database.hubungkan();
        Dosen.TampilanInfo();
        Mahasiswa.TampilanInfo();
        Matakuliah.TampilanInfo();
    }
}