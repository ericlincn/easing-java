package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class QuadEaseInOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		if((t *= 2) < 1)
			return .5f * t * t;
		return -.5f * ((--t) * (t - 2) - 1);
	}
}