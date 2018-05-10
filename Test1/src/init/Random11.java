package init;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//抢红包
public class Random11 {
	public static void main(String[] args) {
		
		List<Integer> qg = qg(10000,10);
		System.out.println(qg);
		
		
		for (Integer integer : qg) {
			System.out.println("抢到金额:"+new BigDecimal(integer).divide(new BigDecimal(100)));
		}
		
		//	bb();
	/*	Random r=getR(30);
		for(int i=0;i<10;i++){
			System.out.print(r.nextInt(100)+"~");
		}*/
	}
	public static Random getR(int a){
		Random r=new Random(a);
		return r;
		
	}
	
	public static boolean[] bb(){
		boolean[] a=new boolean[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		return a;
		
	}
	//平均值算法
	public static List<Integer> packAge(Integer totalM,Integer totalP){
		Random random=new Random();
		List<Integer> list=new ArrayList<>();
		Integer restM=totalM;
		Integer restP=totalP;
		
		for (int i = 0; i <totalP-1; i++) {
			int amount =random.nextInt(restM/restP *2-1)+1;
			restM-=amount;
			restP--;
			list.add(amount);
			double n = random.nextDouble();
		}
		list.add(restM);
		return list;
	}
	//线段切割法
	public static List<Integer> qg(Integer total,Integer pnumber){
		List<Integer> list=new ArrayList<>();
		Random r=new Random();
		boolean[] b=new boolean[total];
		Integer count=0;
		for(int i=0;i<pnumber-1;i++){
			do{
				count=r.nextInt(total);
			}while(b[count]);
			b[count]=true;
			list.add(count);
		}
		Collections.sort(list);
		List<Integer> ll=new ArrayList<>();
		ll.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			ll.add(list.get(i)-list.get(i-1));
		}
		ll.add(total-list.get(list.size()-1));
		return ll;
	}
}
