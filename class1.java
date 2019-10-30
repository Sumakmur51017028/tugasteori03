import java.util.Scanner;
class class1
{
	String nama,jurusan,nim;
	Scanner i= new Scanner(System.in);
	void setnama(String namasiswa)
	{
		nama=namasiswa;
	}
	void setjurusan(String jurusansiswa)
	{
		jurusan=jurusansiswa;
	}
	void setnim(String nimsiswa)
	{
		nim=nimsiswa;
	}
	void cetak()
	{
		System.out.print("nama: ");
		nama=i.nextLine();
		System.out.print("jurusan: ");
		jurusan=i.nextLine();
		System.out.print("nim: ");
		nim=i.nextLine();
		System.out.println();
		
		
		System.out.println("nama saya adalah "+nama+" jurusan saya adalah "+jurusan+" dan nim saya "+nim);
		
	}
	
}