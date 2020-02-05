import java.util.Scanner;
public class Login {
    static int number = 0;//控制循环输入密码三次
    public static boolean login() {
        System.out.println("请输入用户名：");
        //接收用户名
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("请输出账号：");
        String passWord = scanner.nextLine();
        //判断用户名密码是否匹配
        if(userName.equals(User.userName)&&passWord.equals(User.passWord)) {
            //登陆成功
            System.out.println("登陆成功");
            //返回一个登录状态
            return true;
        }else {
            //登录失败 有重新登录三次机会。
            number++;
            System.out.println("你还有"+(3-number)+"次机会");
            if (number !=3) {
                //还有登陆的机会
                login();
            }else {
                //三次机会已用 登录失败
                System.out.println("三次机会已用完 登录失败");
            }
            return false;
        }
    }
}
