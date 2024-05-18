package pertemuan89_2;


public class Student extends Person {
    public static final String MAHASISWABARU = "Mahasiswa Baru";
    public static final String MAHASISWATAHUNKEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    private final String status;

    public Student(String nama, String alamat, String noTelp, String email, String status) {
       super(nama, alamat, noTelp, email);
       this.status = status;
        
    }
    @Override
    public String toString(){
        return "Class Student " +super.toString().split(", ")[1] + 
                "\nStatus : " + status;
    }
    
}
