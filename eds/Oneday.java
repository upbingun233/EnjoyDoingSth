package eds;
/**
 * 用于定义一天的行动，使用接口
 * @author upbingun233
 */
public interface Oneday {
	/**
	 * 一般来说这里是执行程序的开始。把方法的调用写在这里
	 */
	public static void main() {}
	public static void morning () {}
	public static void noon() {}
	public static void night() {}
	public static void end() {
		Basic.println("于是这一天结束了");
	}
}
