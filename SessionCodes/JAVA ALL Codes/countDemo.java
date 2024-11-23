import java.util.Random;
import java.util.random.*;

public char[] createArray(){
    char [] chars=new char[10];
    char all[]={'r','a','v','i','p','a','n','c','h','a','l'};
    for(int i=0;i<chars.length;i++){
        Random random=new Random();
        int index=random.nextInt(10-0+1)+0;
        System.out.println(index);
        chars[i]=all[index];
    } 
    return chars;
}

public void displayArray(char chars[]){
    for(int i=0;i<chars.length;i++){
        
    }
}




public class countDemo {
    
}
