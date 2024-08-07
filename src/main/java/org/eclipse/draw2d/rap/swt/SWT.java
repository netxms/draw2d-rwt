/*******************************************************************************
 * Copyright (c) 2002, 2011 Innoopract Informationssysteme GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Innoopract Informationssysteme GmbH - initial API and implementation
 *     EclipseSource - ongoing development
 ******************************************************************************/
package org.eclipse.draw2d.rap.swt;



/**
 * This class provides access to a small number of SWT system-wide
 * methods, and in addition defines the public constants provided
 * by SWT that are not included in org.eclipse.swt.SWT in RAP.
 * <p>
 * By defining constants like UP and DOWN in a single class, SWT
 * can share common names and concepts at the same time minimizing
 * the number of classes, names and constants for the application
 * programmer.
 * </p><p>
 * Note that some of the constants provided by this class represent
 * optional, appearance related aspects of widgets which are available
 * either only on some window systems, or for a differing set of
 * widgets on each window system. These constants are marked
 * as <em>HINT</em>s. The set of widgets which support a particular
 * <em>HINT</em> may change from release to release, although we typically
 * will not withdraw support for a <em>HINT</em> once it is made available.
 * </p>
 *
 * @since 1.0
 */
public class SWT {

  //RAP [ar] - The following are ADDED functionality for GEF port
  
  /**
   * Input Method Editor style constant for native input behavior (value is
   * 1&lt;&lt;3).
   */
  public static final int NATIVE = 1 << 3;
  
  /**
   * Line drawing style for solid lines (value is 1).
   */
  public static final int LINE_SOLID = 1;
  
  /**
   * Line drawing style for dashed lines (value is 2).
   */
  public static final int LINE_DASH = 2;
  
  /**
   * Line drawing style for dotted lines (value is 3).
   */
  public static final int LINE_DOT = 3;
  
  /**
   * Line drawing style for alternating dash-dot lines (value is 4).
   */
  public static final int LINE_DASHDOT = 4;
  
  /**
   * Line drawing style for dash-dot-dot lines (value is 5).
   */
  public static final int LINE_DASHDOTDOT = 5;
  
  /**
   * Line drawing style for custom dashed lines (value is 6).
   * 
   * @see org.eclipse.swt.graphics.GC#setLineDash(int[])
   * @see org.eclipse.swt.graphics.GC#getLineDash()
   * @since 3.1
   */
  public static final int LINE_CUSTOM = 6;
  
  /**
   * Style constant to indicate single underline (value is 0).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.4
   */
  public static final int UNDERLINE_SINGLE = 0;
  
  /**
   * Style constant to indicate double underline (value is 1).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.4
   */
  public static final int UNDERLINE_DOUBLE = 1;
  
  /**
   * Style constant to indicate error underline (value is 2).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.4
   */
  public static final int UNDERLINE_ERROR = 2;
  
  /**
   * Style constant to indicate squiggle underline (value is 3).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.4
   */
  public static final int UNDERLINE_SQUIGGLE = 3;
  
  /**
   * Style constant to indicate link underline (value is 0).
   * <p>
   * If the text color or the underline color are not set in the range the usage
   * of <code>UNDERLINE_LINK</code> will change these colors to the preferred
   * link color of the platform.<br>
   * Note that clients that use this style, such as <code>StyledText</code>,
   * will include code to track the mouse and change the cursor to the hand
   * cursor when mouse is over the link.
   * </p>
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.5
   */
  public static final int UNDERLINE_LINK = 4;
  
  /**
   * Style constant to indicate solid border (value is 1).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.4
   */
  public static final int BORDER_SOLID = 1;
  
  /**
   * Style constant to indicate dashed border (value is 2).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.4
   */
  public static final int BORDER_DASH = 2;
  
  /**
   * Style constant to indicate dotted border (value is 4).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>TextStyle</code></li>
   * </ul>
   * 
   * @since 3.4
   */
  public static final int BORDER_DOT = 4;
  
  /**
   * The character movement type (value is 1&lt;&lt;0). This constant is used to
   * move a text offset over a character.
   * 
   * @see org.eclipse.swt.graphics.TextLayout#getNextOffset(int, int)
   * @see org.eclipse.swt.graphics.TextLayout#getPreviousOffset(int, int)
   * @since 3.0
   */
  public static final int MOVEMENT_CHAR = 1 << 0;
  
  /**
   * The cluster movement type (value is 1&lt;&lt;1). This constant is used to
   * move a text offset over a cluster. A cluster groups one or more characters.
   * A cluster is undivisible, this means that a caret offset can not be placed
   * in the middle of a cluster.
   * 
   * @see org.eclipse.swt.graphics.TextLayout#getNextOffset(int, int)
   * @see org.eclipse.swt.graphics.TextLayout#getPreviousOffset(int, int)
   * @since 3.0
   */
  public static final int MOVEMENT_CLUSTER = 1 << 1;
  
  /**
   * The word movement type (value is 1&lt;&lt;2). This constant is used to move
   * a text offset over a word. The behavior of this constant depends on the
   * platform and on the direction of the movement. For example, on Windows the
   * stop is always at the start of the word. On GTK and Mac the stop is at the
   * end of the word if the direction is next and at the start of the word if
   * the direction is previous.
   * 
   * @see org.eclipse.swt.graphics.TextLayout#getNextOffset(int, int)
   * @see org.eclipse.swt.graphics.TextLayout#getPreviousOffset(int, int)
   * @since 3.0
   */
  public static final int MOVEMENT_WORD = 1 << 2;
  
  /**
   * The word end movement type (value is 1&lt;&lt;3). This constant is used to
   * move a text offset to the next or previous word end. The behavior of this
   * constant does not depend on the platform.
   * 
   * @see org.eclipse.swt.graphics.TextLayout#getNextOffset(int, int)
   * @see org.eclipse.swt.graphics.TextLayout#getPreviousOffset(int, int)
   * @since 3.3
   */
  public static final int MOVEMENT_WORD_END = 1 << 3;
  
  /**
   * The word start movement type (value is 1&lt;&lt;4). This constant is used
   * to move a text offset to the next or previous word start. The behavior of
   * this constant does not depend on the platform.
   * 
   * @see org.eclipse.swt.graphics.TextLayout#getNextOffset(int, int)
   * @see org.eclipse.swt.graphics.TextLayout#getPreviousOffset(int, int)
   * @since 3.3
   */
  public static final int MOVEMENT_WORD_START = 1 << 4;
  
  /**
   * Even odd rule for filling operations (value is 1).
   * 
   * @since 3.1
   */
  public static final int FILL_EVEN_ODD = 1;
  
  /**
   * Winding rule for filling operations (value is 2).
   * 
   * @since 3.1
   */
  public static final int FILL_WINDING = 2;
  
  /**
   * Constants to indicate line scrolling (value is 1).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>Control</code></li>
   * </ul>
   * 
   * @since 3.1
   */
  public static final int SCROLL_LINE = 1;
  
  /**
   * Constants to indicate page scrolling (value is 2).
   * <p>
   * <b>Used By:</b>
   * </p>
   * <ul>
   * <li><code>Control</code></li>
   * </ul>
   * 
   * @since 3.1
   */
  public static final int SCROLL_PAGE = 2;
  
  /**
   * The measure item event type (value is 41).
   * 
   * @see org.eclipse.swt.widgets.Widget#addListener
   * @see org.eclipse.swt.widgets.Display#addFilter
   * @see org.eclipse.swt.widgets.Event
   * @since 3.2
   */
  public static final int MeasureItem = 41;
  
  //ENDRAP

}
