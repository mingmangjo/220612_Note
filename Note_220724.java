// Math.random()를 이용해 무작위의 10자리 배열을 저장한 뒤 오름차순으로 재배열해라.  

public class FlowEx {

	public static void main(String[] args) {
		
	int[] arr=new int[10];
	
	for(int i=0;i<arr.length;i++) System.out.print(arr[i]=(int)(Math.random()*10));
	System.out.println(); // 10자리의 무작위 배열을 arr에 저장
	
	for(int i=0;i<arr.length-1;i++) {
		boolean changed=false;
		for(int j=0;j<arr.length-i-1;j++) {
			int temp=0;
			if(arr[j]>arr[j+1]) {temp=arr[j];arr[j]=arr[j+1];arr[j+1]=temp;changed=true;}
		} // j end
		if(!changed) break;
		for(int k=0;k<arr.length;k++)System.out.print(arr[k]);
		System.out.println();
	} // i end 
	} // main end
} 