package Experiment1;
class Table{
    void print(){
        System.out.println("Number Square Cube");
        for(int i=0;i<=10;i++){
            System.out.println(i + "       " + i*i + "       " + i*i*i);
        }
        System.out.println();
    }
}
public class Ques6 {
    public static void main(String[] args) {
        Table t = new Table();
        t.print();
    }
}