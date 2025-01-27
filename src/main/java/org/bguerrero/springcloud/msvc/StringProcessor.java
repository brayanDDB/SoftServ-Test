package org.bguerrero.springcloud.msvc;

public class StringProcessor {

    public String process(String string) {
        StringBuilder res = new StringBuilder();

        for(int i=0; i<string.length(); i++){
            String c = String.valueOf(string.charAt(i));

            if(!res.toString().contains(c)){
                res.append(c);
            }
        }

        return res.toString();
    }
}
