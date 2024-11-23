public class ExceptionalHandlingDemo {
    public static void main(String[] args) {
        try {
            String s=args[0];
            int i=Integer.parseInt(s);
            int j=i/(i-9);
            System.out.println("Value of j"+j);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Commant line argument is not passes!");
        }
        catch(NumberFormatException ex) {
            System.out.println("String to int conversion");

        }
        catch(ArithmeticException ex){
            System.out.println("Devide by zero!");

        }
        System.out.println("Main end!");
    }
    
}
