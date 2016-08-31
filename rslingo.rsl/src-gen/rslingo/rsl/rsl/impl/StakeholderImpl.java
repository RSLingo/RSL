/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.Stakeholder;
import rslingo.rsl.rsl.StakeholderCategory;
import rslingo.rsl.rsl.StakeholderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.StakeholderImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StakeholderImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StakeholderImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StakeholderImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StakeholderImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StakeholderImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StakeholderImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderImpl extends MinimalEObjectImpl.Container implements Stakeholder
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
  protected static final StakeholderType TYPE_EDEFAULT = StakeholderType.ORGANIZATION;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected StakeholderType type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected static final StakeholderCategory CATEGORY_EDEFAULT = StakeholderCategory.BUSINESS;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected StakeholderCategory category = CATEGORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected Stakeholder super_;

  /**
   * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartOf()
   * @generated
   * @ordered
   */
  protected Stakeholder partOf;

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
  protected StakeholderImpl()
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
    return RslPackage.Literals.STAKEHOLDER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STAKEHOLDER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StakeholderType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(StakeholderType newType)
  {
    StakeholderType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STAKEHOLDER__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STAKEHOLDER__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StakeholderCategory getCategory()
  {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(StakeholderCategory newCategory)
  {
    StakeholderCategory oldCategory = category;
    category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STAKEHOLDER__CATEGORY, oldCategory, category));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder getSuper()
  {
    if (super_ != null && super_.eIsProxy())
    {
      InternalEObject oldSuper = (InternalEObject)super_;
      super_ = (Stakeholder)eResolveProxy(oldSuper);
      if (super_ != oldSuper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.STAKEHOLDER__SUPER, oldSuper, super_));
      }
    }
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder basicGetSuper()
  {
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(Stakeholder newSuper)
  {
    Stakeholder oldSuper = super_;
    super_ = newSuper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STAKEHOLDER__SUPER, oldSuper, super_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder getPartOf()
  {
    if (partOf != null && partOf.eIsProxy())
    {
      InternalEObject oldPartOf = (InternalEObject)partOf;
      partOf = (Stakeholder)eResolveProxy(oldPartOf);
      if (partOf != oldPartOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.STAKEHOLDER__PART_OF, oldPartOf, partOf));
      }
    }
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder basicGetPartOf()
  {
    return partOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartOf(Stakeholder newPartOf)
  {
    Stakeholder oldPartOf = partOf;
    partOf = newPartOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STAKEHOLDER__PART_OF, oldPartOf, partOf));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STAKEHOLDER__DESCRIPTION, oldDescription, description));
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
      case RslPackage.STAKEHOLDER__NAME:
        return getName();
      case RslPackage.STAKEHOLDER__TYPE:
        return getType();
      case RslPackage.STAKEHOLDER__NAME_ALIAS:
        return getNameAlias();
      case RslPackage.STAKEHOLDER__CATEGORY:
        return getCategory();
      case RslPackage.STAKEHOLDER__SUPER:
        if (resolve) return getSuper();
        return basicGetSuper();
      case RslPackage.STAKEHOLDER__PART_OF:
        if (resolve) return getPartOf();
        return basicGetPartOf();
      case RslPackage.STAKEHOLDER__DESCRIPTION:
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
      case RslPackage.STAKEHOLDER__NAME:
        setName((String)newValue);
        return;
      case RslPackage.STAKEHOLDER__TYPE:
        setType((StakeholderType)newValue);
        return;
      case RslPackage.STAKEHOLDER__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RslPackage.STAKEHOLDER__CATEGORY:
        setCategory((StakeholderCategory)newValue);
        return;
      case RslPackage.STAKEHOLDER__SUPER:
        setSuper((Stakeholder)newValue);
        return;
      case RslPackage.STAKEHOLDER__PART_OF:
        setPartOf((Stakeholder)newValue);
        return;
      case RslPackage.STAKEHOLDER__DESCRIPTION:
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
      case RslPackage.STAKEHOLDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.STAKEHOLDER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.STAKEHOLDER__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RslPackage.STAKEHOLDER__CATEGORY:
        setCategory(CATEGORY_EDEFAULT);
        return;
      case RslPackage.STAKEHOLDER__SUPER:
        setSuper((Stakeholder)null);
        return;
      case RslPackage.STAKEHOLDER__PART_OF:
        setPartOf((Stakeholder)null);
        return;
      case RslPackage.STAKEHOLDER__DESCRIPTION:
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
      case RslPackage.STAKEHOLDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.STAKEHOLDER__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.STAKEHOLDER__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RslPackage.STAKEHOLDER__CATEGORY:
        return category != CATEGORY_EDEFAULT;
      case RslPackage.STAKEHOLDER__SUPER:
        return super_ != null;
      case RslPackage.STAKEHOLDER__PART_OF:
        return partOf != null;
      case RslPackage.STAKEHOLDER__DESCRIPTION:
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
    result.append(", category: ");
    result.append(category);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //StakeholderImpl
