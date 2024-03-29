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
 * executes java.util.concurrent.ExecutorService stored in mxutil.Schedule.hasmap identified by tpstid
 * returns true on success
 */
public class tpts_exec extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String tptsid;

	public tpts_exec(IContext context, java.lang.String tptsid)
	{
		super(context);
		this.tptsid = tptsid;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return false;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "tpts_exec";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
