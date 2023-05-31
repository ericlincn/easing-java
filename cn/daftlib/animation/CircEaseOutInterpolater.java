package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class CircEaseOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return (float)Math.sqrt(1 - (t -= 1) * t);
	}
}