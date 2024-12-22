

public class FourDigitNumber {
     public static void main(String[] args) {
        int num = 0;
        while (num < 10000) {
            num++;
            if(num > 1000){
            if (num % 10 == 0 && num % 13 == 0) {
                System.out.println(num);
            }
            }
     }
}
}