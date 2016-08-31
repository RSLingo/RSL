/**
 */
package rslingo.rsl.rsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rsl.rsl.Attribute;
import rslingo.rsl.rsl.Check;
import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.EntityType;
import rslingo.rsl.rsl.ForeignKey;
import rslingo.rsl.rsl.PrimaryKey;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getChecks <em>Checks</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.EntityImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
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
  protected static final EntityType TYPE_EDEFAULT = EntityType.PRINCIPAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EntityType type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected Entity super_;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryKey()
   * @generated
   * @ordered
   */
  protected PrimaryKey primaryKey;

  /**
   * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignKeys()
   * @generated
   * @ordered
   */
  protected EList<ForeignKey> foreignKeys;

  /**
   * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChecks()
   * @generated
   * @ordered
   */
  protected EList<Check> checks;

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
  protected EntityImpl()
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
    return RslPackage.Literals.ENTITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EntityType newType)
  {
    EntityType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ENTITY__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ENTITY__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getSuper()
  {
    if (super_ != null && super_.eIsProxy())
    {
      InternalEObject oldSuper = (InternalEObject)super_;
      super_ = (Entity)eResolveProxy(oldSuper);
      if (super_ != oldSuper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.ENTITY__SUPER, oldSuper, super_));
      }
    }
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSuper()
  {
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(Entity newSuper)
  {
    Entity oldSuper = super_;
    super_ = newSuper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ENTITY__SUPER, oldSuper, super_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RslPackage.ENTITY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey getPrimaryKey()
  {
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs)
  {
    PrimaryKey oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.ENTITY__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryKey(PrimaryKey newPrimaryKey)
  {
    if (newPrimaryKey != primaryKey)
    {
      NotificationChain msgs = null;
      if (primaryKey != null)
        msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.ENTITY__PRIMARY_KEY, null, msgs);
      if (newPrimaryKey != null)
        msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.ENTITY__PRIMARY_KEY, null, msgs);
      msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ENTITY__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ForeignKey> getForeignKeys()
  {
    if (foreignKeys == null)
    {
      foreignKeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, RslPackage.ENTITY__FOREIGN_KEYS);
    }
    return foreignKeys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Check> getChecks()
  {
    if (checks == null)
    {
      checks = new EObjectContainmentEList<Check>(Check.class, this, RslPackage.ENTITY__CHECKS);
    }
    return checks;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ENTITY__DESCRIPTION, oldDescription, description));
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
      case RslPackage.ENTITY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case RslPackage.ENTITY__PRIMARY_KEY:
        return basicSetPrimaryKey(null, msgs);
      case RslPackage.ENTITY__FOREIGN_KEYS:
        return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
      case RslPackage.ENTITY__CHECKS:
        return ((InternalEList<?>)getChecks()).basicRemove(otherEnd, msgs);
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
      case RslPackage.ENTITY__NAME:
        return getName();
      case RslPackage.ENTITY__TYPE:
        return getType();
      case RslPackage.ENTITY__NAME_ALIAS:
        return getNameAlias();
      case RslPackage.ENTITY__SUPER:
        if (resolve) return getSuper();
        return basicGetSuper();
      case RslPackage.ENTITY__ATTRIBUTES:
        return getAttributes();
      case RslPackage.ENTITY__PRIMARY_KEY:
        return getPrimaryKey();
      case RslPackage.ENTITY__FOREIGN_KEYS:
        return getForeignKeys();
      case RslPackage.ENTITY__CHECKS:
        return getChecks();
      case RslPackage.ENTITY__DESCRIPTION:
        return getDescription();
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
      case RslPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case RslPackage.ENTITY__TYPE:
        setType((EntityType)newValue);
        return;
      case RslPackage.ENTITY__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RslPackage.ENTITY__SUPER:
        setSuper((Entity)newValue);
        return;
      case RslPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case RslPackage.ENTITY__PRIMARY_KEY:
        setPrimaryKey((PrimaryKey)newValue);
        return;
      case RslPackage.ENTITY__FOREIGN_KEYS:
        getForeignKeys().clear();
        getForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
        return;
      case RslPackage.ENTITY__CHECKS:
        getChecks().clear();
        getChecks().addAll((Collection<? extends Check>)newValue);
        return;
      case RslPackage.ENTITY__DESCRIPTION:
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
      case RslPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.ENTITY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.ENTITY__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RslPackage.ENTITY__SUPER:
        setSuper((Entity)null);
        return;
      case RslPackage.ENTITY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case RslPackage.ENTITY__PRIMARY_KEY:
        setPrimaryKey((PrimaryKey)null);
        return;
      case RslPackage.ENTITY__FOREIGN_KEYS:
        getForeignKeys().clear();
        return;
      case RslPackage.ENTITY__CHECKS:
        getChecks().clear();
        return;
      case RslPackage.ENTITY__DESCRIPTION:
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
      case RslPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.ENTITY__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.ENTITY__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RslPackage.ENTITY__SUPER:
        return super_ != null;
      case RslPackage.ENTITY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case RslPackage.ENTITY__PRIMARY_KEY:
        return primaryKey != null;
      case RslPackage.ENTITY__FOREIGN_KEYS:
        return foreignKeys != null && !foreignKeys.isEmpty();
      case RslPackage.ENTITY__CHECKS:
        return checks != null && !checks.isEmpty();
      case RslPackage.ENTITY__DESCRIPTION:
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
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
