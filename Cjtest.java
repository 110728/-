import java.util.Scanner;
public class Cjtest {
    public static void main(String[] args) {
        String yncontinue = "n"; //循环的判断条件是否继续
        do {
            System.out.println("*********幸运大抽奖********");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.抽奖");
            System.out.println("***********************");
            System.out.println("请选择菜单");
            //接收用户选择的菜单
            Scanner scanner = new Scanner(System.in);
            String meanNum = scanner.nextLine();
            //根据用户的选择 来执行对应功能
            meanChoose(meanNum);
            System.out.println("是否继续---输入y/n");
            //接收判断循环条件
            yncontinue = scanner.nextLine();
        } while (yncontinue.equals("y"));
        //循环结束提示
        System.out.println("欢迎下次使用");
    }
    //选择对应的方法
    public static void meanChoose(String meanNum) {
        switch (meanNum) {
            case "1":
                System.out.println("抽奖系统----注册");
                //调用 注册的方法
                Register.register();
            case "2":
                System.out.println("抽奖系统----登录");
                //调用登录的方法
                User.isLogin=Login.login();
                break;
            case "3":
                System.out.println("抽奖系统----幸运抽奖");
                LuckDraw.lukcDraw();
                break;
            default:
                System.out.println("输入错误请重新输入");
                break;
        }

    }
}

