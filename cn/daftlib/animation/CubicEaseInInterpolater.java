package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class CubicEaseInInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return t * t * t;
	}
}