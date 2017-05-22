package intToEng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateEngメソッドで5を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "five";
		String actual = ite.translateEng(5);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngメソッドで15を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "fifteen";
		String actual = ite.translateEng(15);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで25を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "twenty five";
		String actual = ite.translateEng(25);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで45を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "fourty five";
		String actual = ite.translateEng(45);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで115を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred fifteen";
		String actual = ite.translateEng(115);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで1124を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one hundred twenty four";
		String actual = ite.translateEng(1124);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで21124を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one thousand one hundred twenty four";
		String actual = ite.translateEng(21124);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで521124を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "five hundred twenty one thousand one hundred twenty four";
		String actual = ite.translateEng(521124);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで1000を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand";
		String actual = ite.translateEng(1000);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで100を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで0を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで10000を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "ten thousand";
		String actual = ite.translateEng(10000);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで100000を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred thousand";
		String actual = ite.translateEng(100000);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngメソッドで9999を英訳できる() {
		IntToEng ite = new IntToEng();
		String expected = "nine thousand nine hundred ninety nine";
		String actual = ite.translateEng(9999);
		assertThat(actual, is(expected));
	}
}
