package junit.tutorial;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testMultiplyで乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.mutiply(3, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void testMutiplyで３と４の乗算結果が取得できる() throws Exception {
		// SetUp
		Calculator calc = new Calculator();
		int expected = 12;
		// Exercise
		int actual = calc.mutiply(3, 4);
		// Verify
		assertThat(actual, is(expected));
	}
	@Test
	public void testMultiplyで5と7の乗算結果が取得できる() throws Exception {
		// SetUp
		Calculator calc = new Calculator();
		int expected = 35;
		// Exercise
		int actual = calc.mutiply(5, 7);
		// Verify
		assertThat(actual, is(expected));
	}
	@Test
	public void test() throws Exception {
		// SetUp
		// Exercise
		// Verify
	}
	
}
