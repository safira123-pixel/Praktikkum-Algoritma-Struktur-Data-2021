
public class javaLaundry {
    public static void main(String[] args) {
        int berat_Pakaian;
        int Harga_Pencucian = 4500; // Berat 1 kg pakaian
        double Diskon = 0.05; //Setiap lebih dari 10 kg pakaian
        System.out.println("-----Pendapatan Smile Laundry-----");
        //Berat pakaian dalam bentuk Kg
        int Customer_Ani = 4;
        int Customer_Budi = 15;
        int Customer_Bina = 4;
        int Customer_Cita = 11;
        System.out.println("Pelanggan Hari ini: ");
        System.out.println("1. Nama : Ani");
        System.out.println("   Berat Pakaian: 4 kg");
        System.out.println("2. Nama : Budi");
        System.out.println("   Berat Pakaian: 15 kg");
        System.out.println("3. Nama : Bina");
        System.out.println("   Berat Pakaian: 4 kg");
        System.out.println("4. Nama : Cita");
        System.out.println("   Berat Pakaian : 11 kg");
        float Total_pendapatan = (float)((Customer_Ani * Harga_Pencucian) + (Customer_Budi * Harga_Pencucian * Diskon) + (Customer_Bina * Harga_Pencucian) + (Customer_Cita * Harga_Pencucian * Diskon));
        System.out.println("Total pendapatan: Rp. " +Total_pendapatan); 
    }
    
}
