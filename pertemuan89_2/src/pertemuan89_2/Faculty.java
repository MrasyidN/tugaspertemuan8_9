
package pertemuan89_2;


public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String noTelp, String email, String kantor, double gaji, MyDate tanggalMulaiKerja, String jamKerja, String pangkat) {
        super(nama, alamat, noTelp, email, kantor, gaji, tanggalMulaiKerja);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }


    @Override
    public String toString(){
        return "Class Faculty," +super.toString().split(", ")[1] + 
                "\nJam kerja : "+ jamKerja+
                "\nRank : " + pangkat ;
                
    }
}
