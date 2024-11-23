public class practise2 {
    public static void main(String[] args) {
        String s1="sdj";
        String s2="sdj";
        String s3=new String(s1);
        String s4=new String(s2);
        System.out.println(".....");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s4);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        
    }
    
}
