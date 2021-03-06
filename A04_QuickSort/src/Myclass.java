//快速排序
//09/24/2014 
//quick sort有两种，一种是从左往右，一种是两边向中间搜索，这里用的第一种
//田忠骏 
public class Myclass {
	
	public static void main(String[] args){		
		int N=1000000;
		double[]A = Myclass.getRamdomNumber(N);//产生随机N个数
		
		long startT = System.nanoTime();  //测试算法耗时
		
		Myclass.quickSort(A,1,N-1);
		
	    long endT = System.nanoTime();   //测试算法耗时
		
		//for(int i=0;i<N;i++)
			//System.out.println((int)(A[i]*100));//打印结果, 因为小数不好看，就全部乘以100
	
	    System.out.println(N+"个数排序用时：" + (double)(endT - startT)/1000000+"毫秒");  
	}
	
	public static void quickSort(double[] array,int s,int e){
		if(s<e){
			int mid=partition(array,s,e);
			quickSort(array,s,mid);
			quickSort(array,mid+1,e);
		}
	}

	public static int partition(double[] array,int s,int e){
		double key=array[e];
		int i=s-1;
		
		for(int j=s;j<e;j++){//from start to end-1
			if(array[j]<=key){
				i++;
				double temp=array[j]; //交换
				array[j]=array[i];
				array[i]=temp;
			}
		}
		
		double temp=array[e];//交换
		array[e]=array[i+1];
		array[i+1]=temp;
		return i;
	}
	
	public static double[] getRamdomNumber(int N) {
		N=Math.abs(N);
		double []A= new double[N];
		for(int i=0;i<N;i++){
			A[i]=Math.random();
		}
		return A;
    }
}
