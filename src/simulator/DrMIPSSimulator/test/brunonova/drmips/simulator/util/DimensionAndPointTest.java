/*
    DrMIPS - Educational MIPS simulator
    Copyright (C) 2013-2016 Bruno Nova <brunomb.nova@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package brunonova.drmips.simulator.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class DimensionAndPointTest {
	@Test
	public void testDimension() {
		assertEquals(new Dimension(20, 1), new Dimension(20, 1));
		assertEquals(new Dimension(0, 0), new Dimension(0, 0));

		// Negative values should be converted to 0
		assertEquals(new Dimension(0, 0), new Dimension(-1, -50));
		assertEquals(new Dimension(1, 0), new Dimension(1, -50));
		assertEquals(new Dimension(0, 50), new Dimension(-1, 50));
	}

	@Test
	public void testPoint() {
		assertEquals(new Point(20, 1), new Point(20, 1));
		assertEquals(new Point(0, 0), new Point(0, 0));

		// Negative values should be converted to 0
		assertEquals(new Point(0, 0), new Point(-1, -50));
		assertEquals(new Point(1, 0), new Point(1, -50));
		assertEquals(new Point(0, 50), new Point(-1, 50));
	}
}
