package eds;
/**
 * 由于chat类不好处理，所以我们改成Meal类<br>
 * 依赖于Basic类<br>
 * 由于Morning类的getUp()有点屎山我们先不写morningMeal()
 * @author Administrator
 */
public class Meal {
	/**
	 * 屎山的Moring.getUp()，不写了
	 * @deprecated
	 */
	public static void morningMeal() {}
	/**
	 * 中午的正餐
	 */
	public static void lunch() {
		System.out.println();
		Basic.println("中午，你来到了食堂。");
		int br=Basic.putout("11:45", "你来到了食堂。", "菜品选择：[1]9.5元鸡肉套餐;[2]8.5元炒火锅底料/猪肺套餐;[3]4.5元素菜套餐;[4]不吃了");
		switch (br){
		case 1:
			Basic.println("你的饭卡滴走了9.5元");
			PartI.score+=5;
			break;
		case 2:
			Basic.println("你的饭卡滴走了8.5元");
			PartI.score+=3;
			break;
		case 3:
			Basic.println("你的饭卡滴走了4.5元");
			break;
		case 4:
			Basic.println("You are so lazy（你太懒了）");
			PartI.score-=5;
			break;
		default:
			Basic.println("当你不吃了");
			PartI.score-=5;
			break;
		}
	}
	/**
	 * 晚上的正餐
	 */
	public static void dinner() {
		System.out.println();
		Basic.println("晚上，你来到了食堂。");
		int br=Basic.putout("4:40", "你来到了食堂。", "菜品选择：[1]9.5元鸡肉套餐;[2]8.5元炒火锅底料/猪肺套餐;[3]4.5元素菜套餐;[4]6.25元的老友粉;[5]不吃了");
		switch (br){
		case 1:
			Basic.println("你的饭卡滴走了9.5元");
			PartI.score+=5;
			break;
		case 2:
			Basic.println("你的饭卡滴走了8.5元");
			PartI.score+=3;
			break;
		case 3:
			Basic.println("你的饭卡滴走了4.5元");
			break;
		case 4:
			int br2=Basic.putout("4:45","你望了一眼队伍，前面有30多人，预计要25分钟","[1]吃;[2]不等了");
			switch(br2) {
			case 1:
				Basic.println("5:10 你终于嗦上了老友粉");
				PartI.score+=5;
				break;
			case 2:
				Basic.println("你转头去了其他地方吃（4.5元）");
				break;
			default:
				Basic.println("当你不吃了，你转头去了其他地方吃（4.5元）");
				break;
			}
			break;
		case 5:
			Basic.println("You are so lazy（你太懒了）");
			PartI.score-=5;
			break;
		default:
			Basic.println("当你不吃了");
			PartI.score-=5;
			break;
		}
	}
}
