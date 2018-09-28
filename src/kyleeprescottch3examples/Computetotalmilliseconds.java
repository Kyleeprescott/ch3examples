package kyleeprescottch3examples;
/*kylee prescott
 * 9/18
 * compute the clock 
 */
public class Computetotalmilliseconds {

	public static void main(String[] args) {
		// variables 
		int x=0;
	while (x!=1){
		long totalMilliseconds = System.currentTimeMillis();
		
		//calculations
		long totalSeconds =(totalMilliseconds/1000);
		long currentSecond = (totalSeconds%60);
	    long totalMinutes =  (totalSeconds/60);
	    long currentMinute =(totalMinutes%60);
	    long totalHours = (totalMinutes/60);
	    long currentHour = (totalHours%24);
	    
	    System.out.println(+currentHour+":"+currentMinute+":"+currentSecond+"");
	    
	    
		
	}	
		
	}

}
