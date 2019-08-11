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
 * create a temp file
 * 
 * public static File createTempFile(String prefix, String suffix, File directory)
 */
public class ja_tempfile extends CustomJavaAction<java.lang.String>
{
	private java.lang.String str_prefix;
	private java.lang.String str_suffix;

	public ja_tempfile(IContext context, java.lang.String str_prefix, java.lang.String str_suffix)
	{
		super(context);
		this.str_prefix = str_prefix;
		this.str_suffix = str_suffix;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
			java.lang.String ret=null;
			try{
				java.io.File tempFile = java.io.File.createTempFile(str_prefix, str_suffix,null);//, new File("C:/"));
				com.mendix.core.Core.getLogger(this.toString()).info("Temp file created: " + tempFile.getAbsolutePath());
				ret=tempFile.getAbsolutePath();
			} catch (java.io.IOException e) {
				com.mendix.core.Core.getLogger(this.toString()).error(e.toString());
				ret=null;
			}
			return ret;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_tempfile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}