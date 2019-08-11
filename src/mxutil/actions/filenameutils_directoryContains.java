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
 * directoryContains(String canonicalParent, String canonicalChild)
 * Concatenates a filename to a base path using normal command line style rules
 */
public class filenameutils_directoryContains extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String canonicalParent;
	private java.lang.String canonicalChild;

	public filenameutils_directoryContains(IContext context, java.lang.String canonicalParent, java.lang.String canonicalChild)
	{
		super(context);
		this.canonicalParent = canonicalParent;
		this.canonicalChild = canonicalChild;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return org.apache.commons.io.FilenameUtils.directoryContains(canonicalParent,canonicalChild);

		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "filenameutils_directoryContains";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
