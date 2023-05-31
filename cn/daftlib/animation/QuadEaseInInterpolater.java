package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class QuadEaseInInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return t * t;
	}
}