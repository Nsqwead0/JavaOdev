package JavaOdev;

public class Main {
	
	
	public static void main(String[] args) {



Kurs kurs1 = new Kurs(1,1,"Java Kursu","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","Engin Demirog",0);
Kurs kurs2 = new Kurs(1,1,"C# Kursu","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","Engin Demirog",0);{
	
	Kurs [] kurslar = {kurs1 , kurs2 };
	for (Kurs kurs: kurslar) {
	System.out.println(kurs.isim);
}


}

KursManager KursManager = new KursManager();
KursManager.addTheAccount(kurs1);
KursManager.addTheAccount(kurs2);

KursManager.getTeacherWithCourse(kurs1);
KursManager.getTeacherWithCourse(kurs2);


	
}
}