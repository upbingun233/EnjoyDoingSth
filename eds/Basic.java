package eds;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 用于存储一些基本的方法，方法应为public static的<br>
 * 实际上是从以前的mained.java搬过来的（笑）<br>
 * 对于以前的mained.basic类有所升级，改进了一些语法规范，加入了javadoc注释<br>
 * @author upbingun233
 */
public class Basic {
	/**
	 * 存放分数。
	 * 积分结算系统已经废弃，但是该变量依然保留，新的score在PartI类中
	 * @deprecated
	 */
	public static int score = 0;
	/**
     * 默认值。
     */
	public static final int SLEEPTIME=75;
	
	/**
	 * 存放每个字输出的间隔。<br>
	 * 默认情况下与SLEEPTIME同步。<br>
	 * 使用完请重置回SLEEPTIME<br>
	 * 我们并没有考虑到线程安全，在多线程所以请谨慎使用。
	 */
	public static int sleeptime =SLEEPTIME;
    

    /**
     * 结算系统之一<br>
     * 由于这个项目后面可能会更加大，不好把握评分，因此先不使用这个<br>
     * 对于原来的结局机制，由于要改进我们不结局。<br>
     * 因此这个方法废弃。<br>
     * @deprecated
     */
	public static void endput(){
        println("你的积分："+score);
        println("感谢游玩，你可以再次运行。");
        System.exit(0);
    }
    /**
     * 结算系统之一<br>
     * 由于这个项目后面可能会更加大，不好把握评分，因此先不使用这个<br>
     * 对于原来的结局机制，由于要改进我们不结局。<br>
     * 因此这个方法废弃。<br>
     * @deprecated
     */
	public static void end(){
        println("结算评语：");
        if (score==0) {
            println("豆瓣不予评价。");
            endput();
        }
        if (score>=-40&score<0) {
            println("你很矜持。");
            endput();
        }
        if(score<-40){
            println("你enjoy（享受）你的生活。");
            endput();
        }
        if (score>0&score<=100) {
            println("你很自律。");
            endput();
        }
        if(score>100){
            println("班主任很喜欢你。");
            endput();
        }
    }
    /**
     * 生成随机数，使用重载<br>
     * @return 0~100的随机数
     */
	public static int ramdom(){
        Random ran=new Random();
        return ran.nextInt(100);
    }
    /**
     * 生成随机数，支持自定义<br>
     * @param 需要生成的随机数上限
     * @return 1~number的随机数
     */
	public static int ramdom(int number){
        Random ran=new Random();
        return ran.nextInt(number)+1;
    }
    /**逐字输出，换行。<br>
     * 源代码来自于 https://wenda.so.com/q/1513942302213049 <br>
     * 在这里十分感谢。<br>
    */
	public static void println(String x) {
        //String s = "hello world ,have a nice day";
	    for (int i = 0; i < x.length(); ++i) {
		    System.out.print(x.charAt(i));
		    try {
			    TimeUnit.MILLISECONDS.sleep(sleeptime);//休眠sleeptime秒再输出

		    } catch (InterruptedException e) {
			    e.printStackTrace();
		    }
	    }
	    System.out.println();
    }
    /**
     * 开始EDS
     */
	public static void start() {
        println("EnjoyDoingSomething");
        println("本作品遵守GNU开源协议，您可以 分发、复制、修改，在您修改过后必须标注“修改版”，这些都是GNU的内容。");
        println("原作者：(C) upbingun，该版本为原版。");
        return;
    }
    /**
     * 基本的对话输出，支持自定义回答内容、输出内容<br>
     * 依赖于Basic.println()方法，逐字逐句输出<br>
     * @param time 对话发生时间
     * @param text 对话发生时的内容
     * @param control 可以提供的选择
     * @return 用户选择了哪项
     */
	public static int putout(String time, String text, String control) {
        println(time + " " + text);
        println("你可以：" + control + ";（键入数字）请选择。");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int scan = sc.nextInt();
			//sc.close();
			//如果cs.close()关闭第二次使用会抛出异常
			/*
			 * Exception in thread "main" java.util.NoSuchElementException
			    at java.base/java.util.Scanner.throwFor(Scanner.java:937)
			    at java.base/java.util.Scanner.next(Scanner.java:1594)
			    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
			    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
			    at main$basic.putout(main.java:48)
			    at main$moring.getUp(main.java:60)
			    at main.main(main.java:17)
			 */
			return scan;
		}
    }


