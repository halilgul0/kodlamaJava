package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = '1';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malasef : Kaldınız");
			break;
		default:
			System.out.println("Sorun Oluştu");
			break;
		}

	}

}
