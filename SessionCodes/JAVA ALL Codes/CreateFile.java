import java.io.FileWriter;

public class CreateFile {
    public static void main(String[] args) {
        //Accept the string
        String str="File Handling in Java using"+ "FileWriter and FileReader";

        //attach a file to FileWriter
        FileWriter fw=new FileWriter("Output.txt");
        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
            System.out.println("writing Successfully");
            fw.close();
        


        //read 
    }

    
}
