package tr.org.linux.kamp.week;



public class DaysTest {

	static Days day;
	
	public DaysTest(Days day) {
		this.day=day;
	}
	
	public static void tellAboutDays() {
		switch(day) {
		
		case PAZARTESI:
			System.out.println("Pazartesi iğrençtir");
			break;
		case CUMA:
			System.out.println("Cuma çok güzel");
			break;
		case CUMARTESI:
			System.out.println("Cumartesi tatil");
			break;
		case PAZAR:
			System.out.println("Pazar Huzur");
			break;
		default:
			System.out.println("Diğer günler hep işşşş");
		}
	}
	public static void main(String[] args) {
		DaysTest firstDay=new DaysTest(Days.PAZARTESI);
		firstDay.tellAboutDays();
		
	}
}
