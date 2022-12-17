package ec.ed.itsqmet.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*Write a method that will receive a list of numbers and this method will return the text:
- "FizzBuzz" if i is divisible by 3 and 5.
- "Fizz" if i is divisible by 3.
- "Buzz" if i is divisible by 5.
- If none of the above conditions are true, then return the given number*/

@SpringBootTest
class TddApplicationTests {

	// @Test
	void contextLoads() {

	}

	public int addNum(int num1, int num2) {
		// Se reemplaza esto int result = num1+num2; por la línea 24
		return num1 + num2;
	}

	// @Test
	void testSum() {
		// TDD: Métodos que funcionan para verificar
		assertEquals(5, addNum(3, 2));
	}

	public String divisionTest(int[] nums) {
		if (nums[0] % 15 == 0) {
			return "FizzBuzz";
		} else if (nums[0] % 3 == 0) {
			return "Fizz";
		} else if (nums[0] % 5 == 0) {
			return "Buzz";
		}
		return divisionTest(nums);
	}
	
	@Test
	void testFizz() {
		int myArr[] = {15};
		assertEquals("FizzBuzz", divisionTest(myArr));
		myArr[0] = 3;
		assertEquals("Fizz", divisionTest(myArr));
		myArr[0] = 5;
		assertEquals("Buzz", divisionTest(myArr));
		myArr[0] = 5;
		assertEquals("Buzz", divisionTest(myArr));
	}
}
