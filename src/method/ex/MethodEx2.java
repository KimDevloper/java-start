package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String msg = "Hello World!";
        ptmsg(msg, 3);
        ptmsg(msg, 5);
        ptmsg(msg, 7);
    }
    public static void ptmsg(String msg, int n){
        for(int i = 0; i < n; i++){
            System.out.println(msg);
        }
    }
}
