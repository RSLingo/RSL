/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.SystemRelation;
import rslingo.rsl.rsl.SystemRelationCategory;
import rslingo.rsl.rsl.SystemRelationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemRelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemRelationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SystemRelationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRelationImpl extends MinimalEObjectImpl.Container implements SystemRelation
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
  protected static final SystemRelationType TYPE_EDEFAULT = SystemRelationType.IN;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SystemRelationType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected rslingo.rsl.rsl.System source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected rslingo.rsl.rsl.System target;

  /**
   * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected static final SystemRelationCategory CATEGORY_EDEFAULT = SystemRelationCategory.IMPORT;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected SystemRelationCategory category = CATEGORY_EDEFAULT;

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
  protected SystemRelationImpl()
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
    return RslPackage.Literals.SYSTEM_RELATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM_RELATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemRelationType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(SystemRelationType newType)
  {
    SystemRelationType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM_RELATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rsl.rsl.System getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (rslingo.rsl.rsl.System)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.SYSTEM_RELATION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rsl.rsl.System basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(rslingo.rsl.rsl.System newSource)
  {
    rslingo.rsl.rsl.System oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM_RELATION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rsl.rsl.System getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (rslingo.rsl.rsl.System)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.SYSTEM_RELATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rsl.rsl.System basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(rslingo.rsl.rsl.System newTarget)
  {
    rslingo.rsl.rsl.System oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM_RELATION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemRelationCategory getCategory()
  {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(SystemRelationCategory newCategory)
  {
    SystemRelationCategory oldCategory = category;
    category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM_RELATION__CATEGORY, oldCategory, category));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SYSTEM_RELATION__DESCRIPTION, oldDescription, description));
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
      case RslPackage.SYSTEM_RELATION__NAME:
        return getName();
      case RslPackage.SYSTEM_RELATION__TYPE:
        return getType();
      case RslPackage.SYSTEM_RELATION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case RslPackage.SYSTEM_RELATION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case RslPackage.SYSTEM_RELATION__CATEGORY:
        return getCategory();
      case RslPackage.SYSTEM_RELATION__DESCRIPTION:
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
      case RslPackage.SYSTEM_RELATION__NAME:
        setName((String)newValue);
        return;
      case RslPackage.SYSTEM_RELATION__TYPE:
        setType((SystemRelationType)newValue);
        return;
      case RslPackage.SYSTEM_RELATION__SOURCE:
        setSource((rslingo.rsl.rsl.System)newValue);
        return;
      case RslPackage.SYSTEM_RELATION__TARGET:
        setTarget((rslingo.rsl.rsl.System)newValue);
        return;
      case RslPackage.SYSTEM_RELATION__CATEGORY:
        setCategory((SystemRelationCategory)newValue);
        return;
      case RslPackage.SYSTEM_RELATION__DESCRIPTION:
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
      case RslPackage.SYSTEM_RELATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.SYSTEM_RELATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.SYSTEM_RELATION__SOURCE:
        setSource((rslingo.rsl.rsl.System)null);
        return;
      case RslPackage.SYSTEM_RELATION__TARGET:
        setTarget((rslingo.rsl.rsl.System)null);
        return;
      case RslPackage.SYSTEM_RELATION__CATEGORY:
        setCategory(CATEGORY_EDEFAULT);
        return;
      case RslPackage.SYSTEM_RELATION__DESCRIPTION:
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
      case RslPackage.SYSTEM_RELATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.SYSTEM_RELATION__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.SYSTEM_RELATION__SOURCE:
        return source != null;
      case RslPackage.SYSTEM_RELATION__TARGET:
        return target != null;
      case RslPackage.SYSTEM_RELATION__CATEGORY:
        return category != CATEGORY_EDEFAULT;
      case RslPackage.SYSTEM_RELATION__DESCRIPTION:
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
    result.append(", category: ");
    result.append(category);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //SystemRelationImpl
