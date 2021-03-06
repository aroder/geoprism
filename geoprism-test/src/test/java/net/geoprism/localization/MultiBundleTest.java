/**
 * Copyright (c) 2015 TerraFrame, Inc. All rights reserved.
 *
 * This file is part of Runway SDK(tm).
 *
 * Runway SDK(tm) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Runway SDK(tm) is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Runway SDK(tm).  If not, see <http://www.gnu.org/licenses/>.
 */
package net.geoprism.localization;

import java.util.Map;

import net.geoprism.localization.MultiBundle;

import org.junit.Assert;
import org.junit.Test;

public class MultiBundleTest
{
  @Test
  public void testGetFromDefault()
  {
    Assert.assertEquals("Test", MultiBundle.get("com.runwaysdk.ui.userstable.UsersTable.newUser"));
  }

  @Test
  public void testGetFromLocale()
  {
    Assert.assertEquals("Edit", MultiBundle.get("com.runwaysdk.ui.userstable.UsersTable.editUser"));
  }

  @Test
  public void testGetAll()
  {    
    Map<String, String> properties = MultiBundle.getAll();
    
    Assert.assertEquals("Test", properties.get("com.runwaysdk.ui.userstable.UsersTable.newUser"));
    Assert.assertEquals("Edit", properties.get("com.runwaysdk.ui.userstable.UsersTable.editUser"));
    Assert.assertEquals("Value", properties.get("test"));
  }
}
