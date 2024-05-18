package pertemuan89_2;

public class Person {
    private String nama;
    private String alamat;
    private String noTelp;
    private String email;
    
    public Person(String nama, String alamat, String noTelp, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }
    
    @Override 
    public String toString(){
        return "class person, \nnama : "+ nama +
                "\nalamat : " + alamat +
                "\nnoTelp : " + noTelp +
                "\nemail : " + email;
    }
        
}
