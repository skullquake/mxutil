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
 * com.jayway.jsonpath.JsonPath implementation
 * use this to make json-path queries on a json string
 */
public class ja_jsonpath extends CustomJavaAction<java.lang.String>
{
	private java.lang.String str_json;
	private java.lang.String str_query;

	public ja_jsonpath(IContext context, java.lang.String str_json, java.lang.String str_query)
	{
		super(context);
		this.str_json = str_json;
		this.str_query = str_query;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_jsonpath";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}