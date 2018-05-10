package Sort;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ArrayTest {
	public static void main(String[] args) {
		
		Map mm=new LinkedHashMap<>();
		String[] aaa={"aaa"};
		String[] ddd={"ddd"};
		mm.put("cf", aaa);
		mm.put("dd", ddd);
		System.out.println(mm);
	String[] ccc={"bbb"};
		String[] old=(String[])mm.put("dd", new String[1]);
		System.out.println(mm);
		System.out.println(old[0]);
		String[] a={"中国"};
		String[] b={"1","2"};
		System.out.println(a);
		System.out.println(b);
	/*	
		String[] aa=new String[1];
		System.out.println(aa[0]+"长度"+aa.length);
		
		
		
		
		
		
		//    System.arraycopy(elementData, index+1, elementData, index, numMoved);
	Object[] arr=new Object[6];
	for (int i=0;i<6;i++) {
		arr[i]=i+1;
	}
	List<Object> list1=new ArrayList();
	for(int i=0;i<6;i++){
		list1.add(arr[i]);
	}
		System.out.println(list1);
	System.arraycopy(arr, 0, arr, 1, 4);
		arr[5]=null;
	List<Object> list2=new ArrayList();
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null)
		list2.add(arr[i]);
	}
	
	System.out.println(list2);
	
		
		
		ArrayList<Object> arr2=new ArrayList();
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		System.out.println(arr2);
		System.arraycopy(arr, 2, arr, 1, 4);
		System.out.println(arr);*/
	}

}
