import java.io.IOException;
import  java.util.Scanner;
public class MainMethod {

	public static void MnuOperation2() {
		
		Scanner scnr = new Scanner(System.in);
	 boolean find = true;
	 String srt = "========PLEASE SELECT ONE OF THESE OPTION BELOW. =========\n"
			          + "                                     1) ADD FILE TO THE DIRECTORY                             \n"
			          + "                                     2) DELETE FILE IN THE DIRECTORY                        \n"
	                  + "                                     3) SEARCH FILE IN THE THE DIRECTORY               \n";
	 
	 do {
		 try {
			 System.out.println(srt);
				int sd = scnr.nextInt();
						
				switch(sd) {
				
				case 1:
				scnr = new Scanner(System.in);
				System.out.println(" Enter FILE  NAME TO  ADD");
				String str = scnr.next();
				OperationOnFile .CreateFile(str);
				break;
				
				case 2:
					scnr = new Scanner(System.in);
				System.out.println("  ENTER  FILE NAME TO DELETE : ");
				str = scnr.next();
				OperationOnFile.DeleteFile(str);
		       break;
		       
				case 3:
					scnr = new Scanner(System.in);
					System.out.println("ENTER THE  NAME OF THE FILE YOU ARE SEARCHING!!");
					str = scnr.next();
					OperationOnFile.SearchForFile(str);
					break;
					
				case 4:
					scnr = new Scanner(System.in);
					System.out.println("PRINT FILES IN ASCENDING  ORDER");
					OperationOnFile.RetriveInAacendingOrder();
					break;
				case 5:
					scnr = new Scanner(System.in);
					System.out.println("PROGRAM EXISTED SUCCESSFULLY !");
					find = false;
					scnr.close();
					System.exit(0);
			            break;
			            
			     default:
			    	 System.out.println("Invalid Input. Choice a Valid number (Between 1 and 5)");
				}
			 
		 }catch(Exception ex) {
			 System.out.println(ex.getClass().getName());
			 System.out.println(srt);
				int sd = scnr.nextInt();
		 }
	    } while (find ==true);
 	}

}