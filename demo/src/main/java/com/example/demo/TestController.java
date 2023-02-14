package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@GetMapping("/test")
public String sayHello() 
{  
	int num = 10;
    int even[] = new int[num];
    int sum = 0,j = 0;
    String evennums = "";
    //Insert your code here
    for(int i=1;i<=even.length;i++) {
      if(i%2==0) {
      if(i<even.length) {
      evennums=evennums+i+",";
      } else {
         evennums=evennums+i;
      }
      sum=sum+i;
      
    }
    }

    System.out.println(evennums);
    System.out.println(sum);
	return "Heallo";
}
@GetMapping("/prime")
public int primeSum() {
	int number = 1, count, sum = 0;
	// executes until the condition becomes false
	while (number <= 100) {
		count = 0;
		int i = 2;
		while (i <= number / 2) {
			// find the remainder and check if it is equal to 0 or not
			if (number % i == 0) {
				// increments the count variable by 1 if the above condition returns true
				count++;
				break;
			}
			// increments the variable i by 1
			i++;
		} // end of while
		if (count == 0 && number != 1) {
			// calculates the sum of prime numbers
			sum = sum + number;
		} // end of if statement
			// increments the variable number by 1 after completing each iteration
		number++;
	} // end of while
		// prints the sum
	return sum;
} // end of main
}
