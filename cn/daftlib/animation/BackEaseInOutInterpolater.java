package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class BackEaseInOutInterpolater implements Interpolator
{
	public float overshot = 0;
	
	public float getInterpolation(float t)
	{
		float s = this.overshot == 0?1.70158f:this.overshot;
		
		if((t *= 2) < 1)
			return .5f * (t * t * (((s *= (1.525)) + 1) * t - s));
		return .5f * ((t -= 2) * t * (((s *= (1.525)) + 1) * t + s) + 2);
	}
}