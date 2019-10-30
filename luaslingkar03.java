import java.util.Scanner;
public class luaslingkar03
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		class03 in= new class03();
		
		System.out.println("=====Menghitung Luas Lingkaran=====");
		System.out.print("inputkan jari-jari   : ");
		in.jarijari=input.nextInt();
		System.out.println();
		
		in.luaslingkaran=3.14*in.jarijari*in.jarijari;
		System.out.println("luas Lingkaran adalah: "+in.luaslingkaran);
		System.out.println();
		
		System.out.println("=====Menghitung volume kubus=====");
		System.out.print("inputkan panjang: ");
		in.panjang=input.nextInt();
		System.out.print("inputkan lebar  : ");
		in.lebar=input.nextInt();
		System.out.print("inputkan tinggi : ");
		in.tinggi=input.nextInt();
		in.volume=(in.panjang*in.lebar*in.tinggi);
		System.out.println();
		System.out.print("volume kubus adalah: "+in.volume);
		
	}
	
}