/*******************************************************************************
 * Copyright (c) 2015. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html  

 * Contributors: 
 *   Arnaud Mergey - initial API and implementation
*******************************************************************************/
package org.eclipse.draw2d.rap.swt.graphics;

import java.text.MessageFormat;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;


public class FontUtil {

  private final static String FONT_KEY = "DRAW2D_{0}_{1}_{2}"; //$NON-NLS-1$

  public static Font getFont( FontData[] fontData ) {
    String key = MessageFormat.format( FONT_KEY,
                                       fontData[ 0 ].getName(),
                                       fontData[ 0 ].getHeight(),
                                       fontData[ 0 ].getStyle() );
    FontRegistry reg = JFaceResources.getFontRegistry();
    if(! reg.hasValueFor( key ) ) {
      reg.put( key, fontData );
    }
    return reg.get( key );
  }
}
