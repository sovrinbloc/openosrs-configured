package net.runelite.client.plugins.a.screen;


import lombok.Value;
import net.runelite.api.Point;
import net.runelite.client.plugins.a.toolbox.ScreenMath;

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
		return ScreenMath.subtract(point, ScreenMath.convertToPoint(Screen.getAbsoluteScreenLocationX0Y0()));
	}
}