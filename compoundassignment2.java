public class compoundassignment2 {
    public static void main(String[] args){
        int balence = 100;
        System.out.println(balence);          //100
        System.err.println(balence += 50);    //150
        System.out.println(balence -= 50);    //100
        System.out.println(balence *= 50);    //5000
        System.out.println(balence /= 50);    //100
        System.out.println(balence %= 50);    //0
    }
}

//Note :[ balence = balence + 50 0r balence += 50 ]
//  both do exatly the same thing. but by using += program looks shorter   