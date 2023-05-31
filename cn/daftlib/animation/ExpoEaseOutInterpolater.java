package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class ExpoEaseOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return (t == 1) ? 1 : (float)(-Math.pow(2, -10 * t) + 1);
	}
}