import java.util.Scanner;

public class Lulus{
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		boolean SMK, Sastra, TKJ;
		double Math, Indo, Eng, IPA, total;
		
		System.out.println("Masukkan nilai Ujian Matematika: ");
		Math = input.nextDouble();
		total = Math;
		
		System.out.println("Masukkan nilai Ujian IPA: ");
		IPA = input.nextDouble();
		total = IPA + total;
		
		System.out.println("Masukkan nilai Ujian Bahasa Indonesia: ");
		Indo = input.nextDouble();
		total = total + Indo;
		
		System.out.println("Masukkan nilai Ujian Bahasa Inggris: ");
		Eng = input.nextDouble();
		total = total+Eng;
		
		SMK = (total/4)>=73;
		Sastra = ((Indo+Eng)/2)>=75;
		TKJ = ((Math+IPA)/2)>80;
		
		System.out.println("Hasil dari simulasi untuk persyaratan penerimaan calon siswa di SMK Padepokan 79 adalah sebagai berikut,");
		System.out.println("===============================================");
		System.out.println("Apakah anda memenuhi syarat untuk masuk ke SMK Padepokan 79: "+SMK);
		System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan Sastra: "+Sastra);
		System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan TKJ: "+TKJ);
	}
}