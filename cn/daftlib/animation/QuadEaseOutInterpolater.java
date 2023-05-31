package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class QuadEaseOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return -t * (t - 2);
	}
}