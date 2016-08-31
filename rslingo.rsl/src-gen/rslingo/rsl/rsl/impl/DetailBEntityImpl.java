/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.DetailBEntity;
import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.RefEntity;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detail BEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.DetailBEntityImpl#getEntityDetail <em>Entity Detail</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.DetailBEntityImpl#getRefEntity <em>Ref Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailBEntityImpl extends MinimalEObjectImpl.Container implements DetailBEntity
{
  /**
   * The cached value of the '{@link #getEntityDetail() <em>Entity Detail</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityDetail()
   * @generated
   * @ordered
   */
  protected Entity entityDetail;

  /**
   * The cached value of the '{@link #getRefEntity() <em>Ref Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEntity()
   * @generated
   * @ordered
   */
  protected RefEntity refEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DetailBEntityImpl()
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
    return RslPackage.Literals.DETAIL_BENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntityDetail()
  {
    if (entityDetail != null && entityDetail.eIsProxy())
    {
      InternalEObject oldEntityDetail = (InternalEObject)entityDetail;
      entityDetail = (Entity)eResolveProxy(oldEntityDetail);
      if (entityDetail != oldEntityDetail)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.DETAIL_BENTITY__ENTITY_DETAIL, oldEntityDetail, entityDetail));
      }
    }
    return entityDetail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntityDetail()
  {
    return entityDetail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityDetail(Entity newEntityDetail)
  {
    Entity oldEntityDetail = entityDetail;
    entityDetail = newEntityDetail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.DETAIL_BENTITY__ENTITY_DETAIL, oldEntityDetail, entityDetail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefEntity getRefEntity()
  {
    return refEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefEntity(RefEntity newRefEntity, NotificationChain msgs)
  {
    RefEntity oldRefEntity = refEntity;
    refEntity = newRefEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.DETAIL_BENTITY__REF_ENTITY, oldRefEntity, newRefEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEntity(RefEntity newRefEntity)
  {
    if (newRefEntity != refEntity)
    {
      NotificationChain msgs = null;
      if (refEntity != null)
        msgs = ((InternalEObject)refEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.DETAIL_BENTITY__REF_ENTITY, null, msgs);
      if (newRefEntity != null)
        msgs = ((InternalEObject)newRefEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.DETAIL_BENTITY__REF_ENTITY, null, msgs);
      msgs = basicSetRefEntity(newRefEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.DETAIL_BENTITY__REF_ENTITY, newRefEntity, newRefEntity));
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
      case RslPackage.DETAIL_BENTITY__REF_ENTITY:
        return basicSetRefEntity(null, msgs);
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
      case RslPackage.DETAIL_BENTITY__ENTITY_DETAIL:
        if (resolve) return getEntityDetail();
        return basicGetEntityDetail();
      case RslPackage.DETAIL_BENTITY__REF_ENTITY:
        return getRefEntity();
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
      case RslPackage.DETAIL_BENTITY__ENTITY_DETAIL:
        setEntityDetail((Entity)newValue);
        return;
      case RslPackage.DETAIL_BENTITY__REF_ENTITY:
        setRefEntity((RefEntity)newValue);
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
      case RslPackage.DETAIL_BENTITY__ENTITY_DETAIL:
        setEntityDetail((Entity)null);
        return;
      case RslPackage.DETAIL_BENTITY__REF_ENTITY:
        setRefEntity((RefEntity)null);
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
      case RslPackage.DETAIL_BENTITY__ENTITY_DETAIL:
        return entityDetail != null;
      case RslPackage.DETAIL_BENTITY__REF_ENTITY:
        return refEntity != null;
    }
    return super.eIsSet(featureID);
  }

} //DetailBEntityImpl
