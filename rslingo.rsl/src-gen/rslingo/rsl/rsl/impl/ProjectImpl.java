/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.ActualSchedule;
import rslingo.rsl.rsl.Organizations;
import rslingo.rsl.rsl.PlannedSchedule;
import rslingo.rsl.rsl.Progress;
import rslingo.rsl.rsl.Project;
import rslingo.rsl.rsl.ProjectDomain;
import rslingo.rsl.rsl.ProjectType;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getPlanned <em>Planned</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project
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
  protected static final ProjectType TYPE_EDEFAULT = ProjectType.DEVELOPMENT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ProjectType type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected static final ProjectDomain DOMAIN_EDEFAULT = ProjectDomain.PUBLIC_SECTOR;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected ProjectDomain domain = DOMAIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlanned() <em>Planned</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanned()
   * @generated
   * @ordered
   */
  protected PlannedSchedule planned;

  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected ActualSchedule actual;

  /**
   * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizations()
   * @generated
   * @ordered
   */
  protected Organizations organizations;

  /**
   * The cached value of the '{@link #getProgress() <em>Progress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgress()
   * @generated
   * @ordered
   */
  protected Progress progress;

  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

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
  protected ProjectImpl()
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
    return RslPackage.Literals.PROJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ProjectType newType)
  {
    ProjectType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectDomain getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(ProjectDomain newDomain)
  {
    ProjectDomain oldDomain = domain;
    domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__DOMAIN, oldDomain, domain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedSchedule getPlanned()
  {
    return planned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlanned(PlannedSchedule newPlanned, NotificationChain msgs)
  {
    PlannedSchedule oldPlanned = planned;
    planned = newPlanned;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__PLANNED, oldPlanned, newPlanned);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlanned(PlannedSchedule newPlanned)
  {
    if (newPlanned != planned)
    {
      NotificationChain msgs = null;
      if (planned != null)
        msgs = ((InternalEObject)planned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__PLANNED, null, msgs);
      if (newPlanned != null)
        msgs = ((InternalEObject)newPlanned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__PLANNED, null, msgs);
      msgs = basicSetPlanned(newPlanned, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__PLANNED, newPlanned, newPlanned));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualSchedule getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(ActualSchedule newActual, NotificationChain msgs)
  {
    ActualSchedule oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__ACTUAL, oldActual, newActual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual(ActualSchedule newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__ACTUAL, newActual, newActual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organizations getOrganizations()
  {
    return organizations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrganizations(Organizations newOrganizations, NotificationChain msgs)
  {
    Organizations oldOrganizations = organizations;
    organizations = newOrganizations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__ORGANIZATIONS, oldOrganizations, newOrganizations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganizations(Organizations newOrganizations)
  {
    if (newOrganizations != organizations)
    {
      NotificationChain msgs = null;
      if (organizations != null)
        msgs = ((InternalEObject)organizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__ORGANIZATIONS, null, msgs);
      if (newOrganizations != null)
        msgs = ((InternalEObject)newOrganizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__ORGANIZATIONS, null, msgs);
      msgs = basicSetOrganizations(newOrganizations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__ORGANIZATIONS, newOrganizations, newOrganizations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Progress getProgress()
  {
    return progress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProgress(Progress newProgress, NotificationChain msgs)
  {
    Progress oldProgress = progress;
    progress = newProgress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__PROGRESS, oldProgress, newProgress);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProgress(Progress newProgress)
  {
    if (newProgress != progress)
    {
      NotificationChain msgs = null;
      if (progress != null)
        msgs = ((InternalEObject)progress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__PROGRESS, null, msgs);
      if (newProgress != null)
        msgs = ((InternalEObject)newProgress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.PROJECT__PROGRESS, null, msgs);
      msgs = basicSetProgress(newProgress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__PROGRESS, newProgress, newProgress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__SUMMARY, oldSummary, summary));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PROJECT__DESCRIPTION, oldDescription, description));
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
      case RslPackage.PROJECT__PLANNED:
        return basicSetPlanned(null, msgs);
      case RslPackage.PROJECT__ACTUAL:
        return basicSetActual(null, msgs);
      case RslPackage.PROJECT__ORGANIZATIONS:
        return basicSetOrganizations(null, msgs);
      case RslPackage.PROJECT__PROGRESS:
        return basicSetProgress(null, msgs);
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
      case RslPackage.PROJECT__NAME:
        return getName();
      case RslPackage.PROJECT__TYPE:
        return getType();
      case RslPackage.PROJECT__NAME_ALIAS:
        return getNameAlias();
      case RslPackage.PROJECT__DOMAIN:
        return getDomain();
      case RslPackage.PROJECT__PLANNED:
        return getPlanned();
      case RslPackage.PROJECT__ACTUAL:
        return getActual();
      case RslPackage.PROJECT__ORGANIZATIONS:
        return getOrganizations();
      case RslPackage.PROJECT__PROGRESS:
        return getProgress();
      case RslPackage.PROJECT__SUMMARY:
        return getSummary();
      case RslPackage.PROJECT__DESCRIPTION:
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
      case RslPackage.PROJECT__NAME:
        setName((String)newValue);
        return;
      case RslPackage.PROJECT__TYPE:
        setType((ProjectType)newValue);
        return;
      case RslPackage.PROJECT__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RslPackage.PROJECT__DOMAIN:
        setDomain((ProjectDomain)newValue);
        return;
      case RslPackage.PROJECT__PLANNED:
        setPlanned((PlannedSchedule)newValue);
        return;
      case RslPackage.PROJECT__ACTUAL:
        setActual((ActualSchedule)newValue);
        return;
      case RslPackage.PROJECT__ORGANIZATIONS:
        setOrganizations((Organizations)newValue);
        return;
      case RslPackage.PROJECT__PROGRESS:
        setProgress((Progress)newValue);
        return;
      case RslPackage.PROJECT__SUMMARY:
        setSummary((String)newValue);
        return;
      case RslPackage.PROJECT__DESCRIPTION:
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
      case RslPackage.PROJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.PROJECT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.PROJECT__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RslPackage.PROJECT__DOMAIN:
        setDomain(DOMAIN_EDEFAULT);
        return;
      case RslPackage.PROJECT__PLANNED:
        setPlanned((PlannedSchedule)null);
        return;
      case RslPackage.PROJECT__ACTUAL:
        setActual((ActualSchedule)null);
        return;
      case RslPackage.PROJECT__ORGANIZATIONS:
        setOrganizations((Organizations)null);
        return;
      case RslPackage.PROJECT__PROGRESS:
        setProgress((Progress)null);
        return;
      case RslPackage.PROJECT__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case RslPackage.PROJECT__DESCRIPTION:
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
      case RslPackage.PROJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.PROJECT__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.PROJECT__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RslPackage.PROJECT__DOMAIN:
        return domain != DOMAIN_EDEFAULT;
      case RslPackage.PROJECT__PLANNED:
        return planned != null;
      case RslPackage.PROJECT__ACTUAL:
        return actual != null;
      case RslPackage.PROJECT__ORGANIZATIONS:
        return organizations != null;
      case RslPackage.PROJECT__PROGRESS:
        return progress != null;
      case RslPackage.PROJECT__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case RslPackage.PROJECT__DESCRIPTION:
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
    result.append(", domain: ");
    result.append(domain);
    result.append(", summary: ");
    result.append(summary);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ProjectImpl
