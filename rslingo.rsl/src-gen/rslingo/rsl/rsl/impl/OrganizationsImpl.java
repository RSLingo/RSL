/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.Organizations;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organizations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.OrganizationsImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.OrganizationsImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.OrganizationsImpl#getPartners <em>Partners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationsImpl extends MinimalEObjectImpl.Container implements Organizations
{
  /**
   * The default value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomer()
   * @generated
   * @ordered
   */
  protected static final String CUSTOMER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomer()
   * @generated
   * @ordered
   */
  protected String customer = CUSTOMER_EDEFAULT;

  /**
   * The default value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupplier()
   * @generated
   * @ordered
   */
  protected static final String SUPPLIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupplier()
   * @generated
   * @ordered
   */
  protected String supplier = SUPPLIER_EDEFAULT;

  /**
   * The default value of the '{@link #getPartners() <em>Partners</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartners()
   * @generated
   * @ordered
   */
  protected static final String PARTNERS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartners() <em>Partners</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartners()
   * @generated
   * @ordered
   */
  protected String partners = PARTNERS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganizationsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RslPackage.Literals.ORGANIZATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCustomer()
  {
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomer(String newCustomer)
  {
    String oldCustomer = customer;
    customer = newCustomer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ORGANIZATIONS__CUSTOMER, oldCustomer, customer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSupplier()
  {
    return supplier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupplier(String newSupplier)
  {
    String oldSupplier = supplier;
    supplier = newSupplier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ORGANIZATIONS__SUPPLIER, oldSupplier, supplier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPartners()
  {
    return partners;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartners(String newPartners)
  {
    String oldPartners = partners;
    partners = newPartners;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ORGANIZATIONS__PARTNERS, oldPartners, partners));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RslPackage.ORGANIZATIONS__CUSTOMER:
        return getCustomer();
      case RslPackage.ORGANIZATIONS__SUPPLIER:
        return getSupplier();
      case RslPackage.ORGANIZATIONS__PARTNERS:
        return getPartners();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RslPackage.ORGANIZATIONS__CUSTOMER:
        setCustomer((String)newValue);
        return;
      case RslPackage.ORGANIZATIONS__SUPPLIER:
        setSupplier((String)newValue);
        return;
      case RslPackage.ORGANIZATIONS__PARTNERS:
        setPartners((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RslPackage.ORGANIZATIONS__CUSTOMER:
        setCustomer(CUSTOMER_EDEFAULT);
        return;
      case RslPackage.ORGANIZATIONS__SUPPLIER:
        setSupplier(SUPPLIER_EDEFAULT);
        return;
      case RslPackage.ORGANIZATIONS__PARTNERS:
        setPartners(PARTNERS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RslPackage.ORGANIZATIONS__CUSTOMER:
        return CUSTOMER_EDEFAULT == null ? customer != null : !CUSTOMER_EDEFAULT.equals(customer);
      case RslPackage.ORGANIZATIONS__SUPPLIER:
        return SUPPLIER_EDEFAULT == null ? supplier != null : !SUPPLIER_EDEFAULT.equals(supplier);
      case RslPackage.ORGANIZATIONS__PARTNERS:
        return PARTNERS_EDEFAULT == null ? partners != null : !PARTNERS_EDEFAULT.equals(partners);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (customer: ");
    result.append(customer);
    result.append(", supplier: ");
    result.append(supplier);
    result.append(", partners: ");
    result.append(partners);
    result.append(')');
    return result.toString();
  }

} //OrganizationsImpl
