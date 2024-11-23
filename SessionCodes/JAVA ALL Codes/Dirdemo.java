import java.io.File;

public class Dirdemo {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\babaj\\Study Materials\\Java\\GSV\\practise\\Dirdemo.java");
        f1.mkdir();
        System.out.println(f1.exists());
        

    }
    
}
