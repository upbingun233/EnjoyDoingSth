package eds;
public class Day0901  implements Oneday {
	public static void main() {
		Basic.println("~~~~~2023年秋季学期部分~~~~~");
		Basic.println("9月1日 今天是开学的第一天");
		morning();
		noon();
		night();
		end();
	}
	public static void morning () {
		Morning.getUp();
	}
	public static void noon() {
		Meal.lunch();
	}
	public static void night() {
		Meal.dinner();
	}
	public static void end() {
		Basic.println("于是这一天结束了");
	}
}
