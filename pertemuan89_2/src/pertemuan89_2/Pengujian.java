
package pertemuan89_2;


public class Pengujian {
    public static void main(String[] args){
        MyDate tanggalMulaiKerja = new MyDate(2020, 5, 15);
        Person person = new Person("rivan", "Bandung", 
                "012831644", "rivan@yahuu.com");
        Student student = new Student("Drake", "Baleendah", 
                "023862359", "iniadalahdrake@gugel.com", Student.JUNIOR);
        Employee employee = new Employee("Rafi", "depok", 
                "012834164", "rafiiiiiii08@gugel.com", "FPMIPA JICA-A", 1000, tanggalMulaiKerja);
        Faculty faculty = new Faculty("yuyu wahyu", "sumedang", 
                "019234174", "yuyuwahyuex@yahuu.com", "FPIPS Lt.3", 2000, tanggalMulaiKerja, 
                "07.00-15.00", "Kaprodi");
        Staff staff = new Staff("teh nyai", "Bandung", "01237481", 
                "iniemailteteh@yahuu.com", "FMIPA C", 500, tanggalMulaiKerja, "OB");
        
        
        
        System.out.println(person);
        System.out.println("======================================");
        System.out.println(student);
        System.out.println("======================================");
        System.out.println(employee);
        System.out.println("======================================");
        System.out.println(faculty);
        System.out.println("======================================");
        System.out.println(staff);
    }
}
