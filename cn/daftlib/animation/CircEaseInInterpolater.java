package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class CircEaseInInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return -(float)(Math.sqrt(1 - t * t) - 1);
	}
}