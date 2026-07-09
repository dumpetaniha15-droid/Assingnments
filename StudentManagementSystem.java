public class StudentManagementSystem{

    static String studentName = "Niharika";
    static int studentId = 7;
    static String collegeName = "Nishitha degree college";
    static String Branch = " Bsc.computer science(MSCS) ";
    static long mobileNumber = 1234512345l;
    public static void main(String[] args){
        studentDetails();
        changeStudentName("Himawari");
        changeStudentId(8);
        changeCollegeName("ABC");
        changeBranch("MPC");
        changeMobileNumber(5432154321l);

        checkStudentName("Niharika");        //not updated
        checkStudentId(8);                     //updated
        checkCollegeName("ABC");             //updated
        checkBranch("MPC");                       //updated
        checkMobileNumber(1234512345l);     //not updated
         
        studentDetails();
        
    }


    public static void studentDetails(){
        System.out.println("studentName: " + studentName);
        System.out.println("stdentId: " + studentId);
        System.out.println("collegeName: " + collegeName);
        System.out.println("Branch: " + Branch);
        System.out.println("mobileNumber: " + mobileNumber);
    }
    
    //change methods():

    public static void changeStudentName(String newStudentName){
        studentName = newStudentName;
        System.out.println("studentName is updated to: "+ studentName);
   }    
    public static void changeStudentId(int newStudentId){
        studentId = newStudentId;
        System.out.println("student Id is updated to: " + studentId);
    }
    public static void changeCollegeName(String newCollegeName){
        collegeName = newCollegeName;
        System.out.println("college name is updated to: " + collegeName);
    }
    public static void changeBranch(String newBranch){
        Branch = newBranch;
        System.out.println("Branch is updated to: " + Branch);
    }
    public static void changeMobileNumber(long newMobileNumber){
       mobileNumber = newMobileNumber;
       System.out.println("mobile number changed to: " + mobileNumber);
    }

    //check methods():
   
    public static void checkStudentName(String enteredStudentName){
        if(enteredStudentName==studentName){
            System.out.println("student name updated");
        }else{
            System.out.println("student name not updated");
        }  
    }
    public static void checkStudentId(int enteredStudentId){
        if(enteredStudentId==studentId){
            System.out.println("student Id is updated");
        }else{
            System.out.println("student Id not updated");
        }
    }
    public static void checkCollegeName(String enteredCollegeName){
        if(enteredCollegeName==collegeName){
            System.out.println("college name is updated");
        }else{
            System.out.println("college name is not updated");
        }
    }
    public static void checkBranch(String enteredBranch){
        if(enteredBranch==Branch){
            System.out.println("Branch name is updated");
        }else{
            System.out.println("Branch name not updated");
        }
    }
    public static void checkMobileNumber(long enteredMobileNumber){
        if(enteredMobileNumber==mobileNumber){
            System.out.println("mobile number is updated");
        }else{
            System.out.println("mobile number is not updated");
        }    
    }

}
    
    

    

    


    
    
    