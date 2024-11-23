class A extends Object
{
    A(){
        super();
        System.out.println("A cons");
    }
    {
        System.out.println("IIB_A");
    }
    
}

class B extends A{
    B(){
        super();
        System.out.println("B Const.");
    }
    {
        System.out.println("IIB_A");
    }
}




public class ManagerIIB {
    public static void main(String[] args) {
        B a=new B();

    }

    
}
