/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.Check;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.CheckImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.CheckImpl#getCheckExpression <em>Check Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckImpl extends MinimalEObjectImpl.Container implements Check
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
   * The default value of the '{@link #getCheckExpression() <em>Check Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckExpression()
   * @generated
   * @ordered
   */
  protected static final String CHECK_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCheckExpression() <em>Check Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckExpression()
   * @generated
   * @ordered
   */
  protected String checkExpression = CHECK_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckImpl()
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
    return RslPackage.Literals.CHECK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.CHECK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCheckExpression()
  {
    return checkExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckExpression(String newCheckExpression)
  {
    String oldCheckExpression = checkExpression;
    checkExpression = newCheckExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.CHECK__CHECK_EXPRESSION, oldCheckExpression, checkExpression));
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
      case RslPackage.CHECK__NAME:
        return getName();
      case RslPackage.CHECK__CHECK_EXPRESSION:
        return getCheckExpression();
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
      case RslPackage.CHECK__NAME:
        setName((String)newValue);
        return;
      case RslPackage.CHECK__CHECK_EXPRESSION:
        setCheckExpression((String)newValue);
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
      case RslPackage.CHECK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.CHECK__CHECK_EXPRESSION:
        setCheckExpression(CHECK_EXPRESSION_EDEFAULT);
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
      case RslPackage.CHECK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.CHECK__CHECK_EXPRESSION:
        return CHECK_EXPRESSION_EDEFAULT == null ? checkExpression != null : !CHECK_EXPRESSION_EDEFAULT.equals(checkExpression);
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
    result.append(", checkExpression: ");
    result.append(checkExpression);
    result.append(')');
    return result.toString();
  }

} //CheckImpl
