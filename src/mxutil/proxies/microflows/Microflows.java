// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxutil.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MxUtil module
	public static void ivk_hostproc_exec(IContext context, imports.proxies.FileDocumentPreview _obj_fdp)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_fdp", _obj_fdp == null ? null : _obj_fdp.getMendixObject());
			Core.execute(context, "MxUtil.ivk_hostproc_exec", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_ja_strcsv2arrmxobj_test(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxUtil.ivk_ja_strcsv2arrmxobj_test", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String ivk_processBuilder(IContext context, java.util.List<styling.proxies.KV> _arr_kv, java.lang.String _str_cmd, java.lang.String _str_stdin)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_arr_kv = null;
			if (_arr_kv != null)
			{
				listparam_arr_kv = new java.util.ArrayList<IMendixObject>();
				for (styling.proxies.KV obj : _arr_kv)
					listparam_arr_kv.add(obj.getMendixObject());
			}
			params.put("arr_kv", listparam_arr_kv);
			params.put("str_cmd", _str_cmd);
			params.put("str_stdin", _str_stdin);
			return (java.lang.String)Core.execute(context, "MxUtil.ivk_processBuilder", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}