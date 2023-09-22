import java.util.Scanner;

class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.println("===BIODATA NILAI MAHASISWA===");

        // Input Nama
        System.out.print("Nama: ");
        String nama = input.nextLine();
    	
        // Input NIM
        System.out.print("NIM: ");
        int nim = input.nextInt();
    	
        // Input Nilai Tugas
        System.out.print("Nilai Tugas: ");
        int tugas = input.nextInt();

        // Input Nilai UTS
        System.out.print("Nilai UTS: ");
        int UTS = input.nextInt();

        // Input Nilai UAS
        System.out.print("Nilai UAS: ");
        int UAS = input.nextInt();

        // output Nilai AKHIR
        Float Nilai_Akhir= (tugas*30f/100f)+(UTS*30f/100f)+(UAS*40/100f);
        System.out.print("Nilai Akhir:" + Nilai_Akhir);
    }
}
