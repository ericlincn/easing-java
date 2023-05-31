package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class QuartEaseInInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return t * t * t * t;
	}
}