package com.practice.others;

public class defangIPaddr {
    public static String defangIPaddr(String address) {
        String result = new String();
        String[] address_array = address.split("\\.");
        for(int i = 0; i < address_array.length; i++){
            result += address_array[i];
            if(i!= address_array.length -1) {
                result += "[.]";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        defangIPaddr("1.1.1.1");
    }
}
