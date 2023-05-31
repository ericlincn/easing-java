package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class ExpoEaseInInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return (t == 0) ? 0 : (float)Math.pow(2, 10 * (t - 1));
	}
}