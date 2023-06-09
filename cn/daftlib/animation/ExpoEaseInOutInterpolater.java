package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class ExpoEaseInOutInterpolater implements Interpolator
{
	public float getInterpolation(float t)
	{
		if(t == 0)
			return 0;
		if(t == 1)
			return 1;
		if((t *= 2) < 1)
			return .5f * (float)Math.pow(2, 10 * (t - 1));
		return .5f * (float)(-Math.pow(2, -10 * --t) + 2);
	}
}