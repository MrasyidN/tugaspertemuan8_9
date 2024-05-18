
package pertemuan89_2;


public class Staff extends Employee{
    private String gelar;

    public Staff(String nama, String alamat, String noTelp, String email, String kantor, double gaji, MyDate tanggalMulaiKerja, String gelar) {
        super(nama, alamat, noTelp, email, kantor, gaji, tanggalMulaiKerja);
        this.gelar = gelar;
    }

    @Override
    public String toString(){
       return "Class Staff, "+super.toString().split(", ")[1] + 
               "\nTitle : " + gelar;
    }
    
}
