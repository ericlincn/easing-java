package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class QuintEaseOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return ((t -= 1) * t * t * t * t + 1);
	}
}