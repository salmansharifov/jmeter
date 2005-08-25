/*
 * Copyright 2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.apache.jmeter.report.gui;

import java.util.Arrays;
import java.util.Collection;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;

import org.apache.jmeter.gui.AbstractJMeterGuiComponent;
import org.apache.jmeter.gui.util.MenuFactory;
import org.apache.jmeter.visualizers.Printable;

/**
 * @author Peter Lin
 *
 * This is the abstract base for report gui's
 */
public abstract class AbstractReportPageGui extends AbstractJMeterGuiComponent 
    implements Printable
{

	/**
	 * 
	 */
	public AbstractReportPageGui() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.apache.jmeter.gui.JMeterGUIComponent#getLabelResource()
	 */
	public String getLabelResource() {
		return AbstractReportPageGui.class.getName();
	}

	/* (non-Javadoc)
	 * @see org.apache.jmeter.gui.JMeterGUIComponent#createPopupMenu()
	 */
	public JPopupMenu createPopupMenu() {
        return MenuFactory.getDefaultSamplerMenu();
	}

	/* (non-Javadoc)
	 * @see org.apache.jmeter.gui.JMeterGUIComponent#getMenuCategories()
	 */
	public Collection getMenuCategories() {
        return Arrays.asList(new String[] { MenuFactory.SAMPLERS });
	}

    /**
     * Subclasses need to over this method, if they wish to return something
     * other than the Visualizer itself.
     * 
     * @return
     */
    public JComponent getPrintableComponent() {
        return this;
    }
}
