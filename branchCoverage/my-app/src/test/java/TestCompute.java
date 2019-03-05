import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;
  
	@Test
	public void example() {
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		assertTrue(true);
	}
  
	@Test
	public void sizeComp(){
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		when(mq.size()).thenReturn(0);
		assertTrue(-1 == c.countNumberOfOccurrences("yavuz"));
	}
	
	@Test 
	public void containsTest(){
		String defString="yavuz";
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		when(mq.size()).thenReturn(2);
		when(mq.contains(defString)).thenReturn(true);
		assertTrue(0 == c.countNumberOfOccurrences("algun"));
	}
	
	
	@Test 
	public void forTest(){
		String defString="yavuz";
		MessageQueue mq = mock(MessageQueue.class);
		c = new Compute(mq);
		when(mq.size()).thenReturn(2);
		when(mq.contains(defString)).thenReturn(true);
		when(mq.getAt(0)).thenReturn(defString);
		when(mq.getAt(1)).thenReturn("Algun");
		assertTrue(1 == c.countNumberOfOccurrences(defString));
	}
	
}