import java.util.Scanner;
public class MnOperation1 {
	
	public static void MnOP() {
	Scanner scnr = new Scanner(System.in);
	boolean found = true;
	 String srt = "========PLEASE SELECT ONE OF THESE OPTION BELOW. =========\n"
	          + "                                     1) RETRIEVE  FILE IN  ASCENDING ORDER               \n"
	          + "                                     2) BUSINESS-LEVEL OPERATIONS                           \n"
             + "                                      3) CLOSE THE APPLICATION                                    \n";
	     
	 do {
		 try {
			 System.out.println(srt);
				int sd = scnr.nextInt();
				switch(sd) {
				case 1: 
					scnr = new Scanner(System.in);
					System.out.println("Print File in Ascending Order");
					OperationOnFile.RetriveInAacendingOrder();
					break;
					
				case 2:
					MainMethod.MnuOperation2();		
					System.out.println(srt);
					break;
					
				case 3:
					System.out.println("APPPLICATION CLOSED!!!");
					scnr.close();
					System.exit(0);
					break;
				}
		 }catch(Exception ex) {
			 System.out.println(ex.getClass().getName());
			 System.out.println(srt);
				int sd = scnr.nextInt();
		 }
	 }while (found == true);

}
}