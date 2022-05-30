# FSJDPro
This Application calls LOCKME.COM is created to :
*- RETRIEVE  FILE IN  ASCENDING ORDER: at this level the application will send the list of files in the directory in ascending order
*- BUSINESS-LEVEL OPERATIONS; in the business it allows you to do:
Sprint-1

  I have to figure out how to come up with structure.I use arrayList (use List because i don't need to add the data at specific index)  and List collect the file and collection to sort file in ascending order. So to write the application i have to create a classe that i called OperationOnFile.In this class, i create methods that will allow me to add, delete search and retrieve file in the main folder.First of all i need to write a static method that will create a folder containig the files.
     - Method CreateMainFolder: create a folder to maintain files
     - Method Createfile: take string as parameter and create a file.
     - Method DeleteFile: take a string as pararmeter and delete the file.
     - Method RetrieveinAscendingOrder: return a list of files in ascending order.
     - Method SearchForFile: Search a file in folder return true or false.
After creating these methods, i test them and i create a file and delete a file from the folder.
         
-The second is class MnOperation: In this class there is a method call MnuOperation2. 
we are going to use switch statement that can more clearly represent five-branch behavior involving a int variable being compared to constant values. The program executes the first case whose constant expression matches the value of the switch expression, executes that case's statements, and then jumps to the end. If no case matches, then the default case statements are executed which state an invalid number. 
the program will prompte for a value between 1 and 3:
  - If you type 1, the first case will invoke the RetrieveinAscending() method indide the OperationOnFile (OperationOnFile()) and return the list of file in ascending order 
  - If youtype 2, the second case will invoke the static method in MainMethod.MnOperation2() that will prompt a message that will ask which of these three options below you want to execut:
  
  - Sprint-2 
    - Delete file in a directory: this static method delete file from the mai folder by calling the deleteFile method from OperationOnFile to delete the file.
    - Add file in a directory:Add file to the folder(i use PWD/ + ess : Users/essehalagahkomlavi/Desktop/ess) 
    - Search file in a directory: Search for a specific file in the folder (Users/essehalagahkomlavi/Desktop/ess).
    - iIhave to write the  method that retrieve files in ascending order
    
*- CLOSE THE APPLICATION: Close the application if the option 3 is chosen. 


 Your site is published at https://eliab11.github.io/FSJDPro/
