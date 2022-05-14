package net.runelite.client.external.adonaicore.screen;


import lombok.Value;
import net.runelite.api.Point;
import net.runelite.client.external.adonaicore.toolbox.Calculations;

@Value
public class CanvasLocation
{
	/**
	 * Converts the screen location to canvas location.
	 *
	 * @param point
	 * @return
	 */
	public static Point fromAbsoluteScreenPosition(Point point)
	{
		return Calculations.subtract(point, Calculations.convertToPoint(Screen.getAbsoluteScreenLocationX0Y0()));
	}
}