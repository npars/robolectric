package org.robolectric.integrationtests.constrainedmemory;

import static org.robolectric.Robolectric.buildActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import org.robolectric.testapp.TestActivity;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Config.ALL_SDKS)
public class ConstrainedMemoryTest {

  @Test
  public void testBuildActivityInManySdks() {
      ActivityController<TestActivity> controller = buildActivity(TestActivity.class);
      controller.setup().get();
      controller.close();
  }
}
