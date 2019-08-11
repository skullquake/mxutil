// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxutil.proxies;

public class product
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxUtil.product";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		orderdate("orderdate"),
		article("article"),
		number("number"),
		price("price"),
		color("color"),
		grossweight("grossweight"),
		netweight("netweight"),
		packaging("packaging"),
		sellby("sellby"),
		useby("useby"),
		memo("memo"),
		product_person("MxUtil.product_person");

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

	public product(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxUtil.product"));
	}

	protected product(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject)
	{
		if (productMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxUtil.product", productMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxUtil.product");

		this.productMendixObject = productMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'product.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxutil.proxies.product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxutil.proxies.product.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxutil.proxies.product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxutil.proxies.product(context, mendixObject);
	}

	public static mxutil.proxies.product load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxutil.proxies.product.initialize(context, mendixObject);
	}

	public static java.util.List<mxutil.proxies.product> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxutil.proxies.product> result = new java.util.ArrayList<mxutil.proxies.product>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxUtil.product" + xpathConstraint))
			result.add(mxutil.proxies.product.initialize(context, obj));
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
	 * @return value of orderdate
	 */
	public final java.lang.String getorderdate()
	{
		return getorderdate(getContext());
	}

	/**
	 * @param context
	 * @return value of orderdate
	 */
	public final java.lang.String getorderdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.orderdate.toString());
	}

	/**
	 * Set value of orderdate
	 * @param orderdate
	 */
	public final void setorderdate(java.lang.String orderdate)
	{
		setorderdate(getContext(), orderdate);
	}

	/**
	 * Set value of orderdate
	 * @param context
	 * @param orderdate
	 */
	public final void setorderdate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String orderdate)
	{
		getMendixObject().setValue(context, MemberNames.orderdate.toString(), orderdate);
	}

	/**
	 * @return value of article
	 */
	public final java.lang.String getarticle()
	{
		return getarticle(getContext());
	}

	/**
	 * @param context
	 * @return value of article
	 */
	public final java.lang.String getarticle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.article.toString());
	}

	/**
	 * Set value of article
	 * @param article
	 */
	public final void setarticle(java.lang.String article)
	{
		setarticle(getContext(), article);
	}

	/**
	 * Set value of article
	 * @param context
	 * @param article
	 */
	public final void setarticle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String article)
	{
		getMendixObject().setValue(context, MemberNames.article.toString(), article);
	}

	/**
	 * @return value of number
	 */
	public final java.lang.String getnumber()
	{
		return getnumber(getContext());
	}

	/**
	 * @param context
	 * @return value of number
	 */
	public final java.lang.String getnumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.number.toString());
	}

	/**
	 * Set value of number
	 * @param number
	 */
	public final void setnumber(java.lang.String number)
	{
		setnumber(getContext(), number);
	}

	/**
	 * Set value of number
	 * @param context
	 * @param number
	 */
	public final void setnumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String number)
	{
		getMendixObject().setValue(context, MemberNames.number.toString(), number);
	}

	/**
	 * @return value of price
	 */
	public final java.lang.String getprice()
	{
		return getprice(getContext());
	}

	/**
	 * @param context
	 * @return value of price
	 */
	public final java.lang.String getprice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.price.toString());
	}

	/**
	 * Set value of price
	 * @param price
	 */
	public final void setprice(java.lang.String price)
	{
		setprice(getContext(), price);
	}

	/**
	 * Set value of price
	 * @param context
	 * @param price
	 */
	public final void setprice(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String price)
	{
		getMendixObject().setValue(context, MemberNames.price.toString(), price);
	}

	/**
	 * @return value of color
	 */
	public final java.lang.String getcolor()
	{
		return getcolor(getContext());
	}

	/**
	 * @param context
	 * @return value of color
	 */
	public final java.lang.String getcolor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.color.toString());
	}

	/**
	 * Set value of color
	 * @param color
	 */
	public final void setcolor(java.lang.String color)
	{
		setcolor(getContext(), color);
	}

	/**
	 * Set value of color
	 * @param context
	 * @param color
	 */
	public final void setcolor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String color)
	{
		getMendixObject().setValue(context, MemberNames.color.toString(), color);
	}

	/**
	 * @return value of grossweight
	 */
	public final java.lang.String getgrossweight()
	{
		return getgrossweight(getContext());
	}

	/**
	 * @param context
	 * @return value of grossweight
	 */
	public final java.lang.String getgrossweight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.grossweight.toString());
	}

	/**
	 * Set value of grossweight
	 * @param grossweight
	 */
	public final void setgrossweight(java.lang.String grossweight)
	{
		setgrossweight(getContext(), grossweight);
	}

	/**
	 * Set value of grossweight
	 * @param context
	 * @param grossweight
	 */
	public final void setgrossweight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String grossweight)
	{
		getMendixObject().setValue(context, MemberNames.grossweight.toString(), grossweight);
	}

	/**
	 * @return value of netweight
	 */
	public final java.lang.String getnetweight()
	{
		return getnetweight(getContext());
	}

	/**
	 * @param context
	 * @return value of netweight
	 */
	public final java.lang.String getnetweight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.netweight.toString());
	}

	/**
	 * Set value of netweight
	 * @param netweight
	 */
	public final void setnetweight(java.lang.String netweight)
	{
		setnetweight(getContext(), netweight);
	}

	/**
	 * Set value of netweight
	 * @param context
	 * @param netweight
	 */
	public final void setnetweight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String netweight)
	{
		getMendixObject().setValue(context, MemberNames.netweight.toString(), netweight);
	}

	/**
	 * @return value of packaging
	 */
	public final java.lang.String getpackaging()
	{
		return getpackaging(getContext());
	}

	/**
	 * @param context
	 * @return value of packaging
	 */
	public final java.lang.String getpackaging(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.packaging.toString());
	}

	/**
	 * Set value of packaging
	 * @param packaging
	 */
	public final void setpackaging(java.lang.String packaging)
	{
		setpackaging(getContext(), packaging);
	}

	/**
	 * Set value of packaging
	 * @param context
	 * @param packaging
	 */
	public final void setpackaging(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String packaging)
	{
		getMendixObject().setValue(context, MemberNames.packaging.toString(), packaging);
	}

	/**
	 * @return value of sellby
	 */
	public final java.lang.String getsellby()
	{
		return getsellby(getContext());
	}

	/**
	 * @param context
	 * @return value of sellby
	 */
	public final java.lang.String getsellby(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.sellby.toString());
	}

	/**
	 * Set value of sellby
	 * @param sellby
	 */
	public final void setsellby(java.lang.String sellby)
	{
		setsellby(getContext(), sellby);
	}

	/**
	 * Set value of sellby
	 * @param context
	 * @param sellby
	 */
	public final void setsellby(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sellby)
	{
		getMendixObject().setValue(context, MemberNames.sellby.toString(), sellby);
	}

	/**
	 * @return value of useby
	 */
	public final java.lang.String getuseby()
	{
		return getuseby(getContext());
	}

	/**
	 * @param context
	 * @return value of useby
	 */
	public final java.lang.String getuseby(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.useby.toString());
	}

	/**
	 * Set value of useby
	 * @param useby
	 */
	public final void setuseby(java.lang.String useby)
	{
		setuseby(getContext(), useby);
	}

	/**
	 * Set value of useby
	 * @param context
	 * @param useby
	 */
	public final void setuseby(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String useby)
	{
		getMendixObject().setValue(context, MemberNames.useby.toString(), useby);
	}

	/**
	 * @return value of memo
	 */
	public final java.lang.String getmemo()
	{
		return getmemo(getContext());
	}

	/**
	 * @param context
	 * @return value of memo
	 */
	public final java.lang.String getmemo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.memo.toString());
	}

	/**
	 * Set value of memo
	 * @param memo
	 */
	public final void setmemo(java.lang.String memo)
	{
		setmemo(getContext(), memo);
	}

	/**
	 * Set value of memo
	 * @param context
	 * @param memo
	 */
	public final void setmemo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String memo)
	{
		getMendixObject().setValue(context, MemberNames.memo.toString(), memo);
	}

	/**
	 * @return value of product_person
	 */
	public final mxutil.proxies.person getproduct_person() throws com.mendix.core.CoreException
	{
		return getproduct_person(getContext());
	}

	/**
	 * @param context
	 * @return value of product_person
	 */
	public final mxutil.proxies.person getproduct_person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxutil.proxies.person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.product_person.toString());
		if (identifier != null)
			result = mxutil.proxies.person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of product_person
	 * @param product_person
	 */
	public final void setproduct_person(mxutil.proxies.person product_person)
	{
		setproduct_person(getContext(), product_person);
	}

	/**
	 * Set value of product_person
	 * @param context
	 * @param product_person
	 */
	public final void setproduct_person(com.mendix.systemwideinterfaces.core.IContext context, mxutil.proxies.person product_person)
	{
		if (product_person == null)
			getMendixObject().setValue(context, MemberNames.product_person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.product_person.toString(), product_person.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productMendixObject;
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
			final mxutil.proxies.product that = (mxutil.proxies.product) obj;
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
		return "MxUtil.product";
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
