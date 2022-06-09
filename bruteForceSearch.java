
 import java.nio.file.*;

public class bruteForceSearch {
 
    public static int findSubString(String input, String pattern) {
        int output = 0;
        for (int i = 0; i <= input.length() - pattern.length(); i++) {
            boolean ok = true;
            for (int k = 0; k < pattern.length(); k++) {
                if(input.charAt(i + k) != pattern.charAt(k)) {
                    ok = false;
                    break;
                }
            }
            if(ok) output++;
        }
        System.out.println(output);
        return output;
    }
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void main(String args[]) throws Exception {
        
        String data = readFileAsString("alice_in_wonderland.txt");
        //System.out.println(data);

        System.out.print("upon: "); findSubString(data, "upon");
        System.out.print("sigh: ");findSubString(data, "sigh");
        System.out.print("Dormouse: ");findSubString(data, "Dormouse");
        System.out.print("jury-box: ");findSubString(data, "jury-box");
        System.out.print("swim: ");findSubString(data, "swim");
        
    }
}
