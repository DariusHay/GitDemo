package org.example;

public class Main {
    public static void main(String[] args) {

        /*String str = "Payment $100 paid";
        String str1 = "Payments $100 paid";
        System.out.println(str.charAt(8));
        System.out.println(str1.indexOf("$"));
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(8));

        String s = "madam";
        String t = "";
        for (int i=s.length()-1; i>=0; i--){
            t = t + s.charAt(i);
        };
        System.out.println(t);

        if (s==t){
            System.out.println("is palindrome");
        }
            System.out.println("not palindrome");
         */
        AustralianTraffic traffic = new AustralianTraffic();
        traffic.redStop();
        traffic.greenGo();
        traffic.walking();
        traffic.trainSymbol();

    }
}