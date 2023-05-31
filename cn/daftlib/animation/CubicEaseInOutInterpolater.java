package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class CubicEaseInOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		if((t *= 2) < 1)
			return .5f * t * t * t;
		return .5f * ((t -= 2) * t * t + 2);
	}
}