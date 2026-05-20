package practiceProblem1.day6;

public class UtilPrograms {
    public static void main(String[] args) {
        System.out.println(monthlyPayment(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Float.parseFloat(args[2])));

        returnDate(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
    public static float monthlyPayment(int p,int y,float R) {
        int n = y*12;
        float r = R/(12*100);
        float payment = p*r/(1-(float)Math.pow(1+r, n*-1));
        return payment;
    }
    public static void returnDate(int m,int d,int y){
        int y0 = y-(14-m)/12;
        int x = y0+y0/4-y0/100+y0/400;
        int m0 = m+12*((14-m)/12)-2;
        int d0 = (d+x+(31 * m0/12))%7;
        System.out.println(d0);
        if(d0 == 0){
            System.out.println("sunday");
        }
        else if(d0 == 1){
            System.out.println("monday");
        }
        else if(d0 == 2){
            System.out.println("tuesday");
        }
        else if(d0 == 3){
            System.out.println("wednesday");
        }
        else if(d0 == 4){
            System.out.println("thursday");
        }
        else if(d0 == 5){
            System.out.println("friday");
        }
        else{
            System.out.println("sunday");
        }
    }
}
