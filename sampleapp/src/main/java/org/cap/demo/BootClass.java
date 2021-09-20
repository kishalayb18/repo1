package org.cap.demo;

public class BootClass {
	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Hello from first dev!");
	}

	public static void show()
	{
		System.out.println("show method here");
		
		int[] arr= {10,20,30};
		for(int i=0; i<3; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}