package Assignment_01;

import java.util.ArrayList;
import java.util.TreeSet;

import org.openqa.selenium.By;

public class practice {
	public static void main(String[] args) {

	}
	public static int sort(int a[]) {
		int min = a[0];
		int b=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
				b = a[i];
			}
		}
		return b;
	}
}

