public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlahObjek = 0;

    public Student(){
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }

    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        jumlahObjek++;
    }

    public Student(String n, String a, int ag, double math, double english, double science){
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jumlahObjek++;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(int math){
        mathGrade = math;
    }

    public void setEnglish(int english){
        englishGrade = english;
    }

    public void setScience(int science){
        scienceGrade = science;
    }
    
    private double getAverage(){
        average = (mathGrade + scienceGrade + englishGrade)/3;
        return average;
    }
    
    public boolean statusAkhir(){
        if(getAverage() > 60)
            return true;
        else 
            return false;
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beralamat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.println(statusAkhir() == true ? "siswa lulus" : "siswa tidak lulus");
    }

    public void jumlahObjek() {
        System.out.println("Jumlah siswa yang dibuat : " + jumlahObjek);
    }
 }