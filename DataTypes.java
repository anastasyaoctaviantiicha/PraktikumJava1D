import javax.swing.JOptionPane;

public class DataTypes{
 public static void main(String[] args){

 String namaDepan = "Anastasya";
 String namaBelakang = "Octavianti";
 int usia = 20;
 int targetTahunKuliah = 4;
 double ipk = 3.54;
 char nilaiAbjad ='A';
 boolean lulus = true;
 
 System.out.println("Nama depan : " + namaDepan);
 System.out.println("Nama belakang : " + namaBelakang);
 System.out.println("Usia : " + usia);
 System.out.println("Target Kuliah : " + targetTahunKuliah + "tahun");
 System.out.println("IPK : " + ipk);
 System.out.println("Nilai PBO : " + nilaiAbjad);
 System.err.println("Lulus : " + lulus);

 JOptionPane.showMessageDialog(null,"Haii..." + namaDepan +" " + namaBelakang);
 }
}