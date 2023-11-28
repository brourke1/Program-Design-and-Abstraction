import java.util.Scanner;
import java.io.*;
public class Webify{

    public static String addHeader(String input){
        int iLength = input.length() - 1;
        String output = input.substring(1, iLength);
        return "<h1>" + output + "</h1>";
    }

    public static String addListElement(String input){
        String output = input.substring(1);
        return "<li>" + output + "</li>";
    }

    public static String simplify(String input){
        String output = "";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '['){
                output += "[";
            }
            else if(input.charAt(i) == ']'){
                output += "]";
            }
        }
        return output;
    }

    public static boolean isLink(String input){
        String linkFormat = "[[][]]";
        if(simplify(input).equals(linkFormat)){
            return true;
        }
        return false;
    }

    public static String addLink(String input){
        String arr[] = input.split("\\]\\[");

        String url = arr[0].substring(2);
        String displayText = arr[1].substring(0,arr[1].length()-2);

        return "<a href=" + url + ">" + displayText + "</href>";

    }


    public static String addLine(String s, String html){
        int htmlLength = html.length() - 1;
        int sLength = s.length() - 1;
        String prevTag = html.substring(htmlLength - 4);
        String currTag = "";



        if(sLength == 0){
            return s += "<p>";
        }

        if(sLength >= 2){
            if(s.charAt(0) == '_' && s.charAt(sLength) == '_'){
                s = addHeader(s);
                currTag = "<h1>";
            }
            else if(s.charAt(0) == '-'){
                s = addListElement(s);
                currTag = "<li>";
            }
            else if(isLink(s)){
                s = addLink(s);
            }
            else{
                s += "</br>";
            }
        } 

        if(currTag.equals("<li>") && !(prevTag.equals("</li>"))){
            html += "<ul>";
        }
        else if(!(currTag.equals("<li>")) && prevTag.equals("</li>")){
            html += "</ul>";
        }   

        return html + s;

    }




    public static void main(String[] args) throws Exception{
        
        Scanner scnr = new Scanner(System.in);
        String fileInput;
        System.out.println("Please input the name of the text file you wish to read from: ");
        fileInput = scnr.nextLine();
        int fLength = fileInput.length();
        String fileType = fileInput.substring(fLength - 4);
        
        if(!fileType.equals(".txt")){
            System.out.println("Please input a '.txt' file.");
        }

        String fileName = fileInput.substring(0,fLength - 4);
        File file = new File(fileInput);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String htmlOutput = "<html><body>";


        String nextLine = br.readLine();

        while(nextLine != null){

            htmlOutput = addLine(nextLine, htmlOutput);

            nextLine = br.readLine();
        }

        htmlOutput += "</body>\n</html>\n";
        
        String outputFile = fileName + ".html";
        //File htmlFile = new File(outputFile);
        
        PrintWriter pw = new PrintWriter(outputFile);
        pw.write(htmlOutput);
        pw.close();
        


        
    }
}