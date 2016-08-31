/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.RefSystem;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.SystemScope;
import rslingo.rsl.rsl.SystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemImpl#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemImpl#getReusableSystems <em>Reusable Systems</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements rslingo.rsl.rsl.System
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
  protected static final SystemType TYPE_EDEFAULT = SystemType.SYSTEM;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SystemType type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected static final SystemScope SCOPE_EDEFAULT = SystemScope.IN;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected SystemScope scope = SCOPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubSystems() <em>Sub Systems</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSystems()
   * @generated
   * @ordered
   */
  protected RefSystem subSystems;

  /**
   * The cached value of the '{@link #getReusableSystems() <em>Reusable Systems</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReusableSystems()
   * @generated
   * @ordered
   */
  protected RefSystem reusableSystems;

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
  protected SystemImpl()
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
    return RslPackage.Literals.SYSTEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(SystemType newType)
  {
    SystemType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemScope getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(SystemScope newScope)
  {
    SystemScope oldScope = scope;
    scope = newScope == null ? SCOPE_EDEFAULT : newScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__SCOPE, oldScope, scope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefSystem getSubSystems()
  {
    return subSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubSystems(RefSystem newSubSystems, NotificationChain msgs)
  {
    RefSystem oldSubSystems = subSystems;
    subSystems = newSubSystems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__SUB_SYSTEMS, oldSubSystems, newSubSystems);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubSystems(RefSystem newSubSystems)
  {
    if (newSubSystems != subSystems)
    {
      NotificationChain msgs = null;
      if (subSystems != null)
        msgs = ((InternalEObject)subSystems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.SYSTEM__SUB_SYSTEMS, null, msgs);
      if (newSubSystems != null)
        msgs = ((InternalEObject)newSubSystems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.SYSTEM__SUB_SYSTEMS, null, msgs);
      msgs = basicSetSubSystems(newSubSystems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__SUB_SYSTEMS, newSubSystems, newSubSystems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefSystem getReusableSystems()
  {
    return reusableSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReusableSystems(RefSystem newReusableSystems, NotificationChain msgs)
  {
    RefSystem oldReusableSystems = reusableSystems;
    reusableSystems = newReusableSystems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__REUSABLE_SYSTEMS, oldReusableSystems, newReusableSystems);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReusableSystems(RefSystem newReusableSystems)
  {
    if (newReusableSystems != reusableSystems)
    {
      NotificationChain msgs = null;
      if (reusableSystems != null)
        msgs = ((InternalEObject)reusableSystems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.SYSTEM__REUSABLE_SYSTEMS, null, msgs);
      if (newReusableSystems != null)
        msgs = ((InternalEObject)newReusableSystems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.SYSTEM__REUSABLE_SYSTEMS, null, msgs);
      msgs = basicSetReusableSystems(newReusableSystems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__REUSABLE_SYSTEMS, newReusableSystems, newReusableSystems));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM__DESCRIPTION, oldDescription, description));
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
      case RslPackage.SYSTEM__SUB_SYSTEMS:
        return basicSetSubSystems(null, msgs);
      case RslPackage.SYSTEM__REUSABLE_SYSTEMS:
        return basicSetReusableSystems(null, msgs);
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
      case RslPackage.SYSTEM__NAME:
        return getName();
      case RslPackage.SYSTEM__TYPE:
        return getType();
      case RslPackage.SYSTEM__NAME_ALIAS:
        return getNameAlias();
      case RslPackage.SYSTEM__SCOPE:
        return getScope();
      case RslPackage.SYSTEM__SUB_SYSTEMS:
        return getSubSystems();
      case RslPackage.SYSTEM__REUSABLE_SYSTEMS:
        return getReusableSystems();
      case RslPackage.SYSTEM__DESCRIPTION:
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
      case RslPackage.SYSTEM__NAME:
        setName((String)newValue);
        return;
      case RslPackage.SYSTEM__TYPE:
        setType((SystemType)newValue);
        return;
      case RslPackage.SYSTEM__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RslPackage.SYSTEM__SCOPE:
        setScope((SystemScope)newValue);
        return;
      case RslPackage.SYSTEM__SUB_SYSTEMS:
        setSubSystems((RefSystem)newValue);
        return;
      case RslPackage.SYSTEM__REUSABLE_SYSTEMS:
        setReusableSystems((RefSystem)newValue);
        return;
      case RslPackage.SYSTEM__DESCRIPTION:
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
      case RslPackage.SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.SYSTEM__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.SYSTEM__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RslPackage.SYSTEM__SCOPE:
        setScope(SCOPE_EDEFAULT);
        return;
      case RslPackage.SYSTEM__SUB_SYSTEMS:
        setSubSystems((RefSystem)null);
        return;
      case RslPackage.SYSTEM__REUSABLE_SYSTEMS:
        setReusableSystems((RefSystem)null);
        return;
      case RslPackage.SYSTEM__DESCRIPTION:
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
      case RslPackage.SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.SYSTEM__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.SYSTEM__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RslPackage.SYSTEM__SCOPE:
        return scope != SCOPE_EDEFAULT;
      case RslPackage.SYSTEM__SUB_SYSTEMS:
        return subSystems != null;
      case RslPackage.SYSTEM__REUSABLE_SYSTEMS:
        return reusableSystems != null;
      case RslPackage.SYSTEM__DESCRIPTION:
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
    result.append(", scope: ");
    result.append(scope);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
