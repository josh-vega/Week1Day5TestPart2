package com.example.josh.week1day5testpart2;

public class Problem1 {
    public static void main(String[] args) {
        //initialization phase
        char[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] rev = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        String encoded = "";

        //Get user input
        String input = "daicmekls";
        System.out.println("The string being input is: " + input);
        input = input.toLowerCase();

        //Encode
        for(int no=0; no<input.length(); no++) {
            for(int num=0; num<list.length; num++) {
                if(input.charAt(no)==list[num]) {
                    encoded = encoded + rev[num];
                }
            }
        }

        //Display
        System.out.println(encoded);
    }
}
