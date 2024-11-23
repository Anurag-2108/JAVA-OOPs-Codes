class AA{
    AA(){
        System.out.println("AA Const");
    }
    static {
        System.out.println("SIB_A");
    }
}


public class ManagerSIB {
    static{
        System.out.println("SIB");
    }
    public static void main(String[] args) {

        AA a=new AA();
        AA a2=new AA();
        System.out.println("Main Start");
    }
    static {
        System.out.println("Ravi");
    }
    
}
