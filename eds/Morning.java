package eds;
/**
 * 一个Morning类
 * 提供基本的早上起床内容。
 * @author upbingun233
 */
public class Morning {
	/**
	 * 起床方法
	 */
    public static void getUp() {
        int br = 0;// back return
        br = Basic.putout("6:00", "起床铃已经响了", "[1]起床;[2]赖床");
        if (br == 2) {
            br=Basic.putout("6:03", "第一首歌已经完了（每首歌3分钟，6：12需要跑操，所以只有四首歌。)", "[1]起床;[2]赖床");
                if (br == 2) {
                    br=Basic.putout("6:06", "第二首歌已经完了（每首歌3分钟，6：12需要跑操，所以只有四首歌。)", "[1]起床;[2]赖床");                    
                    if (br == 2) {
                        br=Basic.putout("6:09", "第三首歌已经完了（每首歌3分钟，6：12需要跑操，所以只有四首歌。)", "[1]起床;[2]赖床");
                        if (br == 2) {
                            br=Basic.putout("6:12","第四首歌已经完了（每首歌3分钟，6：12需要跑操，所以只有四首歌。)，跑操铃声已经响了","[1]请假;[2]去跑操");
                            if(br==1){
                                if(Basic.ramdom()<=50){
                                    Basic.println("学生会上宿舍楼检查请假是否在睡觉，你正在睡觉，所以学生会把你抓了。");
                                    //Basic.println("触发结局(end1)，跑操被学生会抓。进入结算。");
                                    //Basic.end();
                                }else{
                                    Basic.println("你没有被抓，-10分");
                                    PartI.score-=10;
                                }

                            }else{
                                Basic.println("你刚刚好去跑操，你没有买到早餐。-5分");
                                PartI.score-=5;
                            }
                        }
                    } else {
                        // 包括用户乱按键。下面这种情况不作注释
                        Basic.println("你的时间有点紧。+0分。");
                        PartI.score+=0;
                        return;
                    }
                } else {
                // 包括用户乱按键。下面这种情况不作注释
                Basic.println("你的时间刚刚好。+5分。");
                PartI.score+=5;
                return;
        }
        } else {
            // 包括用户乱按键。下面这种情况不作注释
            Basic.println("你真勤快。+10分。");
            PartI.score+=10;
            return;
        }
    }

}
