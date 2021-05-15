package JavaOdev;

public class KursManager {
	
	
	public void addTheAccount(Kurs kurs1) {
		System.out.println("Kursunuz Hesabýnýza Eklenmiþtir" + kurs1.isim);
		
		
	}
	
	public void getTeacherWithCourse(Kurs kurs1) {
		System.out.println(kurs1.isim + "Kursun Ýsmi" + kurs1.Eðitmen + "Kursun Eðitmeni");
	}
	


}
