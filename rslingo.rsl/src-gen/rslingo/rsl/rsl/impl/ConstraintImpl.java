/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rslingo.rsl.rsl.Constraint;
import rslingo.rsl.rsl.ConstraintSubType;
import rslingo.rsl.rsl.ConstraintType;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.ConstraintImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ConstraintImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ConstraintImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends RequirementImpl implements Constraint
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ConstraintType TYPE_EDEFAULT = ConstraintType.CULTURAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ConstraintType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected static final ConstraintSubType SUB_TYPE_EDEFAULT = ConstraintSubType.CULTURAL_LANGUAGE;

  /**
   * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected ConstraintSubType subType = SUB_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartOf()
   * @generated
   * @ordered
   */
  protected Constraint partOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return RslPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ConstraintType newType)
  {
    ConstraintType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.CONSTRAINT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintSubType getSubType()
  {
    return subType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubType(ConstraintSubType newSubType)
  {
    ConstraintSubType oldSubType = subType;
    subType = newSubType == null ? SUB_TYPE_EDEFAULT : newSubType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.CONSTRAINT__SUB_TYPE, oldSubType, subType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint getPartOf()
  {
    if (partOf != null && partOf.eIsProxy())
    {
      InternalEObject oldPartOf = (InternalEObject)partOf;
      partOf = (Constraint)eResolveProxy(oldPartOf);
      if (partOf != oldPartOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.CONSTRAINT__PART_OF, oldPartOf, partOf));
      }
    }
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint basicGetPartOf()
  {
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartOf(Constraint newPartOf)
  {
    Constraint oldPartOf = partOf;
    partOf = newPartOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.CONSTRAINT__PART_OF, oldPartOf, partOf));
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
      case RslPackage.CONSTRAINT__TYPE:
        return getType();
      case RslPackage.CONSTRAINT__SUB_TYPE:
        return getSubType();
      case RslPackage.CONSTRAINT__PART_OF:
        if (resolve) return getPartOf();
        return basicGetPartOf();
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
      case RslPackage.CONSTRAINT__TYPE:
        setType((ConstraintType)newValue);
        return;
      case RslPackage.CONSTRAINT__SUB_TYPE:
        setSubType((ConstraintSubType)newValue);
        return;
      case RslPackage.CONSTRAINT__PART_OF:
        setPartOf((Constraint)newValue);
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
      case RslPackage.CONSTRAINT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.CONSTRAINT__SUB_TYPE:
        setSubType(SUB_TYPE_EDEFAULT);
        return;
      case RslPackage.CONSTRAINT__PART_OF:
        setPartOf((Constraint)null);
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
      case RslPackage.CONSTRAINT__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.CONSTRAINT__SUB_TYPE:
        return subType != SUB_TYPE_EDEFAULT;
      case RslPackage.CONSTRAINT__PART_OF:
        return partOf != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", subType: ");
    result.append(subType);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
