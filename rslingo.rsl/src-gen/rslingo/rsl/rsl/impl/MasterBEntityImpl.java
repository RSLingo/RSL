/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.MasterBEntity;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master BEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.MasterBEntityImpl#getMasterEntity <em>Master Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MasterBEntityImpl extends MinimalEObjectImpl.Container implements MasterBEntity
{
  /**
   * The cached value of the '{@link #getMasterEntity() <em>Master Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasterEntity()
   * @generated
   * @ordered
   */
  protected Entity masterEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MasterBEntityImpl()
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
    return RslPackage.Literals.MASTER_BENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getMasterEntity()
  {
    if (masterEntity != null && masterEntity.eIsProxy())
    {
      InternalEObject oldMasterEntity = (InternalEObject)masterEntity;
      masterEntity = (Entity)eResolveProxy(oldMasterEntity);
      if (masterEntity != oldMasterEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.MASTER_BENTITY__MASTER_ENTITY, oldMasterEntity, masterEntity));
      }
    }
    return masterEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetMasterEntity()
  {
    return masterEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMasterEntity(Entity newMasterEntity)
  {
    Entity oldMasterEntity = masterEntity;
    masterEntity = newMasterEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.MASTER_BENTITY__MASTER_ENTITY, oldMasterEntity, masterEntity));
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
      case RslPackage.MASTER_BENTITY__MASTER_ENTITY:
        if (resolve) return getMasterEntity();
        return basicGetMasterEntity();
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
      case RslPackage.MASTER_BENTITY__MASTER_ENTITY:
        setMasterEntity((Entity)newValue);
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
      case RslPackage.MASTER_BENTITY__MASTER_ENTITY:
        setMasterEntity((Entity)null);
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
      case RslPackage.MASTER_BENTITY__MASTER_ENTITY:
        return masterEntity != null;
    }
    return super.eIsSet(featureID);
  }

} //MasterBEntityImpl
