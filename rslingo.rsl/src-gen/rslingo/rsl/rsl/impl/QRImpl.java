/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rslingo.rsl.rsl.Metric;
import rslingo.rsl.rsl.QR;
import rslingo.rsl.rsl.QRSubType;
import rslingo.rsl.rsl.QRType;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.QRImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.QRImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.QRImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.QRImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.QRImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QRImpl extends RequirementImpl implements QR
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final QRType TYPE_EDEFAULT = QRType.SECURITY;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QRType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected static final QRSubType SUB_TYPE_EDEFAULT = QRSubType.SECURITY_PRIVACY;

  /**
   * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected QRSubType subType = SUB_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected static final Metric METRIC_EDEFAULT = Metric.TIME_DAY;

  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected Metric metric = METRIC_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartOf()
   * @generated
   * @ordered
   */
  protected QR partOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QRImpl()
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
    return RslPackage.Literals.QR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QRType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QRType newType)
  {
    QRType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.QR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QRSubType getSubType()
  {
    return subType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubType(QRSubType newSubType)
  {
    QRSubType oldSubType = subType;
    subType = newSubType == null ? SUB_TYPE_EDEFAULT : newSubType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.QR__SUB_TYPE, oldSubType, subType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metric getMetric()
  {
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetric(Metric newMetric)
  {
    Metric oldMetric = metric;
    metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.QR__METRIC, oldMetric, metric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.QR__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR getPartOf()
  {
    if (partOf != null && partOf.eIsProxy())
    {
      InternalEObject oldPartOf = (InternalEObject)partOf;
      partOf = (QR)eResolveProxy(oldPartOf);
      if (partOf != oldPartOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.QR__PART_OF, oldPartOf, partOf));
      }
    }
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR basicGetPartOf()
  {
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartOf(QR newPartOf)
  {
    QR oldPartOf = partOf;
    partOf = newPartOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.QR__PART_OF, oldPartOf, partOf));
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
      case RslPackage.QR__TYPE:
        return getType();
      case RslPackage.QR__SUB_TYPE:
        return getSubType();
      case RslPackage.QR__METRIC:
        return getMetric();
      case RslPackage.QR__VALUE:
        return getValue();
      case RslPackage.QR__PART_OF:
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
      case RslPackage.QR__TYPE:
        setType((QRType)newValue);
        return;
      case RslPackage.QR__SUB_TYPE:
        setSubType((QRSubType)newValue);
        return;
      case RslPackage.QR__METRIC:
        setMetric((Metric)newValue);
        return;
      case RslPackage.QR__VALUE:
        setValue((Integer)newValue);
        return;
      case RslPackage.QR__PART_OF:
        setPartOf((QR)newValue);
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
      case RslPackage.QR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.QR__SUB_TYPE:
        setSubType(SUB_TYPE_EDEFAULT);
        return;
      case RslPackage.QR__METRIC:
        setMetric(METRIC_EDEFAULT);
        return;
      case RslPackage.QR__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case RslPackage.QR__PART_OF:
        setPartOf((QR)null);
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
      case RslPackage.QR__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.QR__SUB_TYPE:
        return subType != SUB_TYPE_EDEFAULT;
      case RslPackage.QR__METRIC:
        return metric != METRIC_EDEFAULT;
      case RslPackage.QR__VALUE:
        return value != VALUE_EDEFAULT;
      case RslPackage.QR__PART_OF:
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
    result.append(", metric: ");
    result.append(metric);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //QRImpl
