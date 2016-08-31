/**
 */
package rslingo.rsl.rsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.UCExtensionPoint;
import rslingo.rsl.rsl.UCExtensionPoints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC Extension Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.UCExtensionPointsImpl#getExtensionPoints <em>Extension Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UCExtensionPointsImpl extends MinimalEObjectImpl.Container implements UCExtensionPoints
{
  /**
   * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionPoints()
   * @generated
   * @ordered
   */
  protected EList<UCExtensionPoint> extensionPoints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UCExtensionPointsImpl()
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
    return RslPackage.Literals.UC_EXTENSION_POINTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UCExtensionPoint> getExtensionPoints()
  {
    if (extensionPoints == null)
    {
      extensionPoints = new EObjectContainmentEList<UCExtensionPoint>(UCExtensionPoint.class, this, RslPackage.UC_EXTENSION_POINTS__EXTENSION_POINTS);
    }
    return extensionPoints;
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
      case RslPackage.UC_EXTENSION_POINTS__EXTENSION_POINTS:
        return ((InternalEList<?>)getExtensionPoints()).basicRemove(otherEnd, msgs);
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
      case RslPackage.UC_EXTENSION_POINTS__EXTENSION_POINTS:
        return getExtensionPoints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RslPackage.UC_EXTENSION_POINTS__EXTENSION_POINTS:
        getExtensionPoints().clear();
        getExtensionPoints().addAll((Collection<? extends UCExtensionPoint>)newValue);
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
      case RslPackage.UC_EXTENSION_POINTS__EXTENSION_POINTS:
        getExtensionPoints().clear();
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
      case RslPackage.UC_EXTENSION_POINTS__EXTENSION_POINTS:
        return extensionPoints != null && !extensionPoints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UCExtensionPointsImpl
