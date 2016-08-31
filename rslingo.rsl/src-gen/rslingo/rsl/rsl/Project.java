/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Project#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getDomain <em>Domain</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getPlanned <em>Planned</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getActual <em>Actual</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getProgress <em>Progress</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getSummary <em>Summary</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Project#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.ProjectType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.ProjectType
   * @see #setType(ProjectType)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Type()
   * @model
   * @generated
   */
  ProjectType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.ProjectType
   * @see #getType()
   * @generated
   */
  void setType(ProjectType value);

  /**
   * Returns the value of the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Alias</em>' attribute.
   * @see #setNameAlias(String)
   * @see rslingo.rsl.rsl.RslPackage#getProject_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Domain</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.ProjectDomain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' attribute.
   * @see rslingo.rsl.rsl.ProjectDomain
   * @see #setDomain(ProjectDomain)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Domain()
   * @model
   * @generated
   */
  ProjectDomain getDomain();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getDomain <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' attribute.
   * @see rslingo.rsl.rsl.ProjectDomain
   * @see #getDomain()
   * @generated
   */
  void setDomain(ProjectDomain value);

  /**
   * Returns the value of the '<em><b>Planned</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Planned</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Planned</em>' containment reference.
   * @see #setPlanned(PlannedSchedule)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Planned()
   * @model containment="true"
   * @generated
   */
  PlannedSchedule getPlanned();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getPlanned <em>Planned</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Planned</em>' containment reference.
   * @see #getPlanned()
   * @generated
   */
  void setPlanned(PlannedSchedule value);

  /**
   * Returns the value of the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' containment reference.
   * @see #setActual(ActualSchedule)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Actual()
   * @model containment="true"
   * @generated
   */
  ActualSchedule getActual();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getActual <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual</em>' containment reference.
   * @see #getActual()
   * @generated
   */
  void setActual(ActualSchedule value);

  /**
   * Returns the value of the '<em><b>Organizations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organizations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organizations</em>' containment reference.
   * @see #setOrganizations(Organizations)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Organizations()
   * @model containment="true"
   * @generated
   */
  Organizations getOrganizations();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getOrganizations <em>Organizations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organizations</em>' containment reference.
   * @see #getOrganizations()
   * @generated
   */
  void setOrganizations(Organizations value);

  /**
   * Returns the value of the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Progress</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Progress</em>' containment reference.
   * @see #setProgress(Progress)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Progress()
   * @model containment="true"
   * @generated
   */
  Progress getProgress();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getProgress <em>Progress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Progress</em>' containment reference.
   * @see #getProgress()
   * @generated
   */
  void setProgress(Progress value);

  /**
   * Returns the value of the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' attribute.
   * @see #setSummary(String)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Summary()
   * @model
   * @generated
   */
  String getSummary();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getSummary <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' attribute.
   * @see #getSummary()
   * @generated
   */
  void setSummary(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rsl.rsl.RslPackage#getProject_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Project#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Project
