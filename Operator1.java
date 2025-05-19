public class Operator1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = 0;
        b = a++;
        
        System.out.println("a 는 " + a + "b  는 " + b);
        c = a++;
        System.out.println("C 는 : " + c);

        int d = 5;
        d += 3;
        System.out.println(d);
    }   
}
