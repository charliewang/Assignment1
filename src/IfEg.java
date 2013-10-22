public class IfEg {

	public void start() {

		int assignmentTotal = (int) (Math.random() * 16);
		System.out.println("Your assignment mark is " + assignmentTotal);
		
		int labTotal = (int) (Math.random() * 11);
		System.out.println("Your lab mark is " + labTotal);
		
		int practicalTotal = assignmentTotal + labTotal;
		
		if (practicalTotal < 12.5) {
			
			System.out.println("Sorry you have failed!");
			
		} else {
			
			int testMark = (int) (Math.random() * 16);
			System.out.println("Your test mark is " + testMark);
			
			int finalMark = (int) (Math.random() * 101);
			System.out.println("Your final mark is " + finalMark);
			
			int theoryTotal = testMark + finalMark; 

			if (theoryTotal < 37.5) {
				System.out.println("You have failed the exam!");
			} else {
				System.out.println("You have passed the exam!");
			}
	
		}
		
		

	}

}
