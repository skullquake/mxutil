// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxutil.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * static String 	getFullPath(String filename)
 * Gets the extension of a filename.
 */
public class filenameutils_getFullPath extends CustomJavaAction<java.lang.String>
{
	private java.lang.String filename;

	public filenameutils_getFullPath(IContext context, java.lang.String filename)
	{
		super(context);
		this.filename = filename;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return org.apache.commons.io.FilenameUtils.getFullPath(filename);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "filenameutils_getFullPath";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}