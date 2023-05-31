package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class BackEaseInInterpolater implements Interpolator
{
	public float overshot = 0;
	
	public float getInterpolation(float t)
	{
		float s = this.overshot == 0?1.70158f:this.overshot;
		return t * t * ((s + 1) * t - s);
	}
}