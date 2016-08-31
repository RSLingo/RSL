/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getSystem <em>System</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getRequirementRelations <em>Requirement Relations</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageSystem#getSystemRelations <em>System Relations</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getPackageSystem()
 * @model
 * @generated
 */
public interface PackageSystem extends PackageAbstract
{
  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(rslingo.rsl.rsl.System)
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_System()
   * @model containment="true"
   * @generated
   */
  rslingo.rsl.rsl.System getSystem();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.PackageSystem#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(rslingo.rsl.rsl.System value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Business Entities</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.BusinessEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Entities</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_BusinessEntities()
   * @model containment="true"
   * @generated
   */
  EList<BusinessEntity> getBusinessEntities();

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_Requirements()
   * @model containment="true"
   * @generated
   */
  EList<Requirement> getRequirements();

  /**
   * Returns the value of the '<em><b>State Machine</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.StateMachine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Machine</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Machine</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_StateMachine()
   * @model containment="true"
   * @generated
   */
  EList<StateMachine> getStateMachine();

  /**
   * Returns the value of the '<em><b>Requirement Relations</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.RequirementRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirement Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement Relations</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_RequirementRelations()
   * @model containment="true"
   * @generated
   */
  EList<RequirementRelation> getRequirementRelations();

  /**
   * Returns the value of the '<em><b>System Relations</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.SystemRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Relations</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageSystem_SystemRelations()
   * @model containment="true"
   * @generated
   */
  EList<SystemRelation> getSystemRelations();

} // PackageSystem
