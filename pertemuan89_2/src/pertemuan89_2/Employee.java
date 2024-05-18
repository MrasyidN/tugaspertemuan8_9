
package pertemuan89_2;


public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalMulaiKerja;

    public Employee(String nama, String alamat, String noTelp, String email, String kantor, double gaji, MyDate tanggalMulaiKerja) {
        super(nama, alamat, noTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalMulaiKerja = tanggalMulaiKerja; 
    }
    
    @Override
    public String toString(){
        return "Class Employee, "+ super.toString().split(", ")[1]+
                "\nkantor : " +kantor+
                "\ngaji : Rp "+gaji+
                "\ntanggalMulaiKerja : "+tanggalMulaiKerja;
    }
}
