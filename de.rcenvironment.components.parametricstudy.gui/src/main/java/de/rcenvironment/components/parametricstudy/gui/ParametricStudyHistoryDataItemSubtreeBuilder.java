/*
 * Copyright (C) 2006-2014 DLR, Germany
 * 
 * All rights reserved
 * 
 * http://www.rcenvironment.de/
 */

package de.rcenvironment.components.parametricstudy.gui;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import de.rcenvironment.components.parametricstudy.common.ParametricStudyComponentConstants;
import de.rcenvironment.core.gui.datamanagement.browser.spi.DefaultHistoryDataItemSubtreeBuilder;
import de.rcenvironment.core.gui.datamanagement.browser.spi.ComponentHistoryDataItemSubtreeBuilder;

/**
 * Implementation of {@link ComponentHistoryDataItemSubtreeBuilder} for the Parametric study component.
 * 
 * @author Doreen Seider
 */
public class ParametricStudyHistoryDataItemSubtreeBuilder extends DefaultHistoryDataItemSubtreeBuilder {

    private static final Image COMPONENT_ICON;

    static {
        String iconPath = "platform:/plugin/de.rcenvironment.components.parametricstudy.common/resources/parametric_study16.png";
        URL url = null;
        try {
            url = new URL(iconPath);
        } catch (MalformedURLException e) {
            LogFactory.getLog(ParametricStudyHistoryDataItemSubtreeBuilder.class).error("Component icon not found: " + iconPath);
        }
        if (url != null) {
            COMPONENT_ICON = ImageDescriptor.createFromURL(url).createImage();
        } else {
            COMPONENT_ICON = null;
        }
    }

    @Override
    public String[] getSupportedHistoryDataItemIdentifier() {
        return new String[] { ParametricStudyComponentConstants.COMPONENT_ID };
    }

    @Override
    public Image getComponentIcon(String identifier) {
        return COMPONENT_ICON;
    }

}
