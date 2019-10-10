package latihan.lingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lingkaran {
	static double jari(double diameter) 
	{
		return diameter / 2;
	}
	static double luas(double diameter) 
	{
		double r = jari(diameter);
		return Math.PI * r *r;
	}
	static double keliling(double diameter) 
	{
		return Math.PI * diameter;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double diameter = 0;
		boolean isAngka;
		DecimalFormat ft = new DecimalFormat("#");
		System.out.println("======Perhitungan Lingkaran======");
		do {
			System.out.print("Masukan nilai diameter : ");

			if(reader.hasNextDouble()) {
				diameter = reader.nextDouble();
				isAngka = true;
			}else {
				System.out.println("Nilai Diameter Tidak Sesuai");
				isAngka = false;
				reader.next();
			}
			
			
		}while(!isAngka);
		
		System.out.println("======Hasil Perhitungan Lingkaran======");
		System.out.println("Jari-jari Lingkaran =  "+ ft.format(jari(diameter)) + " cm");
		
		ft = new DecimalFormat("#,##");
		System.out.println("Luas Lingkaran ="+ ft.format(luas(diameter)) + " cm");
		System.out.println("Keliling Lingkaran = "+ ft.format(keliling(diameter)) + " cm");
		reader.close();
	}
}





