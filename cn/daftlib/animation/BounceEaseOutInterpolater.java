package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class BounceEaseOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		if(t < (1/2.75))
		{
			return 7.5625f * t * t;
		}
		else if(t < (2/2.75))
		{
			return 7.5625f * (t -= (1.5/2.75)) * t + .75f;
		}
		else if(t < (2.5/2.75))
		{
			return 7.5625f * (t -= (2.25/2.75)) * t + .9375f;
		}
		else
		{
			return 7.5625f * (t -= (2.625/2.75)) * t + .984375f;
		}
	}
}