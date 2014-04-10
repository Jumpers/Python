package shawn.standardview.test;

import android.app.Activity;
import android.app.Instrumentation;

import com.robotium.solo.Solo;

public class BaseRobotium extends Solo{

	public BaseRobotium(Instrumentation instrumentation, Activity activity) {
		super(instrumentation, activity);
	}
	
}
