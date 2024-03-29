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
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * e.g.
 * 
 * data/files/a3/69/a3694f32-00a1-4c65-b4b5-d825994c3cc9
 * 
 * 
 */
public class ja_FileDocument_path extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __obj_FileDocument;
	private system.proxies.FileDocument obj_FileDocument;

	public ja_FileDocument_path(IContext context, IMendixObject obj_FileDocument)
	{
		super(context);
		this.__obj_FileDocument = obj_FileDocument;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.obj_FileDocument = __obj_FileDocument == null ? null : system.proxies.FileDocument.initialize(getContext(), __obj_FileDocument);

		// BEGIN USER CODE
		String __UUID__=obj_FileDocument.getMendixObject().getValue(getContext(),"__UUID__");
		if(
			__UUID__!=null
		){
			return
				"data"+com.mendix.core.Core.getConfiguration().getFileSeparator()+
				"files"+com.mendix.core.Core.getConfiguration().getFileSeparator()+
				__UUID__.substring(0,2)+com.mendix.core.Core.getConfiguration().getFileSeparator()+
				__UUID__.substring(2,2)+com.mendix.core.Core.getConfiguration().getFileSeparator()+
				__UUID__;
		}else{
			return null;
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_FileDocument_path";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
