/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.RefUCAction;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.UCAction;
import rslingo.rsl.rsl.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref UC Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.RefUCActionImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.RefUCActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefUCActionImpl extends MinimalEObjectImpl.Container implements RefUCAction
{
  /**
   * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseCase()
   * @generated
   * @ordered
   */
  protected UseCase useCase;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected UCAction action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefUCActionImpl()
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
    return RslPackage.Literals.REF_UC_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase getUseCase()
  {
    if (useCase != null && useCase.eIsProxy())
    {
      InternalEObject oldUseCase = (InternalEObject)useCase;
      useCase = (UseCase)eResolveProxy(oldUseCase);
      if (useCase != oldUseCase)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.REF_UC_ACTION__USE_CASE, oldUseCase, useCase));
      }
    }
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase basicGetUseCase()
  {
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseCase(UseCase newUseCase)
  {
    UseCase oldUseCase = useCase;
    useCase = newUseCase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.REF_UC_ACTION__USE_CASE, oldUseCase, useCase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCAction getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (UCAction)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.REF_UC_ACTION__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCAction basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(UCAction newAction)
  {
    UCAction oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.REF_UC_ACTION__ACTION, oldAction, action));
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
      case RslPackage.REF_UC_ACTION__USE_CASE:
        if (resolve) return getUseCase();
        return basicGetUseCase();
      case RslPackage.REF_UC_ACTION__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
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
      case RslPackage.REF_UC_ACTION__USE_CASE:
        setUseCase((UseCase)newValue);
        return;
      case RslPackage.REF_UC_ACTION__ACTION:
        setAction((UCAction)newValue);
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
      case RslPackage.REF_UC_ACTION__USE_CASE:
        setUseCase((UseCase)null);
        return;
      case RslPackage.REF_UC_ACTION__ACTION:
        setAction((UCAction)null);
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
      case RslPackage.REF_UC_ACTION__USE_CASE:
        return useCase != null;
      case RslPackage.REF_UC_ACTION__ACTION:
        return action != null;
    }
    return super.eIsSet(featureID);
  }

} //RefUCActionImpl
