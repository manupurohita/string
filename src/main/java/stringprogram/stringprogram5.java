package stringprogram;
//
public class stringprogram5 {
    //write a java program to remove dublicate array from given string
    public static void main(String args[]) {
        String s1 = "sarojsharma";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int idx = s1.indexOf(ch, i + 1);
            if (idx == -1) {
                sb.append(ch);
            }

        }
        System.out.println("dublicate characters in a given string:"+sb);


    }
}
