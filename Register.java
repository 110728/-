import java.util.Scanner;
public class Register {
    public static void register() {
        System.out.println("请注册用户的个人信息");
        Scanner scanner = new Scanner(System.in);
        System.out.println("用户名");
        //接收用户名 放在用户信息中
        User.userName = scanner.nextLine();
        System.out.println("密码");
        //接收到用户信息中
        User.passWord = scanner.nextLine();
        //随机一个四位的1000-2000的数 保存到用户中。
        User.luckNumber = (int)(Math.random()*(2000-1000+1)+1000);
        //显示用户的注册信息
        System.out.println("用户名"+User.userName);
        System.out.println("密码"+User.passWord);
        System.out.println("幸运数字"+User.luckNumber);

    }
}
