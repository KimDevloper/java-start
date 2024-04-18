package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(20);

    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자이므로 출입 불가능입니다.");
            return; //return 만나면 해당 메소드 나간다.ㅈ
        }

        System.out.println(age + "살, 입장하세요.");
    }
}
