package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class SineEaseOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return (float)Math.sin(t * (Math.PI/2));
	}
}