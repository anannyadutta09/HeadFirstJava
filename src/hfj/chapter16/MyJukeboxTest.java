package hfj.chapter16;

import java.util.Collections;

public class MyJukeboxTest {

	public static void main(String[] args) {

		MyJukebox mjb = new MyJukebox();
		mjb.go();

		
		
		
		
		MyJukebox mjb2 = new MyJukebox();
		mjb2.getSongs();
		Collections.sort(mjb2.mysongList); //<---------- bad code : no direct ccess o varible >
		System.out.println(mjb2.mysongList);
	}

}
