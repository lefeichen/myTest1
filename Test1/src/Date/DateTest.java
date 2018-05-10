package Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest{
	/*1.分析以下需求，并用代码实现：
	(1)通过键盘录入日期字符串，格式(2015-10-20)
	(2)输出该日期是星期几及这一年的第几天
	(3)如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是  2015年的第 293 天"*/
	
	 public static void main(String[] args) throws ParseException {

		  System.out.println("请输入日期，格式(2015-10-20)");
		  String str = readStrForScan();
		  printDateForStr(str);
	}

	private static void printDateForStr(String str) throws ParseException {
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = df1.parse(str);
		
		DateFormat df2 = new SimpleDateFormat("yyyy年-MM月-dd日");
		String resultStr = df2.format(startDate);
		
		Calendar c  = Calendar.getInstance();
		c.setTime(startDate);
		
		int week = c.get(Calendar.DAY_OF_WEEK);  // 0 --> 星期一    1 -->星期二
		int day = c.get(Calendar.DAY_OF_YEAR);
		int year = c.get(Calendar.YEAR);
		
		System.out.println(resultStr +"是"+getWeek(week)+",是"+year+"年的第"+day+"天");
	}

	private static String getWeek(int week) {
		String [] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		System.out.println(week);
		return arr[week];
	}

	private static String readStrForScan() {

		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
