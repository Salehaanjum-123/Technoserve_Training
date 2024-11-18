package BasicsOfJAva;

public class SwitchDemo {

	public static void main(String[] args) {
		String day="thursday";
		switch(day){
		
		case "Monday":
			System.out.println("attend meetings");
			break;

		case "tuesday":
			System.out.println("work on project tasks");
			break;

		case "wednesday":
			System.out.println("progress report submission");
			break;

		case "thursday":
			System.out.println("client call and rivew");
			break;

		case "friday":
			System.out.println("wrap up weekly task");
			break;

		case "saturday":
		case "sunday":

			System.out.println("enjoy weekend");
			break;
			
			default:
				System.out.println("invalid input");
		}
	}
		
}
