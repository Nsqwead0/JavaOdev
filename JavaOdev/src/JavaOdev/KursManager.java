package JavaOdev;

public class KursManager {
	
	
	public void addTheAccount(Kurs kurs1) {
		System.out.println("Kursunuz Hesab�n�za Eklenmi�tir" + kurs1.isim);
		
		
	}
	
	public void getTeacherWithCourse(Kurs kurs1) {
		System.out.println(kurs1.isim + "Kursun �smi" + kurs1.E�itmen + "Kursun E�itmeni");
	}
	


}
