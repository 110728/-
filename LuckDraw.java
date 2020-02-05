import java.util.Scanner;
public class LuckDraw {
    //记录输入卡号注册
    static int number = 0;
    public static void lukcDraw() {
        //判断是否注册
        if(User.userName.length() ==0 ) {
            System.out.println("你没注册");
            return;
        }
        //判断是否登录
        if(!User.isLogin) {
            System.out.println("你没登录");
            return;
        }
        //判断卡号是否正确
        if (!isLuckNumber()) {
            System.out.println("卡号不对！不能登录");
            return;
        }
        //正确 执行抽奖
        //定义一个 变量保存中奖的结果
        boolean isLucky = true;
        //随机十个数 打印出结果 并判断是否匹配幸运号码
        //定义一个变量 来保存累加的字符串
        String s = "本次幸运的数";
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * (2000-1000+1) + 1000);
            //拼接要打印的字符串
            if(i<10) {
                s = s + num+",";
            }else {
                s = s+num;
            }
            //判断是否中奖
            if(User.luckNumber!=num);
            //没中奖
            isLucky = false;
        }
        //打印幸运数字
        System.out.println(s);
        if (isLucky) {
            System.out.println("你中奖了");
        }else {
            System.out.println("你没中奖");
        }
    }
    public static boolean isLuckNumber() { //判断卡号是个输入正确
        //抽奖
        System.out.println("请输入卡号");
        Scanner scanner = new Scanner(System.in);
        int luckNumber = scanner.nextInt();
        //判断用户输入的卡号是不是 这个用户之前随机出来的那个数
        if (luckNumber==User.luckNumber) {
            System.out.println("输入正确，抽奖马上运行");
            return true;
            //卡号相同可以抽奖
        }else {
            //卡号不相同 重新输入三次机会
            number++;
            if (number!=3) {
                isLuckNumber();
            }else {
                System.out.println("三次机会已用尽");
            }
            return false;
        }
    }

}
