package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class BounceEaseInInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		return 1 - new BounceEaseOutInterpolater().getInterpolation(1 - t);
	}
}