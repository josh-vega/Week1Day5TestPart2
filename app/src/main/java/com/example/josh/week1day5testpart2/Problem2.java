package com.example.josh.week1day5testpart2;

public class Problem2 {
    public static void main(String[] args) {
        //instantiate variables and lists
        char[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] count = new int[26];
        for(int no=0;no<count.length;no++) {
            count[no] = 0;
        }

        //get user input
        System.out.print("Enter a string: ");
        String input = "antidisestablishmentarianism";
        System.out.println(input);
        input = input.toLowerCase();

        //Calculate input
        for(int num=0; num<input.length();num++) {
            for(int num2=0; num2<list.length;num2++) {
                if(input.charAt(num)==list[num2])
                    count[num2]++;
            }
        }

        //Display results
        for(int no=0; no<count.length; no++) {
            System.out.println(list[no] + ": " + count[no]);
        }
    }
}
