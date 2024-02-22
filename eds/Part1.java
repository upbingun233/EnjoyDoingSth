package eds;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * 存储Part1的启动，包含了初始化（全局，开启时调用）init()方法、run()启动方法、read()载入存档方法（全局）、save()保存当前进度<br>
 * 部分方法存在警告。（毕竟我也不想看见个大大的黄色警告）
 * @author upbingun233
 */
@SuppressWarnings("serial")
public class Part1  implements Serializable{
	@SuppressWarnings("static-access")
	/**
	 * 初始化存档，开始游戏时调用。
	 */
	public static void init() {
		PartIStanding partistanding=new PartIStanding();
	    partistanding.part=PartI.part;
	    partistanding.score=PartI.score;
	    //System.out.println(partistanding.part);
		File file = new File("save.ser");
		if (!file.exists()) {
		    try {
		        file.createNewFile();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    try {
		    	FileOutputStream fileOut=new FileOutputStream("save.ser");
		    	ObjectOutputStream out=new ObjectOutputStream(fileOut);
		    	out.writeObject(partistanding);
		    	out.close();
		    	fileOut.close();
		    } catch (FileNotFoundException e) {
		    	// TODO Auto-generated catch block
		    	e.printStackTrace();
		    }catch (IOException e) {
			e.printStackTrace();
		    }

		}
	}
	/**
	 * 运行Part1的启动方法
	 */
	public static void run() {
		Day0901.main();
		Day0908.main();
		save();
	}
	/**
	 * 读取并装载存档。
	 */
	public static void read() {
		PartIStanding partistanding=null;
		try {
			FileInputStream fileIn=new FileInputStream("save.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			partistanding=(PartIStanding)in.readObject();
			System.out.println(partistanding.toString());
			in.close();
			fileIn.close();
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PartI.score=partistanding.score;
		PartI.part=partistanding.part;
		//System.out.print(partistanding.score+partistanding.part);
	}
	/**
	 * 保存当前进度。
	 */
	public static void save() {
		System.out.println("按下回车键来保存存档，如果不保存，请退出游戏窗口");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();sc.close();
		PartIStanding partistanding=new PartIStanding();
		partistanding.score=PartI.score;
		partistanding.part=2;
		try {
	    	FileOutputStream fileOut=new FileOutputStream("save.ser");
	    	ObjectOutputStream out=new ObjectOutputStream(fileOut);
	    	out.writeObject(partistanding);
	    	out.close();
	    	fileOut.close();
	    } catch (FileNotFoundException e) {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    }catch (IOException e) {
		e.printStackTrace();
	    }
		
	}
	/**
	 * 判断从哪里开始，必须有存档，并且已经read()过。
	 * @return 从哪里启动
	 */
	public static int runWhere() {
		return PartI.part;
	}
}
