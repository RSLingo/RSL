/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.BusinessEntity;
import rslingo.rsl.rsl.BusinessEntityType;
import rslingo.rsl.rsl.DetailBEntity;
import rslingo.rsl.rsl.MasterBEntity;
import rslingo.rsl.rsl.ReferenceBEntity;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.BusinessEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.BusinessEntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.BusinessEntityImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.BusinessEntityImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.BusinessEntityImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.BusinessEntityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.BusinessEntityImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessEntityImpl extends MinimalEObjectImpl.Container implements BusinessEntity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final BusinessEntityType TYPE_EDEFAULT = BusinessEntityType.VERY_SIMPLE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected BusinessEntityType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected static final String NAME_ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected String nameAlias = NAME_ALIAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getMaster() <em>Master</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaster()
   * @generated
   * @ordered
   */
  protected MasterBEntity master;

  /**
   * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetail()
   * @generated
   * @ordered
   */
  protected DetailBEntity detail;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected ReferenceBEntity reference;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessEntityImpl()
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
    return RslPackage.Literals.BUSINESS_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessEntityType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(BusinessEntityType newType)
  {
    BusinessEntityType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameAlias()
  {
    return nameAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameAlias(String newNameAlias)
  {
    String oldNameAlias = nameAlias;
    nameAlias = newNameAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MasterBEntity getMaster()
  {
    return master;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaster(MasterBEntity newMaster, NotificationChain msgs)
  {
    MasterBEntity oldMaster = master;
    master = newMaster;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__MASTER, oldMaster, newMaster);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaster(MasterBEntity newMaster)
  {
    if (newMaster != master)
    {
      NotificationChain msgs = null;
      if (master != null)
        msgs = ((InternalEObject)master).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.BUSINESS_ENTITY__MASTER, null, msgs);
      if (newMaster != null)
        msgs = ((InternalEObject)newMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.BUSINESS_ENTITY__MASTER, null, msgs);
      msgs = basicSetMaster(newMaster, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__MASTER, newMaster, newMaster));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailBEntity getDetail()
  {
    return detail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDetail(DetailBEntity newDetail, NotificationChain msgs)
  {
    DetailBEntity oldDetail = detail;
    detail = newDetail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__DETAIL, oldDetail, newDetail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetail(DetailBEntity newDetail)
  {
    if (newDetail != detail)
    {
      NotificationChain msgs = null;
      if (detail != null)
        msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.BUSINESS_ENTITY__DETAIL, null, msgs);
      if (newDetail != null)
        msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.BUSINESS_ENTITY__DETAIL, null, msgs);
      msgs = basicSetDetail(newDetail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__DETAIL, newDetail, newDetail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceBEntity getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReference(ReferenceBEntity newReference, NotificationChain msgs)
  {
    ReferenceBEntity oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__REFERENCE, oldReference, newReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(ReferenceBEntity newReference)
  {
    if (newReference != reference)
    {
      NotificationChain msgs = null;
      if (reference != null)
        msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.BUSINESS_ENTITY__REFERENCE, null, msgs);
      if (newReference != null)
        msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.BUSINESS_ENTITY__REFERENCE, null, msgs);
      msgs = basicSetReference(newReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__REFERENCE, newReference, newReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.BUSINESS_ENTITY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RslPackage.BUSINESS_ENTITY__MASTER:
        return basicSetMaster(null, msgs);
      case RslPackage.BUSINESS_ENTITY__DETAIL:
        return basicSetDetail(null, msgs);
      case RslPackage.BUSINESS_ENTITY__REFERENCE:
        return basicSetReference(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RslPackage.BUSINESS_ENTITY__NAME:
        return getName();
      case RslPackage.BUSINESS_ENTITY__TYPE:
        return getType();
      case RslPackage.BUSINESS_ENTITY__NAME_ALIAS:
        return getNameAlias();
      case RslPackage.BUSINESS_ENTITY__MASTER:
        return getMaster();
      case RslPackage.BUSINESS_ENTITY__DETAIL:
        return getDetail();
      case RslPackage.BUSINESS_ENTITY__REFERENCE:
        return getReference();
      case RslPackage.BUSINESS_ENTITY__DESCRIPTION:
        return getDescription();
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
      case RslPackage.BUSINESS_ENTITY__NAME:
        setName((String)newValue);
        return;
      case RslPackage.BUSINESS_ENTITY__TYPE:
        setType((BusinessEntityType)newValue);
        return;
      case RslPackage.BUSINESS_ENTITY__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RslPackage.BUSINESS_ENTITY__MASTER:
        setMaster((MasterBEntity)newValue);
        return;
      case RslPackage.BUSINESS_ENTITY__DETAIL:
        setDetail((DetailBEntity)newValue);
        return;
      case RslPackage.BUSINESS_ENTITY__REFERENCE:
        setReference((ReferenceBEntity)newValue);
        return;
      case RslPackage.BUSINESS_ENTITY__DESCRIPTION:
        setDescription((String)newValue);
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
      case RslPackage.BUSINESS_ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.BUSINESS_ENTITY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.BUSINESS_ENTITY__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RslPackage.BUSINESS_ENTITY__MASTER:
        setMaster((MasterBEntity)null);
        return;
      case RslPackage.BUSINESS_ENTITY__DETAIL:
        setDetail((DetailBEntity)null);
        return;
      case RslPackage.BUSINESS_ENTITY__REFERENCE:
        setReference((ReferenceBEntity)null);
        return;
      case RslPackage.BUSINESS_ENTITY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case RslPackage.BUSINESS_ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.BUSINESS_ENTITY__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.BUSINESS_ENTITY__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RslPackage.BUSINESS_ENTITY__MASTER:
        return master != null;
      case RslPackage.BUSINESS_ENTITY__DETAIL:
        return detail != null;
      case RslPackage.BUSINESS_ENTITY__REFERENCE:
        return reference != null;
      case RslPackage.BUSINESS_ENTITY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", nameAlias: ");
    result.append(nameAlias);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //BusinessEntityImpl
