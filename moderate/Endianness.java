package moderate;

import java.nio.*;
public class Endianness {

	/**
	 * @param args
	 * https://www.codeeval.com/open_challenges/15/
	 */

	public static void getEndian(){
	    int a = 0;
	   
	    int b = 1;
	
	    int combine = (b<<16) | a;
	     if(combine == 65536){
	        System.out.println("LittleEndian");
	    }else{
	        System.out.println("BigEndian");
	    }
	}
	


	public static void main(String[] args) {
	//	getEndian();
		
		ByteOrder b = ByteOrder.nativeOrder();
		if (b.equals(ByteOrder.BIG_ENDIAN)) {
		System.out.println("BigEndian");
		} else {
		System.out.println("LittleEndian");
		}
		
	}

}
