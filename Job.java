import java.util.Scanner;

public class Job{
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		boolean Menarik, koor, adm;
		int umur;
		double pengalaman, look;
		String nama, pend, jk;
		
		System.out.println("Tolong masukkan data yang sesuai dengan Anda. Hanya isikan jenis kelamin dengan 'Pria' atau 'Wanita'.");
		
		System.out.print("Nama: ");
		nama = input.nextLine();
		
		System.out.print("Umur: ");
		umur = input.nextInt();
		
		System.out.print("Jenis Kelamin: ");
		jk = input.next();
		
		System.out.print("Pendidikan Terakhir: ");
		pend = input.next();
		
		System.out.print("Pengalaman (Tahun): ");
		pengalaman = input.nextDouble();
		
		System.out.print("Penampilan: ");
		look = input.nextDouble();
		
		Menarik = look>8.5;
		koor = ((jk.equalsIgnoreCase("pria"))&&(umur>=21&&umur<=30)&&((pend.equalsIgnoreCase("smk"))||(pend.equalsIgnoreCase("d3")))&&(pengalaman>=2)||(jk.equalsIgnoreCase("pria")&&(umur>30)&&(pend.equalsIgnoreCase("s1"))&&(pengalaman>=5)));
		adm = ((jk.equalsIgnoreCase("wanita"))&&(umur>=20&&umur<=25)&&(pend.equalsIgnoreCase("d3"))&&(pengalaman>=1||Menarik))||((jk.equalsIgnoreCase("wanita")&&(umur>25)&&(pend.equalsIgnoreCase("s1"))&&(pengalaman>=5)&&(Menarik)));
		
		
		System.out.println("=========================");
		System.out.println(nama+", terima kasih sudah mengikuti lowongan kerja di PT. Secret Semut.");
		System.out.println();
		System.out.println("Berikut adalah Hasil Anda: ");
		System.out.println("Hasil kelulusan untuk posisi Koordinator: "+koor);
		System.out.println("Hasil kelulusan untuk posisi Admin: "+adm); 
	}
}