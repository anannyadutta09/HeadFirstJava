package hfj.chapter11;

import javax.sound.midi.*;

public class MyTest {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We got a sequencer");
		} catch (MidiUnavailableException ex) {
			System.out.println("We got an exception");
		}
		
		
		
		
		
	}

	public static void main(String[] args) throws MidiUnavailableException{
		//MyTest mt = new MyTest();
		//mt.play();
		
		System.out.println("strt");
		//try {
		divide (2,0) ; 
		//}
//		catch(ArithmeticException ex) {
//			
//			System.out.println("ArithmeticException");
//		}
		System.out.println("finish");
	}
	
	
	
	public static int  divide (int a, int b) throws MidiUnavailableException{
		
		return a / b ;
	}
	
	

}
