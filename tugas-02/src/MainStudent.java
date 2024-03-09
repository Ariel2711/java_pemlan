import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
        
        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage(); 

        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna.setAddress("Batu");
        anna.setAge(18);
        anna.displayMessage();

        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        System.out.println("===================");
        Student gibran = new Student("Gibran", "Solo", 35, 30, 25, 20);
        gibran.displayMessage();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah siswa yang ingin diinput : ");
        int n = scanner.nextInt();
        Student[] listStudent = new Student[n];

        for (int i = 0; i < listStudent.length; i++) {
            scanner.nextLine();
            System.out.print("Nama siswa : ");
            String nama = scanner.nextLine();
            System.out.print("Alamat siswa : ");
            String alamat = scanner.nextLine();
            System.out.print("Umur siswa : ");
            int umur = scanner.nextInt();
            System.out.print("Nilai Matematika : ");
            int mat = scanner.nextInt();
            System.out.print("Nilai Bahasa Iggris : ");
            int english = scanner.nextInt();
            System.out.print("Nilai Sains : ");
            int sains = scanner.nextInt();
            Student stud = new Student(nama, alamat, umur, mat, english, sains);
            listStudent[i] = stud;
        }

        for (int i = 0; i < listStudent.length; i++)
            listStudent[i].displayMessage();

        scanner.close();

        gibran.jumlahObjek();
    }
}