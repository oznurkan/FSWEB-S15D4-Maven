package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        checkForPalindrome("I did, did I?");
        checkForPalindrome("Racecar ");
        checkForPalindrome("hello ");
        checkForPalindrome("Was it a car or a cat I saw ?");

        WorkintechList work = new WorkintechList();
        work.add(4);
        work.add(9);
        work.add(44);
        //work.add("dolap");
        //work.add("elbise");
        //work.add("ayna");
        work.add(5);
        //work.add("ayna");
        work.add(5);

        System.out.println(work);

        work.sort();
        System.out.println(work);

        convertDecimalToBinary(8);
        convertDecimalToBinary(50);
        convertDecimalToBinary(16);

    }

    public static boolean checkForPalindrome(String text){

        text = text.toLowerCase(Locale.ENGLISH);

        text = text.replaceAll("[^a-z]", "");
        int z = 0;

        for(int i = 0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                //System.out.println(text + " false");
                return false;
            }
        }
        //System.out.println(text + " true");
        return true;
    }

    public static String convertDecimalToBinary(int sayi){
        //System.out.println("Gelen Sayı = " + sayi );

        LinkedList<Integer> binaryList = new LinkedList<>();

        while (sayi > 0){
            int remainder = sayi % 2;
            binaryList.addFirst(remainder);
            sayi = sayi / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        for( int i : binaryList){
            binaryString.append(i);
        }

        //System.out.println("Dönüşen sayı = " + binaryString.toString());
        return binaryString.toString();

    }

}