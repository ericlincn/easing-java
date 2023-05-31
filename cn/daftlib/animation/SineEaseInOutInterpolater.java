package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class SineEaseInOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return -0.5f * (float)(Math.cos(Math.PI * t) - 1);
	}
}