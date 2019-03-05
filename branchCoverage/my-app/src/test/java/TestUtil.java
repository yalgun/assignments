import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

	@Before
	public void setUp() {
	  c = new Util(); 
	}

	@Test
	public void example() { 
		assertTrue(true); 
	}
	
	@Test
	public void computeTesta(){
		int[] arr=new int[1];
		int[] arr2=new int[2];
        assertTrue(false == c.compute(arr));
        assertTrue(false == c.compute(arr2));
	}
	
	@Test
	public void forFor(){
		int[] arr={1,2,3};
		assertTrue(true == c.compute(arr));
	}
	
	@Test
	public void nullArr(){
		int[] arr={3,7,9};
		assertTrue(false == c.compute(arr));
	}
	
	@Test 
	public void excp(){
		try{
			int[] arr={0,0,0};
			c.compute(arr);
		}catch(RuntimeException excp){
			assertTrue(true);
		}
	}
 
}