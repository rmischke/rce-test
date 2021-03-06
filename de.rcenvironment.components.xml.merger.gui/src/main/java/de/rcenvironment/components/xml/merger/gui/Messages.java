/*
 * Copyright (C) 2006-2014 DLR, Germany
 * 
 * All rights reserved
 * 
 * http://www.rcenvironment.de/
 */

package de.rcenvironment.components.xml.merger.gui;

import org.eclipse.osgi.util.NLS;

/**
 * Supports language specific messages.
 * 
 * @author Markus Kunde
 */
public class Messages extends NLS {

    /** Constant. */
    public static String fileChoosingSectionName;

    /** Constant. */
    public static String fileLinkButtonLabel;

    /** Constant. */
    public static String fileEditorButtonLabel;

    /** Constant. */
    public static String loadTitle;

    /** Constant. */
    public static String loadMessage;

    /** Constant. */
    public static String xmlLabel;

    /** Constant. */
    public static String xsltLabel;

    /** Constant. */
    public static String actuallyLoadedLabel = null;

    /** Validation message. */
    public static String noXmlFileLoaded;

    /** Validation message. */
    public static String noXmlFileLoadedLong;

    /** Validation message. */
    public static String unknownMappingType;

    /** Validation message. */
    public static String unknownMappingTypeLong;

    private static final String BUNDLE_NAME = Messages.class.getPackage().getName() + ".messages";

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }
}
