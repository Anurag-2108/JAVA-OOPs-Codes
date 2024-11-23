class AA{
    AA(){
        super();
        
    }
}


public class ManagerSIB1 {
    static {
        System.out.println("SIB_MAIN");
    }

    public static void main(String[] args) {
        AA a=new AA();
        AA a1=new AA();
    }
    
}
