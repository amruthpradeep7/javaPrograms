package org.example.programs;

public class RemoveStarLeftChar {

    public static void main(String[] args) {


        String input = "lee**tco*de";
        String result = "";

        for(int i=0;i<input.length();i++){
            if(input.charAt(i) != '*'){
                result = result + input.charAt(i);
            } else {
                result = result.substring(0, result.length() - 1);

            }
        }
        System.out.println(result);

    }
}
