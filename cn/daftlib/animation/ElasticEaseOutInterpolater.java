package cn.daftlib.animation;

import android.view.animation.Interpolator;

public class ElasticEaseOutInterpolater implements Interpolator
{
	public float amplitude = 0;
	public float period = 0;
	
	public float getInterpolation(float t)
	{
		float p = period;
		float a = amplitude;
		
		float s;
		if(t == 0)
			return 0;
		if(t == 1)
			return 1;
		if(p == 0)
			p = .3f;
		if(a == 0 || a < 1)
		{
			a = 1;
			s = p / 4;
		}
		else
			s = (float)(p / (Math.PI*2) * Math.asin(1/a));
		return (float)(a * Math.pow(2, -10 * t) * Math.sin((t - s) * (Math.PI*2) / p) + 1);
	}
}