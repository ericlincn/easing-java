package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class BounceEaseInOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		if(t < .5f)
			return new BounceEaseInInterpolater().getInterpolation(t * 2) * .5f;
		else
			return new BounceEaseOutInterpolater().getInterpolation(t * 2 - 1) * .5f + .5f;
	}
}