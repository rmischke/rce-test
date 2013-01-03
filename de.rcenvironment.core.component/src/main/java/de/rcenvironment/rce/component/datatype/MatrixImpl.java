/*
 * Copyright (C) 2006-2012 DLR, Germany
 * 
 * All rights reserved
 * 
 * http://www.rcenvironment.de/
 */
 
package de.rcenvironment.rce.component.datatype;


/**
 * Matrix representation.
 *
 * @author Markus Kunde
 */
public class MatrixImpl implements Matrix {

    /** serial version uid.*/
    private static final long serialVersionUID = -572459928065104861L;

    /**
     * {@inheritDoc}
     *
     * @see de.rcenvironment.rce.component.datatype.IWorkflowDataType#getType()
     */
    @Override
    public WorkflowDataObjectType getType() {
        return WorkflowDataObjectType.Matrix;
    }

    /**
     * {@inheritDoc}
     *
     * @see de.rcenvironment.rce.component.datatype.IWorkflowDataType#serialize()
     */
    @Override
    public Object serialize() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * @see de.rcenvironment.rce.component.datatype.WorkflowDataObject#deserialize(java.lang.Object)
     */
    @Override
    public WorkflowDataObject deserialize(Object jsonWorkflowDataType) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * @see de.rcenvironment.rce.component.datatype.WorkflowDataObject#getValueAsString()
     */
    @Override
    public String getValueAsString() {
        // TODO Auto-generated method stub
        return null;
    }


}