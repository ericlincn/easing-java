package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class SineEaseInInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return -(float)Math.cos(t * (Math.PI/2)) + 1;
	}
}