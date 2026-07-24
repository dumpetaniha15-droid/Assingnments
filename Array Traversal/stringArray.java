public class stringArray {

    public static void main(String[] args){
        String names[] = {"motu","patlu","jetka"};

        //using for loop:
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }

        //using for-each loop:
        for(String name:names){
            System.out.println(name);
        }        
        }
    }
