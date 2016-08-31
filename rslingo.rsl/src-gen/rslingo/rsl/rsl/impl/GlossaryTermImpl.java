/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.GlossaryTerm;
import rslingo.rsl.rsl.RefTermApplication;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.TermType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossary Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.GlossaryTermImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryTermImpl extends MinimalEObjectImpl.Container implements GlossaryTerm
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
  protected static final TermType TYPE_EDEFAULT = TermType.ADJECTIVE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TermType type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected static final String ACRONYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected String acronym = ACRONYM_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected RefTermApplication ref;

  /**
   * The default value of the '{@link #getSynonym() <em>Synonym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSynonym()
   * @generated
   * @ordered
   */
  protected static final String SYNONYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSynonym() <em>Synonym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSynonym()
   * @generated
   * @ordered
   */
  protected String synonym = SYNONYM_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected GlossaryTerm super_;

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
  protected GlossaryTermImpl()
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
    return RslPackage.Literals.GLOSSARY_TERM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TermType newType)
  {
    TermType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcronym()
  {
    return acronym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcronym(String newAcronym)
  {
    String oldAcronym = acronym;
    acronym = newAcronym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__ACRONYM, oldAcronym, acronym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefTermApplication getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(RefTermApplication newRef, NotificationChain msgs)
  {
    RefTermApplication oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(RefTermApplication newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.GLOSSARY_TERM__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.GLOSSARY_TERM__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSynonym()
  {
    return synonym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSynonym(String newSynonym)
  {
    String oldSynonym = synonym;
    synonym = newSynonym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__SYNONYM, oldSynonym, synonym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlossaryTerm getSuper()
  {
    if (super_ != null && super_.eIsProxy())
    {
      InternalEObject oldSuper = (InternalEObject)super_;
      super_ = (GlossaryTerm)eResolveProxy(oldSuper);
      if (super_ != oldSuper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.GLOSSARY_TERM__SUPER, oldSuper, super_));
      }
    }
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlossaryTerm basicGetSuper()
  {
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(GlossaryTerm newSuper)
  {
    GlossaryTerm oldSuper = super_;
    super_ = newSuper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__SUPER, oldSuper, super_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.GLOSSARY_TERM__DESCRIPTION, oldDescription, description));
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
      case RslPackage.GLOSSARY_TERM__REF:
        return basicSetRef(null, msgs);
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
      case RslPackage.GLOSSARY_TERM__NAME:
        return getName();
      case RslPackage.GLOSSARY_TERM__TYPE:
        return getType();
      case RslPackage.GLOSSARY_TERM__NAME_ALIAS:
        return getNameAlias();
      case RslPackage.GLOSSARY_TERM__ACRONYM:
        return getAcronym();
      case RslPackage.GLOSSARY_TERM__REF:
        return getRef();
      case RslPackage.GLOSSARY_TERM__SYNONYM:
        return getSynonym();
      case RslPackage.GLOSSARY_TERM__SUPER:
        if (resolve) return getSuper();
        return basicGetSuper();
      case RslPackage.GLOSSARY_TERM__DESCRIPTION:
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
      case RslPackage.GLOSSARY_TERM__NAME:
        setName((String)newValue);
        return;
      case RslPackage.GLOSSARY_TERM__TYPE:
        setType((TermType)newValue);
        return;
      case RslPackage.GLOSSARY_TERM__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RslPackage.GLOSSARY_TERM__ACRONYM:
        setAcronym((String)newValue);
        return;
      case RslPackage.GLOSSARY_TERM__REF:
        setRef((RefTermApplication)newValue);
        return;
      case RslPackage.GLOSSARY_TERM__SYNONYM:
        setSynonym((String)newValue);
        return;
      case RslPackage.GLOSSARY_TERM__SUPER:
        setSuper((GlossaryTerm)newValue);
        return;
      case RslPackage.GLOSSARY_TERM__DESCRIPTION:
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
      case RslPackage.GLOSSARY_TERM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.GLOSSARY_TERM__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.GLOSSARY_TERM__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RslPackage.GLOSSARY_TERM__ACRONYM:
        setAcronym(ACRONYM_EDEFAULT);
        return;
      case RslPackage.GLOSSARY_TERM__REF:
        setRef((RefTermApplication)null);
        return;
      case RslPackage.GLOSSARY_TERM__SYNONYM:
        setSynonym(SYNONYM_EDEFAULT);
        return;
      case RslPackage.GLOSSARY_TERM__SUPER:
        setSuper((GlossaryTerm)null);
        return;
      case RslPackage.GLOSSARY_TERM__DESCRIPTION:
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
      case RslPackage.GLOSSARY_TERM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.GLOSSARY_TERM__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.GLOSSARY_TERM__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RslPackage.GLOSSARY_TERM__ACRONYM:
        return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
      case RslPackage.GLOSSARY_TERM__REF:
        return ref != null;
      case RslPackage.GLOSSARY_TERM__SYNONYM:
        return SYNONYM_EDEFAULT == null ? synonym != null : !SYNONYM_EDEFAULT.equals(synonym);
      case RslPackage.GLOSSARY_TERM__SUPER:
        return super_ != null;
      case RslPackage.GLOSSARY_TERM__DESCRIPTION:
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
    result.append(", acronym: ");
    result.append(acronym);
    result.append(", synonym: ");
    result.append(synonym);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //GlossaryTermImpl
