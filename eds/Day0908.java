package eds;
public class Day0908  implements Oneday {
	public static void main() {
		Basic.println("9月8日...");
		morning();
		noon();
		night();
		konck();
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
	public static void konck() {
		switch(Basic.putout("10:05分","你敲击了一下墙，然后想起了敲墙很好玩","[1]继续敲;[2]不敲了")) {
		case 1:
			Basic.println("你敲了几下墙，对面回应了。");
			Basic.putout("","敲了数十分钟之后，你看见宿管往那边走了，然后对面不敲了","[1]继续敲;[2]不敲了");
			Basic.println("宿管过来了。");
			Basic.println("宿管：你们刚刚敲那个墙...（不记得了）起码要记大过的啊，明天你们自己和班主任说");
			Basic.println("然后宿舍不敢说话了");
			Day0909.explaining();
			break;
		default:
			Basic.println("然后你就睡觉了");
		}
			
		}
	public static void end() {
		Basic.println("于是这一天结束了");
	}
}
