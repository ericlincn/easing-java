package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class CircEaseInOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		if((t *= 2) < 1)
			return -.5f * (float)(Math.sqrt(1 - t * t) - 1);
		
		return .5f * (float)(Math.sqrt(1 - (t -= 2) * t) + 1);
	}
}