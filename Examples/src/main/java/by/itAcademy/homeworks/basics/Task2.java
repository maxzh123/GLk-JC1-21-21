package by.itAcademy.homeworks.basics;

public class Task2 implements Comparable<Task2> {
    private int sum;
    public Task2(){
        sum=0;
    }

    public Task2(int initSum){
        sum=initSum;
    }

    public void add(int a){
        sum+=a;
    }

    public void print(){
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Task2 t=new Task2();
        Task2 t2=new Task2(2);
        t.add(5);
        t.add(2);
        t2.add(8);
        t.print();
        t2.print();
    }


    public int compareTo2(Task2 o) {
        if (o==null) return 1;
        if (o.sum>sum) return -1;
        if (o.sum<sum) return 1;
        return 0;
    }
    @Override
    public int compareTo(Task2 o) {
       return -compareTo2(o);
    }
    @Override
    public String toString(){
        return "Объект с сумой:"+String.valueOf(sum);

    }
}
