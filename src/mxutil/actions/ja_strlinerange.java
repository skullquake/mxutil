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
 * for parameter v a string with line seperators \r\n or \n
 * return range of lines from s to e
 */
public class ja_strlinerange extends CustomJavaAction<java.lang.String>
{
	private java.lang.Long s;
	private java.lang.Long e;
	private java.lang.String v;

	public ja_strlinerange(IContext context, java.lang.Long s, java.lang.Long e, java.lang.String v)
	{
		super(context);
		this.s = s;
		this.e = e;
		this.v = v;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		java.lang.String[] lines=v.split("\\r?\\n");
		//java.lang.String[] _lines=java.util.Arrays.copyOfRange(lines, s, e);
		String[] subarray = subArray(lines,s.intValue(),e.intValue());
		return java.lang.String.join("\n",subarray);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_strlinerange";
	}

	// BEGIN EXTRA CODE
	public static<T> T[] subArray(T[] array, int beg, int end) {
		return java.util.Arrays.copyOfRange(array, beg, end + 1);
	}
	// END EXTRA CODE
}