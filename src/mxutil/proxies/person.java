// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxutil.proxies;

public class person
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject personMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxUtil.person";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		role("role"),
		name("name"),
		address("address"),
		zipcode("zipcode"),
		city("city"),
		phone("phone"),
		person_file("MxUtil.person_file");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public person(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxUtil.person"));
	}

	protected person(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject personMendixObject)
	{
		if (personMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxUtil.person", personMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxUtil.person");

		this.personMendixObject = personMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'person.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxutil.proxies.person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxutil.proxies.person.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxutil.proxies.person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxutil.proxies.person(context, mendixObject);
	}

	public static mxutil.proxies.person load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxutil.proxies.person.initialize(context, mendixObject);
	}

	public static java.util.List<mxutil.proxies.person> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxutil.proxies.person> result = new java.util.ArrayList<mxutil.proxies.person>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxUtil.person" + xpathConstraint))
			result.add(mxutil.proxies.person.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of role
	 */
	public final java.lang.String getrole()
	{
		return getrole(getContext());
	}

	/**
	 * @param context
	 * @return value of role
	 */
	public final java.lang.String getrole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.role.toString());
	}

	/**
	 * Set value of role
	 * @param role
	 */
	public final void setrole(java.lang.String role)
	{
		setrole(getContext(), role);
	}

	/**
	 * Set value of role
	 * @param context
	 * @param role
	 */
	public final void setrole(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String role)
	{
		getMendixObject().setValue(context, MemberNames.role.toString(), role);
	}

	/**
	 * @return value of name
	 */
	public final java.lang.String getname()
	{
		return getname(getContext());
	}

	/**
	 * @param context
	 * @return value of name
	 */
	public final java.lang.String getname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.name.toString());
	}

	/**
	 * Set value of name
	 * @param name
	 */
	public final void setname(java.lang.String name)
	{
		setname(getContext(), name);
	}

	/**
	 * Set value of name
	 * @param context
	 * @param name
	 */
	public final void setname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.name.toString(), name);
	}

	/**
	 * @return value of address
	 */
	public final java.lang.String getaddress()
	{
		return getaddress(getContext());
	}

	/**
	 * @param context
	 * @return value of address
	 */
	public final java.lang.String getaddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.address.toString());
	}

	/**
	 * Set value of address
	 * @param address
	 */
	public final void setaddress(java.lang.String address)
	{
		setaddress(getContext(), address);
	}

	/**
	 * Set value of address
	 * @param context
	 * @param address
	 */
	public final void setaddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.address.toString(), address);
	}

	/**
	 * @return value of zipcode
	 */
	public final java.lang.String getzipcode()
	{
		return getzipcode(getContext());
	}

	/**
	 * @param context
	 * @return value of zipcode
	 */
	public final java.lang.String getzipcode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.zipcode.toString());
	}

	/**
	 * Set value of zipcode
	 * @param zipcode
	 */
	public final void setzipcode(java.lang.String zipcode)
	{
		setzipcode(getContext(), zipcode);
	}

	/**
	 * Set value of zipcode
	 * @param context
	 * @param zipcode
	 */
	public final void setzipcode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String zipcode)
	{
		getMendixObject().setValue(context, MemberNames.zipcode.toString(), zipcode);
	}

	/**
	 * @return value of city
	 */
	public final java.lang.String getcity()
	{
		return getcity(getContext());
	}

	/**
	 * @param context
	 * @return value of city
	 */
	public final java.lang.String getcity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.city.toString());
	}

	/**
	 * Set value of city
	 * @param city
	 */
	public final void setcity(java.lang.String city)
	{
		setcity(getContext(), city);
	}

	/**
	 * Set value of city
	 * @param context
	 * @param city
	 */
	public final void setcity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String city)
	{
		getMendixObject().setValue(context, MemberNames.city.toString(), city);
	}

	/**
	 * @return value of phone
	 */
	public final java.lang.String getphone()
	{
		return getphone(getContext());
	}

	/**
	 * @param context
	 * @return value of phone
	 */
	public final java.lang.String getphone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.phone.toString());
	}

	/**
	 * Set value of phone
	 * @param phone
	 */
	public final void setphone(java.lang.String phone)
	{
		setphone(getContext(), phone);
	}

	/**
	 * Set value of phone
	 * @param context
	 * @param phone
	 */
	public final void setphone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phone)
	{
		getMendixObject().setValue(context, MemberNames.phone.toString(), phone);
	}

	/**
	 * @return value of person_file
	 */
	public final mxutil.proxies.file getperson_file() throws com.mendix.core.CoreException
	{
		return getperson_file(getContext());
	}

	/**
	 * @param context
	 * @return value of person_file
	 */
	public final mxutil.proxies.file getperson_file(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxutil.proxies.file result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.person_file.toString());
		if (identifier != null)
			result = mxutil.proxies.file.load(context, identifier);
		return result;
	}

	/**
	 * Set value of person_file
	 * @param person_file
	 */
	public final void setperson_file(mxutil.proxies.file person_file)
	{
		setperson_file(getContext(), person_file);
	}

	/**
	 * Set value of person_file
	 * @param context
	 * @param person_file
	 */
	public final void setperson_file(com.mendix.systemwideinterfaces.core.IContext context, mxutil.proxies.file person_file)
	{
		if (person_file == null)
			getMendixObject().setValue(context, MemberNames.person_file.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.person_file.toString(), person_file.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return personMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxutil.proxies.person that = (mxutil.proxies.person) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MxUtil.person";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
