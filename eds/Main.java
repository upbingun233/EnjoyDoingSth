package eds;

public class Main {
	public static void main(String[] args) {
		System.out.print("你的存档信息：");
		Part1.init();
		Part1.read();
		System.out.println("Enjoy Doing Something!(Preview)");
		switch(Part1.runWhere()) {
		case 1:
			Part1.run();
			break;
		default:
			System.out.println("PartI类异常！");
			return;
		}/**/
	}
}
