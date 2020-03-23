package com.epam.Tdd_Junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
	/*TODO list for the application
	 * 1.one A character:"ABCD"=>"BCD"-success
	 * 2.two consecutive A characters:"AACD"=>"CD"-success
	 * 3.second character is A:"BACD"=>"BCD"-success
	 * 4.last two characters are A:"BBAA"=>"BBAA"-success
	 * 5.first two and last two are A's:"AABAA"=>"BAA"-success
	 */
	RemoveChars r;
	@BeforeEach
	void start() {
		r= new RemoveChars();
	}
	@Test
	void remove1character() {
		assertEquals("BCD",r.removeAchar("ABCD"));
	}
	@Test
	void remove2character() {
		assertEquals("CD",r.removeAchar("AACD"));
	}
	@Test
	void removeseccharacter() {
		assertEquals("BCD",r.removeAchar("BACD"));
	}
	@Test
	void remaincharacter() {
		assertEquals("BBAA",r.removeAchar("BBAA"));
	}
	@Test
	void firstlastcharacter() {
		assertEquals("BAA",r.removeAchar("AABAA"));
	}
	
}
