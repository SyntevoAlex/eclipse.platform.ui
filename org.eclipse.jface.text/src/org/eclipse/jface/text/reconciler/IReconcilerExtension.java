/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.text.reconciler;


/**
 * Extends {@link org.eclipse.jface.text.reconciler.IReconciler} with 
 * the ability to be aware of documents with multiple partitions.
 * 
 * @since 3.0
 */
public interface IReconcilerExtension {
	
	/**
	 * Returns the partitioning this reconciler is using.
	 * 
	 * @return the partitioning this reconciler is using
	 */
	String getDocumentPartitioning();
}
