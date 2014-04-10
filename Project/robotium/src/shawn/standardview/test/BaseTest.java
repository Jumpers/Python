package shawn.standardview.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.util.Constant;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class BaseTest extends ActivityInstrumentationTestCase2 {
	BaseRobotium mRobotium;
	private static Class launcherActivity;
	static {
		try {
			launcherActivity = Class.forName(Constant.Cactivity1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public BaseTest() {
		super(launcherActivity);
	}
	
	@Override
	protected void setUp() throws Exception {
		mRobotium= new BaseRobotium(getInstrumentation(),getActivity());
		mRobotium.clearLog();
	}
	
	@Override
	protected void tearDown() throws Exception {
		mRobotium.finishOpenedActivities();
	}
	
	public void testDemo() {
		
	}

}
