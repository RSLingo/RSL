/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.UCExtends;
import rslingo.rsl.rsl.UCExtensionPoint;
import rslingo.rsl.rsl.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC Extends</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.UCExtendsImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UCExtendsImpl#getExtensionPoint <em>Extension Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UCExtendsImpl extends MinimalEObjectImpl.Container implements UCExtends
{
  /**
   * The cached value of the '{@link #getUsecase() <em>Usecase</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsecase()
   * @generated
   * @ordered
   */
  protected UseCase usecase;

  /**
   * The cached value of the '{@link #getExtensionPoint() <em>Extension Point</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionPoint()
   * @generated
   * @ordered
   */
  protected UCExtensionPoint extensionPoint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UCExtendsImpl()
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
    return RslPackage.Literals.UC_EXTENDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase getUsecase()
  {
    if (usecase != null && usecase.eIsProxy())
    {
      InternalEObject oldUsecase = (InternalEObject)usecase;
      usecase = (UseCase)eResolveProxy(oldUsecase);
      if (usecase != oldUsecase)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.UC_EXTENDS__USECASE, oldUsecase, usecase));
      }
    }
    return usecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase basicGetUsecase()
  {
    return usecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsecase(UseCase newUsecase)
  {
    UseCase oldUsecase = usecase;
    usecase = newUsecase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.UC_EXTENDS__USECASE, oldUsecase, usecase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCExtensionPoint getExtensionPoint()
  {
    if (extensionPoint != null && extensionPoint.eIsProxy())
    {
      InternalEObject oldExtensionPoint = (InternalEObject)extensionPoint;
      extensionPoint = (UCExtensionPoint)eResolveProxy(oldExtensionPoint);
      if (extensionPoint != oldExtensionPoint)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.UC_EXTENDS__EXTENSION_POINT, oldExtensionPoint, extensionPoint));
      }
    }
    return extensionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCExtensionPoint basicGetExtensionPoint()
  {
    return extensionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtensionPoint(UCExtensionPoint newExtensionPoint)
  {
    UCExtensionPoint oldExtensionPoint = extensionPoint;
    extensionPoint = newExtensionPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.UC_EXTENDS__EXTENSION_POINT, oldExtensionPoint, extensionPoint));
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
      case RslPackage.UC_EXTENDS__USECASE:
        if (resolve) return getUsecase();
        return basicGetUsecase();
      case RslPackage.UC_EXTENDS__EXTENSION_POINT:
        if (resolve) return getExtensionPoint();
        return basicGetExtensionPoint();
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
      case RslPackage.UC_EXTENDS__USECASE:
        setUsecase((UseCase)newValue);
        return;
      case RslPackage.UC_EXTENDS__EXTENSION_POINT:
        setExtensionPoint((UCExtensionPoint)newValue);
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
      case RslPackage.UC_EXTENDS__USECASE:
        setUsecase((UseCase)null);
        return;
      case RslPackage.UC_EXTENDS__EXTENSION_POINT:
        setExtensionPoint((UCExtensionPoint)null);
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
      case RslPackage.UC_EXTENDS__USECASE:
        return usecase != null;
      case RslPackage.UC_EXTENDS__EXTENSION_POINT:
        return extensionPoint != null;
    }
    return super.eIsSet(featureID);
  }

} //UCExtendsImpl
