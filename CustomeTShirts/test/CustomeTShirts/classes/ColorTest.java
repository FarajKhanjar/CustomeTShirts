package CustomeTShirts.classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
class ColorTest 
{
	
	private Color[] colors = new Color[3];

	public ColorTest() 
	{
		colors[0] = new Color((short) 0, (short) 0, (short) 0);
		colors[1] = new Color((short) 10, (short) 200, (short) 10);
		colors[2] = new Color((short) 20, (short) 20, (short) 250);
	}

	@Test
	void checkIfArrayIsNotNull() 
	{
		assertNotNull(colors[0]);
		assertNotNull(colors[1]);
		assertNotNull(colors[2]);
	}

	@Test
	void checkObjectFields() 
	{
		//(expectedValue,actualValue)
		assertEquals(0, colors[0].red);
		assertEquals(0, colors[0].green);
		assertEquals(0, colors[0].blue);

		assertEquals(10, colors[1].red);
		assertEquals(200, colors[1].green);
		assertEquals(10, colors[1].blue);

		assertEquals(20, colors[2].red);
		assertEquals(20, colors[2].green);
		assertEquals(250, colors[2].blue);
	}

	@Test
	void checkDominantColors() 
	{
		assertEquals("Red", colors[0].getDominant());
		assertEquals("Green", colors[1].getDominant());
		assertEquals("Blue", colors[2].getDominant());
	}

	@Test
	void checkNormalizedColors() 
	{
		assertEquals((float) 0 / 255, colors[0].normalized()[0]);
		assertEquals((float) 0 / 255, colors[0].normalized()[1]);
		assertEquals((float) 0 / 255, colors[0].normalized()[2]);

		assertEquals((float) 10 / 255, colors[1].normalized()[0]);
		assertEquals((float) 200 / 255, colors[1].normalized()[1]);
		assertEquals((float) 10 / 255, colors[1].normalized()[2]);

		assertEquals((float) 20 / 255, colors[2].normalized()[0]);
		assertEquals((float) 20 / 255, colors[2].normalized()[1]);
		assertEquals((float) 250 / 255, colors[2].normalized()[2]);
	}	
}